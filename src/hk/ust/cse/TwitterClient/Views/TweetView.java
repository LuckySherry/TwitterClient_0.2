package hk.ust.cse.TwitterClient.Views;

import hk.ust.cse.TwitterClient.Utils;
import hk.ust.cse.TwitterClient.Controls.TweetViewControl;
import hk.ust.cse.TwitterClient.Controls.TwitterControl;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.Basic.HoverClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.LinkLabel;
import hk.ust.cse.TwitterClient.Views.Basic.RowComposite;
import hk.ust.cse.TwitterClient.Views.Home.RepliesList;
import hk.ust.cse.TwitterClient.Views.User.UserPage;

import org.eclipse.swt.graphics.Point;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import twitter4j.HashtagEntity;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;

public class TweetView extends RowComposite {
  
 public TweetView(Composite parentView, Status tweet, int width, boolean bigIcon, 
      Color origColor, Color hoverColor, Color clickedColor, String nameClkHandler, Object handlerCallee, boolean isRetweetedByMe,long getCurrentUserRetweetedid, boolean isFavorate) {
    super(parentView, SWT.CENTER, SWT.VERTICAL, false, 0, 0, 0, 0, 0);
    
    m_tweet   = tweet;
    m_user    = tweet.getUser();
    m_control = new TweetViewControl(this);
    m_isRetweetedByMe = isRetweetedByMe;
    m_nameClkHandler = nameClkHandler;
    m_handlerCallee  = handlerCallee; 
    m_getCurrentUserRetweetedid=getCurrentUserRetweetedid;
    m_ifIsFavorated = isFavorate;
    //determine whether it is under user page;
	  Control control = parentView.getParent().getParent();
	m_isUserPage = control instanceof UserPage;
	if(m_isUserPage){
		UserPage u = (UserPage)control;
		m_isUserPage = u.getUser().getId()==TwitterControl.getAccountUser().getId();
	}
    initialize(width, bigIcon, origColor, hoverColor, clickedColor);
    
    // a dispose listener is necessary
    addDisposeListener(new DisposeListener() {
      public void widgetDisposed(DisposeEvent e) {
        TweetView.this.widgetDisposed(e);
      }
    });
  }
  
  private void initialize(int width, boolean bigIcon, Color origColor, Color hoverColor, Color clickedColor) {
	  
	//System.out.println(m_isUserPage);
    // set size
    setSize(width, -1);
    
    // set background color
    setBackground(Resources.WHITE_COLOR);
    setBackgroundMode(SWT.INHERIT_DEFAULT); // make all labels have transparent backgrounds
    
    // set layout of the view
    m_upperFrame = new HoverClickableComposite(this, origColor, hoverColor, clickedColor);
    RowLayout upperFrameLayout = new RowLayout(SWT.HORIZONTAL);
    upperFrameLayout.center       = false;
    upperFrameLayout.marginTop    = 12;
    upperFrameLayout.marginBottom = 12;
    upperFrameLayout.marginLeft   = 12;
    upperFrameLayout.marginRight  = 12;
    upperFrameLayout.spacing      = 5;
    m_upperFrame.setLayout(upperFrameLayout);
    m_upperFrame.setLayoutData(new RowData(width, -1));
    
    // set the icon frame
    m_iconFrame = new RowComposite(m_upperFrame, 0, SWT.HORIZONTAL, false, 0, 0, 0, 0, -1);
    m_iconFrame.setLayoutData(new RowData(48, -1));
    
    // set profile icon
    int iconSize = bigIcon ? 48 : 32;
    m_iconImage = new Label(m_iconFrame, SWT.RIGHT);
    if (m_user.getProfileImageURL() != null) {
      Image m_icon = Utils.loadImageFromUrlAndScale(m_user.getProfileImageURL(), iconSize, iconSize);
      if (m_icon != null) {
        m_iconImage.setImage(m_icon);
      }
    }
    m_iconImage.setLayoutData(new RowData(48, iconSize));
    Utils.addClickListener(m_iconImage, m_nameClkHandler, m_handlerCallee);
    
    // set the right frame
    m_rightFrame = new RowComposite(m_upperFrame, 0, SWT.VERTICAL, false, 0, 0, 5, 5, 3);
    m_rightFrame.setLayoutData(new RowData(getBounds().width - 77, -1));

    // set the right upper frame
    RowComposite rightUpFrame = new RowComposite(m_rightFrame, 0, SWT.HORIZONTAL, false, 0, 0, 0, 0, 0);
    rightUpFrame.setLayoutData(new RowData(getBounds().width - 87, -1));
    
    // set the name frame
    RowComposite nameFrame = new RowComposite(rightUpFrame, 0, SWT.HORIZONTAL, false, 0, 0, 0, 0, 5);
    nameFrame.setLayoutData(new RowData(getBounds().width - 137, -1));
    
    // set the time frame
    RowComposite timeFrame = new RowComposite(rightUpFrame, 0, SWT.HORIZONTAL, false, 0, 0, 0, 0, -1);
    timeFrame.setLayoutData(new RowData(50, -1));
    //////////////
	final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    //wangbo write here for retweet
        Composite downcomposite = new Composite(m_upperFrame, SWT.NONE);        
	    downcomposite.setBounds(187, 49, 100, 109);        
	    
	    label = formToolkit.createLabel(downcomposite, "retweeted", SWT.NONE);
		label.setBounds(375, 5, 70, 17);
	  
	   
		
		//label.setBackground(Resources.GRAY_COLOR);
         retweetNewButton = new Button(downcomposite, SWT.NONE);
	    Utils.addClickListener(retweetNewButton, "retweetgfunction", this);
		retweetNewButton.setBounds(21, 0, 80, 27);
	        
	    if(m_isRetweetedByMe){
			label.setVisible(true);
			retweetNewButton.setText("UNRETWEET");
	    }
		else{
			label.setVisible(false);
			retweetNewButton.setText("RETWEET");
			retweetNewButton.setVisible(!m_isUserPage);
		}
	    //cwk wrote here for reply
	    replyButton = new Button(downcomposite, SWT.NONE);
		Utils.addClickListener(replyButton, "replyFuntion", this);
		replyButton.setBounds(101, 0, 80, 27);
		replyButton.setText("REPLY");	    
	    
		// cwk wrote here for delete
		if (m_isUserPage) {
			deleteButton = new Button(downcomposite, SWT.NONE);
			Utils.addClickListener(deleteButton, "deleteFuntion", this);
			deleteButton.setBounds(21, 0, 80, 27);
			deleteButton.setText("DELETE");
		} 
		
	  //wym wrote here for favorate
	    favorateButton = new Button(downcomposite, SWT.NONE);
	    Utils.addClickListener(favorateButton, "favorateFunction", this);
	    
	    if(!m_ifIsFavorated){
	    	favorateButton.setBounds(181,0,110,27);
	    	 favorateButton.setText("FAVORATE");
	    	 Font font=new Font("dialog",1, 18);
	    	 //favorateButton.setFont(font);  wym: don't know why incompatible 'Font' and 'Font'
	    	 favorateButton.setBackground(Resources.WHITE_COLOR);
	    	 //wym: this is the white heart on the button
	    	 favorateButton.setImage(image1);
	    }
	    else{
	    	favorateButton.setBounds(181,0,130,27);
	    	favorateButton.setText("UN-FAVORATE");
	    	favorateButton.setBackground(new Color(null, 255,0,0));
	    	 //wym: this is the red heart on the button
	    	 favorateButton.setImage(image);
	    }
	    
	    
	    // set name, screen name and time
    m_name = new LinkLabel(nameFrame, 0, 
        Resources.TEXT_COLOR, Resources.LINK_COLOR, Resources.FONT11B, Resources.FONT11B);
    m_name.setText(m_user.getName());
    Utils.addClickListener(m_name, m_nameClkHandler, m_handlerCallee);
    
    m_screenName = new Label(nameFrame, 0);
    m_screenName.setFont(Resources.FONT10);
    m_screenName.setForeground(Resources.GRAY_COLOR);
    m_screenName.setText("@" + m_user.getScreenName());
    
    // calculate and set time
    m_time = new Label(timeFrame, SWT.RIGHT);
    m_time.setFont(Resources.FONT9);
    m_time.setForeground(Resources.GRAY_COLOR);
    m_time.setText(createTimeString(m_tweet.getCreatedAt()));
    m_time.setLayoutData(new RowData(50, -1));
    
    // set text
    m_text = new StyledText(m_rightFrame, SWT.WRAP | SWT.LEFT|SWT.MULTI|SWT.READ_ONLY);
    m_text.setFont(Resources.FONT11);
    m_text.setForeground(Resources.TEXT_COLOR);
    m_text.setText(getDisplayText(m_tweet));
    MygetDisplayText(m_tweet);
    
    m_text.setLayoutData(new RowData(getBounds().width - 87, -1));
    
    Utils.addClickListener(m_upperFrame, "toggleExpand", this);

    layout(); // trigger re-layout
    pack(); // force re-size of height, the width should not be changed
    
//    // cut corner only after layout()
//    Utils.cutRoundCorner(m_iconImage, true, true, true, true);
  } 
  
  /**
   * Bingo modifies the following codes here. Just Further version of recognizing URL, User mention and Hash tag.
   * UI remains to be done...
   */
  private String getDisplayText(Status tweet) {
    String text = tweet.getText();
    URLEntity[] urlEntities = tweet.getURLEntities();
    for (URLEntity urlEntity : urlEntities) {
      text = text.replace(urlEntity.getURL(), urlEntity.getDisplayURL());
    }
    return text;
  }  
  
  private void MygetDisplayText(Status tweet) {
	    String text = tweet.getText();
	    final String CopyText = new String(text);
	    URLEntity[] urlEntities = tweet.getURLEntities();
	    HashtagEntity[] hashTagEntities = tweet.getHashtagEntities();
	    UserMentionEntity[] userMentionEntities = tweet.getUserMentionEntities();
	    int array[] = new int[200];
	    int CheckLength = CopyText.length();
	    int checkingDiff[] = new int[CheckLength];
	    for (int j = 0 ; j < CheckLength; j++)
	    	checkingDiff[j] = 0;
	    	
	    String Highlight[][] = new String[200][2];
	    String Highlight_OriginalText[] = new String[200];
	    int count = 0;
		
	    for (HashtagEntity hashTagEntity : hashTagEntities) {
	    	array[count] = hashTagEntity.getStart();
	    	Highlight[count][0] = Highlight_OriginalText[count] = CopyText.substring(hashTagEntity.getStart(), hashTagEntity.getEnd());
	    	Highlight[count][1] = "1";
	    	count++;
	    }
	    
	    for (UserMentionEntity userMentionEntity : userMentionEntities) {
		    array[count] = userMentionEntity.getStart();
		    Highlight[count][0] = Highlight_OriginalText[count] = CopyText.substring(userMentionEntity.getStart(), userMentionEntity.getEnd());
		    Highlight[count][1] = "2";
		    count++;
		}
	    
	    
	    for (URLEntity urlEntity : urlEntities) {
	    	if (CopyText.indexOf(urlEntity.getURL()) + urlEntity.getURL().length() < CheckLength)
	    		checkingDiff[CopyText.indexOf(urlEntity.getURL()) + urlEntity.getURL().length()] = urlEntity.getURL().length() - urlEntity.getDisplayURL().length();
	    	array[count] = urlEntity.getStart();
	    	text = text.replace(urlEntity.getURL(), urlEntity.getDisplayURL());
	    	Highlight[count][0] = urlEntity.getDisplayURL();
	    	Highlight[count][1] = "3";
	    	Highlight_OriginalText[count] = urlEntity.getURL();
	    	count++;
	    }

	    for (int k = 1 ; k < CheckLength; k++)
	    	checkingDiff[k] += checkingDiff[k - 1];
	    
	    if (count > 0){
	    
	    int[] sortedArray = new int[count];
	    String[] c_string = new String[count];
	    for (int i = 0 ; i < count ; i++)
	    	sortedArray[i] = array[i] - checkingDiff[CopyText.indexOf(Highlight_OriginalText[i])];
	    
	    java.util.Arrays.sort(sortedArray);
	    
	    for (int i = 0 ; i < count ; i++){
	    	for (int j = 0 ; j < count ; j++){
	    		if (sortedArray[i] == array[j] - checkingDiff[CopyText.indexOf(Highlight_OriginalText[j])]){
	    			c_string[i] = Highlight[j][0];
	    			break;
	    		}
	    	}
	    }
	    	
	    
	    StyleRange style = new StyleRange();
	    style.underline = true;
		style.underlineStyle = SWT.UNDERLINE_LINK;
		
	    
	    int[] ranges = new int[count * 2];
		int ranges_size_count = 0;
		StyleRange[] styles = new StyleRange[count];
		int StyleRange_size_count = 0;
		
	    
	    for (int i = 0 ; i < count ; i++){
	    	ranges[ranges_size_count] = sortedArray[i];
	    	ranges_size_count++;
	    	ranges[ranges_size_count] = c_string[i].length();
	    	ranges_size_count++;
	    	styles[StyleRange_size_count] = style;
	    	StyleRange_size_count++;
	    }
	    
	    TV_count = count;
	    TV_array = new int[count];
	    TV_array = array;
	    TV_Highlight = new String[count][2];
	    TV_Highlight = Highlight;
	    TV_Highlight_OriginalText = new String[count];
	    TV_Highlight_OriginalText = Highlight_OriginalText;
	    TV_checkingDiff = new int[count];
	    TV_checkingDiff = checkingDiff;
	    
	    m_text.setStyleRanges(ranges, styles);
		m_text.addListener(SWT.MouseDown, new Listener(){
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub
//				if ((event.stateMask & SWT.MOD1) != 0) {
					try {				
						int offset = m_text.getOffsetAtLocation(new Point(event.x, event.y));
						StyleRange style = m_text.getStyleRangeAtOffset(offset);
						String type = "0";
						
						if (style != null && style.underline && style.underlineStyle == SWT.UNDERLINE_LINK){
							String highlight = "";
							for (int i = 0 ; i < TV_count ; i++){
								if (offset >= TV_array[i] - TV_checkingDiff[CopyText.indexOf(TV_Highlight_OriginalText[i])]
										&& offset <=  TV_array[i] - TV_checkingDiff[CopyText.indexOf(TV_Highlight_OriginalText[i])] + TV_Highlight[i][0].length()){
									highlight = TV_Highlight_OriginalText[i];
									type = TV_Highlight[i][1];
									break;
								}
							}
							if (type.equals("1"))
								MyopenWebpage(new URL("https://twitter.com/search?q=%23" + highlight.substring(1) + "&src=hash"));
							else if (type.equals("2")){
								Object o = m_upperFrame; 
								while (o != null){
									if (((Control) o).getParent() instanceof WholePage){
										o = ((Control) o).getParent();
										break;
									}
									o = ((Control) o).getParent();
								}
								if (o != null){
									WholePage wholepage = (WholePage) o;
									User referenceUser = TwitterControl.getTwitter().showUser(highlight.substring(1));
									wholepage.gotoUserPage(referenceUser);
								} 
							}
							else if (type.equals("3"))
								MyopenWebpage(new URL(highlight));
							else;//error handling here
						}
					} catch (IllegalArgumentException | MalformedURLException | TwitterException e) {
						// no character under event.x, event.y
					} 
				}
//			}
		});
	    
	 }
  }

public static void openWebpage(URI uri) {
	Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
		try {
			desktop.browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public static void openWebpage(URL url) {
	try {
		openWebpage(url.toURI());
	} catch (URISyntaxException e) {
		e.printStackTrace();
	}
}

public static void MyopenWebpage(URL url){
	if(!java.awt.Desktop.isDesktopSupported() ) {
        System.err.println( "Desktop is not supported (fatal)" );
        System.exit(1);
    }
	
    java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
    
    if(!desktop.isSupported( java.awt.Desktop.Action.BROWSE ) ) {
        System.err.println( "Desktop doesn't support the browse action (fatal)" );
        System.exit(1);
    }
    
    try {
        desktop.browse(url.toURI());
    }catch (Exception e){
    	System.err.println( e.getMessage() );
    }
}

  
  
  //wangbo write here for retweet
  //Need further discussion. -xwangau
  public void retweetgfunction(MouseEvent arg) throws TwitterException{
	//	boolean isRTByMe = (m_tweet.getCurrentUserRetweetId() != -1L);
	//    System.out.println(isRTByMe);
	  
	 if(!m_isRetweetedByMe)
	 {
		 label.setVisible(true);
      m_getCurrentUserRetweetedid=TwitterControl.getTwitter().retweetStatus(m_tweet.getId()).getId();
     	m_isRetweetedByMe = true;
     	retweetNewButton.setText("UNRETWEET");
     	retweetNewButton.update();
	  }
	 else{
		 
		// m_isRetweetedByMe=false;
		// 
		/*Shell shell = new Shell(SWT.SHELL_TRIM);
		 shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		 Label lblNewLabel = new Label(shell, SWT.WRAP | SWT.CENTER);
			lblNewLabel.setFont(SWTResourceManager.getFont("Î¢ÈíÑÅºÚ", 14, SWT.NORMAL));
			lblNewLabel.setText("Already retweeted by you!Do you want to unretweet?");
			shell.setText("Warning!!");
			shell.setSize(258, 180);
			shell.open();
		    shell.layout();*/
		    if(!m_isUserPage){
		    	//System.out.println(m_tweet.getId());
		    	//System.out.println(m_tweet.getCurrentUserRetweetId());
		    	//System.out.println(m_getCurrentUserRetweetedid);
		    	TwitterControl.getTwitter().destroyStatus(m_getCurrentUserRetweetedid);
		    	retweetNewButton.setText("RETWEET");
		    	label.setVisible(false);
		    }
		    else{
		    	//System.out.println(m_tweet.getId());
		    	//System.out.println(m_tweet.getCurrentUserRetweetId());
		    	TwitterControl.getTwitter().destroyStatus(m_getCurrentUserRetweetedid);
		    	retweetNewButton.setText("RETWEET");
		    	label.setVisible(false);
		    }
		    m_isRetweetedByMe = false;
		    layout();
//	TwitterControl.getTwitter().destroyStatus(m_tweet.getCurrentUserRetweetId());
			

	 }	 
  }
  
  //cwk "write" this part, for reply
  public void replyFuntion(MouseEvent arg) throws TwitterException{
	  UserMentionEntity[] u1 = m_tweet.getUserMentionEntities();
		String tempUserName = "@";
		tempUserName += m_tweet.getUser().getScreenName();
		System.out.println(tempUserName);
		tempUserName += " ";
		for (UserMentionEntity u : u1) {
			if(!u.getScreenName().equals(TwitterControl.getAccountUser().getScreenName())){
			tempUserName += "@";
			tempUserName += u.getScreenName();
			tempUserName += " ";
			}
		}
		/***************xwangau Reply Design************************/
		
		shlReplyTo = new Shell();
		shlReplyTo.setSize(300, 172);
		shlReplyTo.setText("Reply To "+m_tweet.getUser().getName());
		shlReplyTo.open();
		final Button btnNewButton = new Button(shlReplyTo, SWT.NONE);
		
		btnNewButton.setBounds(10, 103, 80, 27);
		btnNewButton.setText("Reply");
		
		Button btnNewButton_1 = new Button(shlReplyTo, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				shlReplyTo.dispose();
			}
		});
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(112, 103, 80, 27);
		btnNewButton_1.setText("Cancel");
		
		styledText = new StyledText(shlReplyTo, SWT.WRAP);
		styledText.setFont(SWTResourceManager.getFont("Arial", 14, SWT.NORMAL));
		styledText.setBounds(10, 10, 264, 87);
		styledText.setText(tempUserName);
		styledText.setStyleRange(getColorStyle(0, tempUserName.length(), Resources.At_COLOR));
		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				StatusUpdate stat = new StatusUpdate(styledText.getText());
				stat.setInReplyToStatusId(m_tweet.getId());
				try {
					TwitterControl.getTwitter().updateStatus(stat);
					displaySucessWindow();
				} catch (TwitterException e) {
					// TODO Auto-generated catch block
					Shell errShell = new Shell();
					errShell.setSize(300, 172);
					errShell.setText("ERROR!!!!!!!!!!!!!!!!!");
					errShell.setLayout(new FillLayout(SWT.HORIZONTAL));
					
					Label errLabel = new Label(errShell, SWT.WRAP);
					errLabel.setText(e.getErrorMessage());
					errShell.open();
				}
			}
		});
		
		final Label lblNewLabel = new Label(shlReplyTo, SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Vivaldi", 14, SWT.NORMAL));
		lblNewLabel.setBounds(214, 104, 60, 27);
		lblNewLabel.setText(Integer.toString(140-styledText.getCharCount()));
		
		styledText.addModifyListener(new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent arg0) {
				// TODO Auto-generated method stub
				lblNewLabel.setText(Integer.toString(140-styledText.getCharCount()));
				if(140-styledText.getCharCount()<0){
					lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));	
					btnNewButton.setEnabled(false);
				}
				else {
					lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
					btnNewButton.setEnabled(true);
				}
				lblNewLabel.update();
				btnNewButton.update();
				}
			});
		
		
		/************************************************/		
  }
  
//cwk "write" this funtion for delete
	public void deleteFuntion(MouseEvent arg) throws TwitterException {
		
		displaySucessWindow2();
	}
  
  //wym wrote this part for favorate
  public void favorateFunction(MouseEvent arg) throws TwitterException{
	 
	  if(!m_ifIsFavorated){
	  m_ifIsFavorated = true;
	  TwitterControl.getTwitter().createFavorite(m_tweet.getId()).getId();
	  favorateButton.setBackground(new Color(null, 255,0,0));
	  favorateButton.setBounds(181,0,130,27);
	  favorateButton.setText("UN-FAVORATE");
	  favorateButton.setImage(image);
	  }
	  else{
		  m_ifIsFavorated = false;
		  TwitterControl.getTwitter().destroyFavorite(m_tweet.getId());
		  favorateButton.setBackground(Resources.WHITE_COLOR);
		  favorateButton.setBounds(181,0,110,27);
		  favorateButton.setImage(image1);
		  favorateButton.setText("FAVORATE");
	  }
  }
  	 
  	 
  public void toggleExpand(MouseEvent arg) {
    if (m_numberBar == null) { // currently collapsed
      // we cannot expend here, as we need to wait for replies asynchronously
      TwitterControl.getReplies(m_tweet, "getRepliesCallback", m_control);
    }
    else {
      Utils.dispose(m_extendFrame);
      Utils.dispose(m_repliesFrame);
      m_numberBar    = null;
      m_detailTime   = null;
      m_repliesView  = null;
      m_extendFrame  = null;
      m_repliesFrame = null;
      m_upperFrame.setNotClicked();
      
      layout();
      pack();
    }
  }
  
  public void showReplies(List<Status> replies) {
    m_extendFrame = new RowComposite(m_rightFrame, 0, SWT.VERTICAL, false, 5, 0, 0, 0, 10);
    m_extendFrame.setLayoutData(new RowData(m_rightFrame.getBounds().width, -1));

    long[] numbers = new long[] {m_tweet.getRetweetCount(), replies.size()};
    String[] titles = {"RETWEETS", "REPLIES"};
    if (TweetView.this.getParent() instanceof RepliesList) {
          m_numberBar = new NumberBar(m_extendFrame, numbers, titles, 
          m_rightFrame.getBounds().width, 90, 48, Resources.HOVER_COLOR, Resources.HOVER_COLOR, 
          Resources.HOVER_COLOR, Resources.FONT11B, Resources.FONT8, true, null, null);
    }
    else {
      m_numberBar = new NumberBar(m_extendFrame, numbers, titles, 
          m_rightFrame.getBounds().width, 90, 48, Resources.WHITE_COLOR, Resources.HOVER_COLOR, 
          Resources.WHITE_COLOR, Resources.FONT11B, Resources.FONT8, true, null, null);
    }
    
    m_detailTime = new Label(m_extendFrame, SWT.LEFT);
    m_detailTime.setFont(Resources.FONT9);
    m_detailTime.setForeground(Resources.GRAY_COLOR);
    m_detailTime.setText("    " + createDetailTimeString(m_tweet.getCreatedAt()));

    if (!(TweetView.this.getParent() instanceof RepliesList) && replies.size() > 0) {
      m_repliesFrame = new RowComposite(TweetView.this, 0, SWT.VERTICAL, false, 1, 0, 0, 0, 1);
      m_repliesFrame.setBackground(Resources.SPLIT_COLOR);
      m_repliesFrame.setLayoutData(new RowData(getBounds().width, -1));
      m_repliesFrame.addListener(SWT.Resize, new Listener() {
        @Override
        public void handleEvent(Event arg0) {
          m_repliesFrame.setLayoutData(new RowData(m_repliesFrame.getBounds().width, 
                                                   m_repliesFrame.getBounds().height));
          layout();
          pack();
        }
      });
      
      m_repliesView = new RepliesList(m_repliesFrame, 
          replies, getBounds().width, m_nameClkHandler, m_handlerCallee);
      m_repliesView.addListener(SWT.Resize, new Listener() {
        @Override
        public void handleEvent(Event arg0) {
          m_repliesView.setLayoutData(new RowData(m_repliesView.getBounds().width, 
                                                  m_repliesView.getBounds().height));
          m_repliesFrame.layout();
          m_repliesFrame.pack();
        }
      });
    }
    
    m_upperFrame.setClicked();
    
    layout();
    pack();
  }
  
  public StyleRange getColorStyle(int startOffset, int length, Color color) {

		  StyleRange styleRange = new StyleRange(startOffset, length, color, null);

		  styleRange.fontStyle = SWT.NORMAL;

		  return styleRange;
	}
  
  private String createTimeString(Date time) {
    /*
    long difference = (System.currentTimeMillis() - time.getTime()) / 1000;
    
    String str = null;
    if (difference < 60) {
      str = difference + "s";
    }
    */
    //else if (difference >= 60 && difference < 3600 /* an hour */) {
    //  str = (difference / 60) + "m";
    //}
    //else if (difference >= 3600 && difference < 86400 /* a day */) {
    //  str = (difference / 3600) + "h";
    //}
	/*
    else {
      str = new SimpleDateFormat("dd MMM").format(time);
    }
    return str;
    */

    String str = null;
    Date date = new Date();   // current time
    Calendar currentTime = GregorianCalendar.getInstance(); // creates a new calendar instance
    Calendar tweetTime = GregorianCalendar.getInstance(); // creates a new calendar instance
    currentTime.setTime(date);   // assigns calendar to current time
    tweetTime.setTime(time);   // assigns calendar to tweet creation time
    
    // in case the tweet is on that day
    if (tweetTime.get(Calendar.YEAR) == currentTime.get(Calendar.YEAR) // compare year
        && tweetTime.get(Calendar.MONTH) == currentTime.get(Calendar.MONTH) // compare month
        && tweetTime.get(Calendar.DATE) == currentTime.get(Calendar.DATE) // compare date
       ) {
      str = new SimpleDateFormat("HH:mm").format(time);
    }
    // in case the tweet had a day old
    else {
      str = new SimpleDateFormat("MMM dd").format(time);
    }
    return str;
  }
  
  private String createDetailTimeString(Date time) {
    return new SimpleDateFormat("h:mm a - d MMM yy").format(time);
  }
  
  private void displaySucessWindow()
  {
	  final Shell SucShell;
	  Text txtSuccessfullyReplyTo;
	  
	  SucShell = new Shell();
		SucShell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		SucShell.setSize(260, 120);
		SucShell.setText("SUCESS!!!!!!!!!!!!!!!!!");
		SucShell.setLayout(new FormLayout());
		
		txtSuccessfullyReplyTo = new Text(SucShell, SWT.BORDER | SWT.WRAP | SWT.CENTER | SWT.MULTI);
		txtSuccessfullyReplyTo.setBackground(SWTResourceManager.getColor(0, 204, 255));
		txtSuccessfullyReplyTo.setEditable(false);
		txtSuccessfullyReplyTo.setText("Successfully Reply to.....\r\nWant To Reply More?");
		FormData fd_txtSuccessfullyReplyTo = new FormData();
		fd_txtSuccessfullyReplyTo.top = new FormAttachment(0);
		fd_txtSuccessfullyReplyTo.left = new FormAttachment(0);
		fd_txtSuccessfullyReplyTo.right = new FormAttachment(100);
		txtSuccessfullyReplyTo.setLayoutData(fd_txtSuccessfullyReplyTo);
		
		Button btnNewButton = new Button(SucShell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				SucShell.close();
			}
		});
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.bottom = new FormAttachment(100);
		fd_btnNewButton.left = new FormAttachment(0);
		fd_btnNewButton.top = new FormAttachment(100, -27);
		btnNewButton.setLayoutData(fd_btnNewButton);
		btnNewButton.setText("Yes, I Do!");
		
		Button btnNewButton_1 = new Button(SucShell, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				SucShell.close();
				shlReplyTo.close();
			}
		});
		fd_txtSuccessfullyReplyTo.bottom = new FormAttachment(btnNewButton_1, -6);
		fd_btnNewButton.right = new FormAttachment(btnNewButton_1, -1);
		FormData fd_btnNewButton_1 = new FormData();
		fd_btnNewButton_1.left = new FormAttachment(0, 122);
		fd_btnNewButton_1.right = new FormAttachment(100);
		fd_btnNewButton_1.bottom = new FormAttachment(100);
		btnNewButton_1.setLayoutData(fd_btnNewButton_1);
		btnNewButton_1.setText("No, Thanks.");
		SucShell.open();
  }
  
  private void displaySucessWindow2()
  {
	  final Shell SucShell2;
	  Text txtSuccessfullyReplyTo2;
	  
	    SucShell2 = new Shell();
		SucShell2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		SucShell2.setSize(260, 120);
		SucShell2.setText("WARNING!!!!!!!!!!!!!!!!!");
		SucShell2.setLayout(new FormLayout());
		
		txtSuccessfullyReplyTo2 = new Text(SucShell2, SWT.BORDER | SWT.WRAP | SWT.CENTER | SWT.MULTI);
		txtSuccessfullyReplyTo2.setBackground(SWTResourceManager.getColor(0, 204, 255));
		txtSuccessfullyReplyTo2.setEditable(false);
		txtSuccessfullyReplyTo2.setText("WANT TO DELETE IT?");
		FormData fd_txtSuccessfullyReplyTo2 = new FormData();
		fd_txtSuccessfullyReplyTo2.top = new FormAttachment(0);
		fd_txtSuccessfullyReplyTo2.left = new FormAttachment(0);
		fd_txtSuccessfullyReplyTo2.right = new FormAttachment(100);
		txtSuccessfullyReplyTo2.setLayoutData(fd_txtSuccessfullyReplyTo2);
		
		Button btnNewButton2 = new Button(SucShell2, SWT.NONE);
		btnNewButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				try {
					TwitterControl.getTwitter().destroyStatus(m_tweet.getId());
				} catch (TwitterException e) {
					Shell errShell = new Shell();
					errShell.setSize(300, 172);
					errShell.setText("ERROR!!!!!!!!!!!!!!!!!");
					errShell.setLayout(new FillLayout(SWT.HORIZONTAL));
					
					Label errLabel = new Label(errShell, SWT.WRAP);
					errLabel.setText(e.getErrorMessage());
					errShell.open();
				}
				SucShell2.close();
			}
		});
		FormData fd_btnNewButton2 = new FormData();
		fd_btnNewButton2.bottom = new FormAttachment(100);
		fd_btnNewButton2.left = new FormAttachment(0);
		fd_btnNewButton2.top = new FormAttachment(100, -27);
		btnNewButton2.setLayoutData(fd_btnNewButton2);
		btnNewButton2.setText("Yes, I Do!");
		
		Button btnNewButton_2 = new Button(SucShell2, SWT.NONE);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
			
				SucShell2.close();
				
			}
		});
		fd_txtSuccessfullyReplyTo2.bottom = new FormAttachment(btnNewButton_2, -6);
		fd_btnNewButton2.right = new FormAttachment(btnNewButton_2, -1);
		FormData fd_btnNewButton_2 = new FormData();
		fd_btnNewButton_2.left = new FormAttachment(0, 122);
		fd_btnNewButton_2.right = new FormAttachment(100);
		fd_btnNewButton_2.bottom = new FormAttachment(100);
		btnNewButton_2.setLayoutData(fd_btnNewButton_2);
		btnNewButton_2.setText("No, Thanks.");
		SucShell2.open();
  }
  private void widgetDisposed(DisposeEvent e) {
    // dispose loaded images
    Utils.dispose(m_icon);
  }
  
  public Status getTweet() {
    return m_tweet;
  }
  
  private boolean      m_ifIsFavorated;
  private long         m_getCurrentUserRetweetedid;
  private Label        label;
  private Button       retweetNewButton;
  private Button       replyButton;
  private Button       deleteButton;
  private Button       favorateButton;
  private Label        m_iconImage;
  private LinkLabel    m_name;
  private Label        m_screenName;
  private Label        m_time;
  private StyledText   m_text;
  private HoverClickableComposite m_upperFrame;
  private RowComposite m_rightFrame;
  private RowComposite m_iconFrame;
  
  private RowComposite m_extendFrame;
  private RowComposite m_repliesFrame;
  private NumberBar    m_numberBar;
  private Label        m_detailTime;
  private RepliesList  m_repliesView;

  private String m_nameClkHandler;
  private Object m_handlerCallee;
  private boolean     m_isRetweetedByMe;
  private boolean     m_isUserPage;
  
  // resources that need to be disposed
  private StyledText styledText;
  private Shell shlReplyTo;
  private Image m_icon;

  
  private final Status           m_tweet;
  private final User             m_user;
  private final TweetViewControl m_control;
  
  private int TV_count;
  private int[] TV_array;
  private String[][] TV_Highlight;
  private String[] TV_Highlight_OriginalText;
  private int[] TV_checkingDiff;
  
  //wym add this for favorate and unfavorate use
  private Image image = Utils.loadImageFromUrlAndScale("http://www.uusucai.com/d/file/png/2013/03/03/e755cf6449cd7a0faed41bae5bfae1bf.png", 25, 25);
  private Image image1 = Utils.loadImageFromUrlAndScale("http://sweetclipart.com/multisite/sweetclipart/files/imagecache/middle/heart_outline.png", 23, 23);
}


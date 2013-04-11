package hk.ust.cse.TwitterClient.Views.User;

import hk.ust.cse.TwitterClient.Utils;
import hk.ust.cse.TwitterClient.Controls.TwitterControl;
import hk.ust.cse.TwitterClient.Controls.UserPageControl;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.ControlBarItem;
import hk.ust.cse.TwitterClient.Views.ListView;
import hk.ust.cse.TwitterClient.Views.NumberBar;
import hk.ust.cse.TwitterClient.Views.NumberBarItem;
import hk.ust.cse.TwitterClient.Views.TweetsList;
import hk.ust.cse.TwitterClient.Views.Basic.RowComposite;

import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
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

import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;

public class UserPage extends RowComposite {
  
  public UserPage(Composite parentView, User user, String itemList, int width, int minPageHeight, int menuWidth, 
      int menuHeight, int profileWidth, int profileHeight, String nameClkHandler, Object handlerCallee,boolean isFollowedByMe) {
    super(parentView, SWT.CENTER, SWT.HORIZONTAL, false, 25, 50, 
        (width - menuWidth - profileWidth - 20) / 2, 
        (width - menuWidth - profileWidth - 20) / 2, 20);

    m_user           = user;
    m_width          = width;
    m_minPageHeight  = minPageHeight;
    m_nameClkHandler = nameClkHandler;
    m_handlerCallee  = handlerCallee;
    m_control        = new UserPageControl(this);
    m_isFollowedByMe = isFollowedByMe;
    initialize(width, menuWidth, menuHeight, profileWidth, profileHeight);

    // set the initial item list
    showNewItemList(itemList);
    
    // a dispose listener is necessary
    addDisposeListener(new DisposeListener() {
      public void widgetDisposed(DisposeEvent e) {
        UserPage.this.widgetDisposed(e);
      }
    });
  }
  
  private void initialize(int width, 
      int menuWidth, int menuHeight, int profileWidth, int profileHeight) {
	  IDs ids = TwitterControl.getFriendsIDs();
	  for(long id:ids.getIDs()){
		  if(id==m_user.getId()){
			  m_isFollowedByMe = true;
			  //System.out.println("FOLLOWED");
		  }
	  }
    // set size
    setSize(width, -1);
    
    // set background color
    m_bgColor = Utils.getColorFromString(m_user.getProfileBackgroundColor());
    setBackground(m_bgColor);
    setBackgroundMode(SWT.INHERIT_DEFAULT); // make all labels have transparent backgrounds
    
    // set background image
    m_bgImage = Utils.loadImageFromUrl(m_user.getProfileBackgroundImageURL().toString());
    if (m_bgImage != null) {
      setBackgroundImage(m_bgImage);
    }
    
    // set the left frame (Oli)
    m_leftFrame = new RowComposite(this, SWT.CENTER, SWT.VERTICAL, true, 0, 0, 0, 0, 15);
    m_leftFrame.setLayoutData(new RowData(menuWidth, -1));
    m_leftFrame.addListener(SWT.Resize, new Listener() {
      @Override
      public void handleEvent(Event arg0) {
        m_leftFrame.setLayoutData(new RowData(m_leftFrame.getBounds().width, 
                                               m_leftFrame.getBounds().height));
        layout();
        pack();
      }
    });
    
    // set the left menu (modified by Oli)
    m_leftMenu = new UserMenu(m_leftFrame, menuWidth, menuHeight, "onMenuItemClicked", this);
        
    // set the tweet to user frame (Oli)
    m_TweetFrame = new RowComposite(m_leftFrame, SWT.CENTER, SWT.VERTICAL, true, 10, 0, 8, 8, 0);
    //m_TweetFrame.setLayoutData(new RowData(menuWidth, -1));
    m_TweetFrame.setBackground(Resources.HOVER_COLOR);
    m_TweetFrame.setLayoutData(new RowData(300, Resources.POST_BOX_IMG.getBounds().height+75));
    m_TweetFrame.addListener(SWT.Resize, new Listener() {
      @Override
      public void handleEvent(Event arg0) {
        m_TweetFrame.setLayoutData(new RowData(m_TweetFrame.getBounds().width, 
                                                   m_TweetFrame.getBounds().height));
        layout();
        pack();
      }
    });
    
    // set the tweet text box (Oli)
    m_tweet = new Text(m_TweetFrame, SWT.MULTI|SWT.WRAP);
    m_tweet.setFont(Resources.FONT11);
    m_tweet.setBackground(Resources.WHITE_COLOR);
    m_tweet.setForeground(Resources.TWEET1_COLOR);
    m_tweet.setText("@"+m_user.getScreenName()+" ");
    m_tweet.setForeground(Resources.LINK_COLOR);
    m_tweet.setLayoutData(new RowData(Resources.POST_BOX_IMG.getBounds().width-7,Resources.POST_BOX_IMG.getBounds().height+70));
   
    
    
    // set the enter listener for the tweet test box (Oli)
    Utils.addEnterListener(m_tweet, "onEnterPressed", m_handlerCallee);
    m_tweet.addListener(SWT.RESIZE, new Listener(){

      @Override
      public void handleEvent(Event event) {
        m_tweet.setLayoutData(new RowData(m_tweet.getBounds().width, 
        	                                       m_TweetFrame.getBounds().height));
        layout();
        pack();
      }

    });
    // set the post (tweet) frame (Oli)
    postTweetFrame = new RowComposite(m_leftFrame, SWT.NONE, SWT.VERTICAL, true, 0, 0, 0, 0, 0);
    
    postTweetFrame.setLayoutData(new RowData(300, 
                                             Resources.POST_IMG.getBounds().height));

    ControlBarItem m_postTweet = new ControlBarItem(postTweetFrame, 
        "Post Status", Resources.POST_IMG, Resources.POST_HOVER_IMG);

    m_postTweet.setBounds(5,0,Resources.POST_IMG.getBounds().width-15, 
    	                    Resources.POST_IMG.getBounds().height);
    postTweetFrame.setVisible(false);
    m_postTweet.addMouseListener(new MouseListener(){

		@Override
		public void mouseDoubleClick(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDown(MouseEvent arg0) {
			// TODO Auto-generated method stub
			try {
				TwitterControl.getTwitter().updateStatus(m_tweet.getText());
				Shell sucShell = new Shell();
				sucShell.setSize(300, 172);
				sucShell.setText("ERROR!!!!!!!!!!!!!!!!!");
				sucShell.setLayout(new FillLayout(SWT.HORIZONTAL));
				
				Label sucLabel = new Label(sucShell, SWT.WRAP);
				sucLabel.setText("\""+m_tweet.getText()+"\""+"Successfully Posted. ");
				sucShell.open();
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

		@Override
		public void mouseUp(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
    	
    });// set the tweet length limit signal (Oli)
    m_TweetLength = new Label(postTweetFrame,SWT.RIGHT);
    m_TweetLength.setAlignment(SWT.CENTER);
    m_TweetLength.setForeground(Resources.HOVER_COLOR);
    m_TweetLength.setText(Integer.toString(140-m_tweet.getText().length()));
    m_TweetLength.setFont(SWTResourceManager.getFont("Arial", 22, SWT.NORMAL));
    m_TweetLength.setSize(30, 20);
    //m_TweetLength.setVisible(false);
    m_tweet.addModifyListener(new ModifyListener(){
    	public void modifyText(ModifyEvent e) {
			m_TweetLength.setText(Integer.toString(140-m_tweet.getCharCount()));
			if(140-m_tweet.getCharCount()<0){
				m_TweetLength.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));	
			}
			else {
				m_TweetLength.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
			}
			m_TweetLength.update();
			}
    });
    layout();
    pack();
    
    m_tweet.addFocusListener(new FocusListener() {
        @Override
        public void focusLost(FocusEvent arg0) {
          m_TweetFrame.setLayoutData(new RowData(300, Resources.POST_IMG.getBounds().height+20+Resources.POST_BOX_IMG.getBounds().height));
          m_tweet.setBackgroundImage(Resources.POST_BOX_IMG);
          m_tweet.setLayoutData(new RowData(Resources.POST_BOX_IMG.getBounds().width,Resources.POST_BOX_IMG.getBounds().height));
          postTweetFrame.setVisible(false);
          m_tweet.update();m_TweetFrame.update();
          layout();
          pack();
        }
        
        @Override
        public void focusGained(FocusEvent arg0) {
          m_TweetFrame.setLayoutData(new RowData(300, Resources.POST_IMG.getBounds().height+Resources.POST_BOX_HOVER_IMG.getBounds().height+20));
          
          m_tweet.setBackgroundImage(Resources.POST_BOX_HOVER_IMG);
          m_tweet.setLayoutData(new RowData(Resources.POST_BOX_HOVER_IMG.getBounds().width-7,Resources.POST_BOX_HOVER_IMG.getBounds().height));
          m_tweet.update();
          layout();
          pack();
          postTweetFrame.setVisible(true);
          m_tweet.update();m_TweetFrame.update();
          layout();
          pack();
        }
      });
    
    
    // set the right frame
    m_rightFrame = new RowComposite(this, 0, SWT.VERTICAL, false, 0, 0, 0, 0, 15);
    m_rightFrame.setLayoutData(new RowData(profileWidth, -1));
    m_rightFrame.addListener(SWT.Resize, new Listener() {
      @Override
      public void handleEvent(Event arg0) {
        m_rightFrame.setLayoutData(new RowData(m_rightFrame.getBounds().width, 
                                               m_rightFrame.getBounds().height));
        layout();
        pack();
      }
    });
    /////wangbo
      Composite followcomposite = new Composite(m_rightFrame, SWT.NONE);        
    followcomposite.setBounds(187, 49, 100, 109);        
    
      followNewButton = new Button(followcomposite, SWT.NONE);
     followNewButton.setBounds(21, 0, 100, 27);
         if(m_isFollowedByMe){
			followNewButton.setText("FOLLOWED");
	    }
		else{
			followNewButton.setText("UNFOLLOWED");
		}
    Utils.addClickListener(followNewButton, "followfunction", this);
    // set profile/number frame
    RowComposite profileFrame = new RowComposite(m_rightFrame, 0, SWT.VERTICAL, false, 0, 0, 0, 0, 0);
    profileFrame.setLayoutData(new RowData(profileWidth, -1));
    m_profile = new ProfileView(profileFrame, m_user, profileWidth, profileHeight);
    m_profile.setLayoutData(new RowData(profileWidth, profileHeight));
    Utils.cutRoundCorner(m_profile, true, true, false, false);
    
    // set number bar
    long[] numbers = new long[] {m_user.getStatusesCount(), 
                                 m_user.getFriendsCount(), 
                                 m_user.getFollowersCount()};
    String[] titles = new String[] {"TWEETS", "FOLLOWING", "FOLLOWERS"};
    m_numberBar = new NumberBar(profileFrame, numbers, titles, profileWidth, 
        120, 50, Resources.WHITE_COLOR, Resources.HOVER_COLOR, Resources.WHITE_COLOR, 
        Resources.FONT12B, Resources.FONT7, false, "onNumberItemClicked", this);
    Utils.cutRoundCorner(m_numberBar, false, false, true, true);
    
    layout(); // trigger re-layout
    pack();
  }

  public void onMenuItemClicked(MouseEvent arg) {
    int index = m_leftMenu.getCurrentSelected();
    if (index >= 0) {
      UserMenuItem selectedItem = m_leftMenu.getMenuItems().get(index);
      showNewItemList(selectedItem.getTitle());
    }
  }
  
  public void onNumberItemClicked(MouseEvent arg) {
    Control control = (Control) arg.getSource();
    while (!(control instanceof NumberBarItem)) {
      control = control.getParent();
    }
    if (control != null) {
      showNewItemList(((NumberBarItem) control).getTitle());
    }
  }
  
  private void showNewItemList(String title) {
    // remove the old list view
    Utils.dispose(m_itemList);
    
    layout();
    pack();

    // we need to guarantee a minimal page height
    if (getBounds().height < m_minPageHeight) {
      setSize(m_width, m_minPageHeight);
    }
    
    // retrieve the list asynchronously
    title = title.toLowerCase();
    if (title.equals("tweets")) {
      m_leftMenu.setCurrentSelected(0);
      m_tweetPage = 1;
      TwitterControl.getUserTimeline(m_user.getScreenName(), m_tweetPage, "showTweetsListCallback", m_control);
    }
    else if (title.equals("following")) {
      m_leftMenu.setCurrentSelected(1);
      TwitterControl.getFollowing(m_user.getScreenName(), -1, "showFollowingListCallback", m_control);
    }
    else if (title.equals("followers")) {
      m_leftMenu.setCurrentSelected(2);
      TwitterControl.getFollowers(m_user.getScreenName(), -1, "showFollowersListCallback", m_control);
    }
    else if (title.equals("favorites")) {
      m_leftMenu.setCurrentSelected(3);
    }
    else if (title.equals("lists")) {
      m_leftMenu.setCurrentSelected(4);
    }
  }
  
  public void tweetsListBackClicked(MouseEvent arg) {
    if (m_tweetPage > 1) {
      m_tweetPage -= 1;
      TwitterControl.getUserTimeline(m_user.getScreenName(), m_tweetPage, "showTweetsListCallback", m_control);
    }
  }
  
  public void tweetsListNextClicked(MouseEvent arg) {
    if (m_tweetPage * 20 < m_user.getStatusesCount()) {
      m_tweetPage += 1;
      TwitterControl.getUserTimeline(m_user.getScreenName(), m_tweetPage, "showTweetsListCallback", m_control);
    }
  }
  
  public void followingListBackClicked(MouseEvent arg) {
    long prevCursor = m_following.getPreviousCursor();
    if (prevCursor != 0) {
      TwitterControl.getFollowing(m_user.getScreenName(), prevCursor, "showFollowingListCallback", m_control);
    }
  }
  
  public void followingListNextClicked(MouseEvent arg) {
    long nextCursor = m_following.getNextCursor();
    if (nextCursor != 0) {
      TwitterControl.getFollowing(m_user.getScreenName(), nextCursor, "showFollowingListCallback", m_control);
    }
  }
  
  public void followersListBackClicked(MouseEvent arg) {
    long prevCursor = m_followers.getPreviousCursor();
    if (prevCursor != 0) {
      TwitterControl.getFollowers(m_user.getScreenName(), prevCursor, "showFollowersListCallback", m_control);
    }
  }
  
  public void followersListNextClicked(MouseEvent arg) {
    long nextCursor = m_followers.getNextCursor();
    if (nextCursor != 0) {
      TwitterControl.getFollowers(m_user.getScreenName(), nextCursor, "showFollowersListCallback", m_control);
    }
  }
  
  public void showTweetsList(List<Status> tweets) {
    // remove the old list view
    Utils.dispose(m_itemList);
    layout();

    m_itemList = new TweetsList(m_rightFrame, tweets, 
        m_rightFrame.getBounds().width, m_nameClkHandler, m_handlerCallee, 
        "tweetsListBackClicked", this, "tweetsListNextClicked", this);
    m_itemList.addListener(SWT.Resize, new Listener() {
      @Override
      public void handleEvent(Event arg0) {
        m_itemList.setLayoutData(new RowData(m_itemList.getBounds().width, 
                                             m_itemList.getBounds().height));
        m_rightFrame.layout();
        m_rightFrame.pack();
      }
    });
    m_rightFrame.layout();
    m_rightFrame.pack();
    
    // we need to guarantee a minimal page height
    if (getBounds().height < m_minPageHeight) {
      setSize(m_width, m_minPageHeight);
    }
  }
  
  public void showFollowingList(PagableResponseList<User> following) {
    // remove the old list view
    Utils.dispose(m_itemList);
    layout();

    m_following = following;
    m_itemList = new FriendsList(m_rightFrame, m_following, "Following", 
        m_rightFrame.getBounds().width, m_nameClkHandler, m_handlerCallee, 
        "followingListBackClicked", this, "followingListNextClicked", this);
    m_itemList.addListener(SWT.Resize, new Listener() {
      @Override
      public void handleEvent(Event arg0) {
        m_itemList.setLayoutData(new RowData(m_itemList.getBounds().width, 
                                             m_itemList.getBounds().height));
        m_rightFrame.layout();
        m_rightFrame.pack();
      }
    });
    m_rightFrame.layout();
    m_rightFrame.pack();
    
    // we need to guarantee a minimal page height
    if (getBounds().height < m_minPageHeight) {
      setSize(m_width, m_minPageHeight);
    }
  }
  
  public void showFollowersList(PagableResponseList<User> followers) {
    // remove the old list view
    Utils.dispose(m_itemList);
    layout();

    m_followers = followers;
    m_itemList = new FriendsList(m_rightFrame, m_followers, "Followers", 
        m_rightFrame.getBounds().width, m_nameClkHandler, m_handlerCallee, 
        "followersListBackClicked", this, "followersListNextClicked", this);
    m_itemList.addListener(SWT.Resize, new Listener() {
      @Override
      public void handleEvent(Event arg0) {
        m_itemList.setLayoutData(new RowData(m_itemList.getBounds().width, 
                                             m_itemList.getBounds().height));
        m_rightFrame.layout();
        m_rightFrame.pack();
      }
    });
    m_rightFrame.layout();
    m_rightFrame.pack();
    
    // we need to guarantee a minimal page height
    if (getBounds().height < m_minPageHeight) {
      setSize(m_width, m_minPageHeight);
    }
  }
  
  private void widgetDisposed(DisposeEvent e) {
    // dispose created colors
    Utils.dispose(m_bgColor);
    
    // dispose loaded images
    Utils.dispose(m_bgImage);
  }
  
  public User getUser() {
    return m_user;
  }
  //wangbo followfunction
  public void followfunction(MouseEvent arg) {
		 if(!m_isFollowedByMe)
		 {
			 // TwitterControl.getFollowing(m_user.getScreenName(), -1, "showFollowingListCallback", m_control);
			 // TwitterControl.getFollowing(m_user.getScreenName(), -1, "addFollowingnumber", m_control);
			 try {
				TwitterControl.getTwitter().createFriendship(m_user.getScreenName());
			} catch (TwitterException e) {
				Shell errShell = new Shell();
				errShell.setSize(300, 172);
				errShell.setText("ERROR!!!!!!!!!!!!!!!!!");
				errShell.setLayout(new FillLayout(SWT.HORIZONTAL));
				
				Label errLabel = new Label(errShell, SWT.WRAP);
				errLabel.setText(e.getErrorMessage());
				errShell.open();
			}
		  	m_isFollowedByMe = true;
		  	followNewButton.setText("FOLLOWED");
	     	followNewButton.update();
		  }
		 else{	
			   try {
				TwitterControl.getTwitter().destroyFriendship(m_user.getScreenName());
			} catch (TwitterException e) {
				Shell errShell = new Shell();
				errShell.setSize(300, 172);
				errShell.setText("ERROR!!!!!!!!!!!!!!!!!");
				errShell.setLayout(new FillLayout(SWT.HORIZONTAL));
				
				Label errLabel = new Label(errShell, SWT.WRAP);
				errLabel.setText(e.getErrorMessage());
				errShell.open();
			}
			 try {
				TwitterControl.getTwitter().destroyFriendship(m_user.getScreenName());
			} catch (TwitterException e) {
				Shell errShell = new Shell();
				errShell.setSize(300, 172);
				errShell.setText("ERROR!!!!!!!!!!!!!!!!!");
				errShell.setLayout(new FillLayout(SWT.HORIZONTAL));
				
				Label errLabel = new Label(errShell, SWT.WRAP);
				errLabel.setText(e.getErrorMessage());
				errShell.open();
			}
			    followNewButton.setText("UNFOLLOWED");
			    m_isFollowedByMe = false;
			    layout();
     	 }	 
	  }
  private UserMenu     m_leftMenu;
  private ProfileView  m_profile;
  private NumberBar    m_numberBar;
  private ListView     m_itemList;
  private RowComposite m_rightFrame;
  private Button       followNewButton;
  private boolean      m_isFollowedByMe;
  // the currently showing list
  private int                       m_tweetPage;
  private PagableResponseList<User> m_following;
  private PagableResponseList<User> m_followers;
  
  // resources that need to be disposed
  private Color m_bgColor;
  private Image m_bgImage;
  
  private final User            m_user;
  private final int             m_width;
  private final int             m_minPageHeight;
  private final String          m_nameClkHandler;
  private final Object          m_handlerCallee;
  private final UserPageControl m_control;
  
  // Oli
  private RowComposite m_leftFrame;
  private RowComposite m_TweetFrame;
  private Text m_tweet;
  private RowComposite postTweetFrame;
  private ControlBarItem m_TweetButton;
  private Label m_TweetLength;
}

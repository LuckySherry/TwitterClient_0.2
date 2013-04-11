package test.hk.ust.cse.TwitterClient.Views;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import hk.ust.cse.TwitterClient.Utils;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.ControlBar;
import hk.ust.cse.TwitterClient.Views.ControlBarItem;
import hk.ust.cse.TwitterClient.Views.ListView;
import hk.ust.cse.TwitterClient.Views.NumberBar;
import hk.ust.cse.TwitterClient.Views.NumberBarItem;
import hk.ust.cse.TwitterClient.Views.TweetView;
import hk.ust.cse.TwitterClient.Views.TweetsList;
import hk.ust.cse.TwitterClient.Views.WholePage;
import org.eclipse.swt.widgets.*;
import hk.ust.cse.TwitterClient.Views.Basic.ClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.HoverClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.RowComposite;
import hk.ust.cse.TwitterClient.Views.Home.HomePage;
import hk.ust.cse.TwitterClient.Views.Home.MiniProfile;
import hk.ust.cse.TwitterClient.Views.Home.RepliesList;
import hk.ust.cse.TwitterClient.Views.User.FriendsList;
import hk.ust.cse.TwitterClient.Controls.*;

import java.awt.Button;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import test.hk.ust.cse.TwitterClient.Mocks.MockUser;
import twitter4j.AccountSettings;
import twitter4j.AsyncTwitter;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.Friendship;
import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.HashtagEntity;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.MediaEntity;
import twitter4j.OEmbed;
import twitter4j.OEmbedRequest;
import twitter4j.PagableResponseList;
import twitter4j.Paging;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.RateLimitStatusListener;
import twitter4j.RelatedResults;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterListener;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserMentionEntity;
import twitter4j.api.HelpResources.Language;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
//import java.awt.List;

public class ViewsTest {
	@Test(timeout=10000)
	public void ViewsConstructor() throws TwitterException {
	
	
    Display display=new Display();
    Shell shell=new Shell(display);
   
	 
  //org.eclipse.swt.graphics.Image image = Utils.loadImageFromUrl("https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png");
    
	 
    Status s=new Status() {
    	String temp=null;
    	String temp1=null;
		private static final long serialVersionUID = 1L;

		@Override
		public UserMentionEntity[] getUserMentionEntities() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public URLEntity[] getURLEntities() {
			// TODO Auto-generated method stub	
			URLEntity urlEntity=new URLEntity() {
				
				@Override
				public String getURL() {
					// TODO Auto-generated method stub
					return "url";
				}
				
				@Override
				public int getStart() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public String getExpandedURL() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getEnd() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public String getDisplayURL() {
					// TODO Auto-generated method stub
					return "displayURL";
				}
			};
			URLEntity[] urlentities=new URLEntity[1];
			urlentities[0]=urlEntity;
			return urlentities;
		}
		
		@Override
		public MediaEntity[] getMediaEntities() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HashtagEntity[] getHashtagEntities() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RateLimitStatus getRateLimitStatus() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getAccessLevel() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int compareTo(Status o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public boolean isTruncated() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isRetweetedByMe() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isRetweet() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isPossiblySensitive() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isFavorited() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public User getUser() {
			MockUser user1=new MockUser("FakeUser", "", true, "");
			MockUser user2=new MockUser("FakeUser5", "", false, "");
			if(temp==null){
				temp="a";
				return user2;
			}
			else{
			return user1;}
		}
		
		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return "text";
		}
		
		@Override
		public String getSource() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Status getRetweetedStatus() {
			Status status=new Status() {
				
				@Override
				public UserMentionEntity[] getUserMentionEntities() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public URLEntity[] getURLEntities() {
					URLEntity urlEntity=new URLEntity() {
						
						@Override
						public String getURL() {
							// TODO Auto-generated method stub
							return "url";
						}
						
						@Override
						public int getStart() {
							// TODO Auto-generated method stub
							return 0;
						}
						
						@Override
						public String getExpandedURL() {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public int getEnd() {
							// TODO Auto-generated method stub
							return 0;
						}
						
						@Override
						public String getDisplayURL() {
							// TODO Auto-generated method stub
							return "displayurl";
						}
					};
                    URLEntity[] urlEntities=new URLEntity[1];
                    urlEntities[0]=urlEntity;
					return urlEntities;
				}
				
				@Override
				public MediaEntity[] getMediaEntities() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public HashtagEntity[] getHashtagEntities() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public RateLimitStatus getRateLimitStatus() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getAccessLevel() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int compareTo(Status arg0) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public boolean isTruncated() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isRetweetedByMe() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isRetweet() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isPossiblySensitive() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isFavorited() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public User getUser() {
					MockUser user3=new MockUser("3", "3", true, "");
					return user3;
				}
				
				@Override
				public String getText() {
					// TODO Auto-generated method stub
					return "text";
				}
				
				@Override
				public String getSource() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Status getRetweetedStatus() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public long getRetweetCount() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public Place getPlace() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public long getInReplyToUserId() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public long getInReplyToStatusId() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public String getInReplyToScreenName() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public long getId() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public GeoLocation getGeoLocation() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public long getCurrentUserRetweetId() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public Date getCreatedAt() {
				 Date d1=new Date();
					return d1;
				}
				
				@Override
				public long[] getContributors() {
					// TODO Auto-generated method stub
					return null;
				}
			};
			
			if(temp1==null)
			{
				temp1="";
				return null;
			}
			else{
			return status;}
		}
		
		@Override
		public long getRetweetCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Place getPlace() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getInReplyToUserId() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public long getInReplyToStatusId() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public String getInReplyToScreenName() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getId() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public GeoLocation getGeoLocation() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getCurrentUserRetweetId() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Date getCreatedAt() {
			Date d=new Date();
			// TODO Auto-generated method stub
			return d;
		}
		
		@Override
		public long[] getContributors() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	
	
    long[] l=new long[1];
    l[0]=(long)1;
    String[] s1=new String[1];
    s1[0]="";
    NumberBar numberBar=new NumberBar(shell, l, s1, 0, 0, 0, null, null, null, null, null, true, null, null);
    assertNotNull(numberBar);
    
    NumberBarItem numberBarItem=new NumberBarItem(shell, 0, "tweets", 0, 0, null, null, null, null, null);
    numberBarItem.getNumber();
    numberBarItem.getTitle();
   
    HoverClickableComposite hcc=new HoverClickableComposite(shell, null, null, null);
    hcc.isClicked();
    
    MockUser user1=new MockUser("FakeUser", "ScreenName", true, "description");
    MockUser user2=new MockUser("FakeUser1", "ScreenName", false, "description");
    
    ConfigurationBuilder builder = new ConfigurationBuilder();
    builder.setDebugEnabled(false);
	builder.setOAuthConsumerKey("jCuspkHm65ZsTHFZvq5usw");
	builder.setOAuthConsumerSecret("z0Kw6s1OG27rTtShhS8x9VUyAUlaH7VoLHSr3dy7RMM");
    builder.setOAuthAccessToken("1155799626-h5p6jpWaSlbQetb7i0koHtfWbnmBbaDUXXcMgEX");
    builder.setOAuthAccessTokenSecret("hClIuYyhKvVm10HiE5TcbsyAypHQt9sIlJkQrwiPtg");
	TwitterFactory factory = new TwitterFactory(builder .build());
	Twitter twitter1 = factory.getInstance();
	
    MiniProfile miniProfile=new MiniProfile(shell, user1, 0, 0);
    MiniProfile miniProfile1=new MiniProfile(shell, user2, 0, 0);
    assertNotNull(miniProfile1);
    miniProfile.getUser();
    
    ControlBar ctrlBar = new ControlBar(shell, 10, 10, 0, null, null, null);
    assertNotNull(ctrlBar);
    assertEquals(10, ctrlBar.getBounds().width);
    assertEquals(10, ctrlBar.getBounds().height); 
    
    ListView c = new ListView(shell,"",0,"",new Object(),"",new Object());
	c.addItem(shell); 
	ControlBar cb=new ControlBar(c,0,0,0,"","",new Object());
	assertEquals("",cb.getGotoPeopleName());
	
	 TweetView tv = new TweetView(shell,s,48,false,Resources.WHITE_COLOR,Resources.WHITE_COLOR,Resources.WHITE_COLOR,"a",new Object());
     tv.getTweet();
    // ConfigurationBuilder builder = new ConfigurationBuilder();
    // TwitterFactory factory = new TwitterFactory(builder .build());
     //Twitter twitter = factory.getInstance();
    // List<Composite> friendViews = new ArrayList<Composite>();
     List<Status> statuslist = new ArrayList<Status>();
     List<Status> statuslist1 = new ArrayList<Status>();
	
	statuslist.add(s);
	statuslist1.add(s);
    // FriendsList fList=new FriendsList(shell, statuslist, "title", 0, "nc", new Object(), "bh", new Object(), "nh", new Object());
     //fList.toString();
	//statuslist.add(s);
     tv.showReplies(statuslist);
     
     tv.toggleExpand(null);
     
     
     RepliesList repliesList=new RepliesList(shell, statuslist, 0, "", new Object());
     RepliesList repliesList1=new RepliesList(shell, statuslist1, 0, "", new Object());
     RepliesList repliesList2=new RepliesList(shell, null, 0, "", new Object());
     assertNotNull(repliesList);
     assertNotNull(repliesList1);
     assertNotNull(repliesList2);
     
     PagableResponseList<User> friends1 = null;
     FriendsList fList1=new FriendsList(shell, friends1, "title", 0, "nc", new Object(), "bh", new Object(), "nh", new Object());
     fList1.toString();
     
    
     TweetsList tl=new TweetsList(shell,statuslist,0,"",new Object(),"",new Object(),"",new Object());
     tl.toString();
     
    Color color1 = new Color(null, 171, 205, 238);
    HoverClickableComposite hcc1=new HoverClickableComposite(shell,color1,color1,color1);
    hcc1.isClicked();
    assertNotNull(hcc1);
    
    RowComposite rc=new RowComposite(shell,0,0,true,0,0,0,0,0);
    rc.getWidth();
    rc.getHeight();
    
    //MouseEvent mouseEvent=new MouseEvent(null, 0, 0, 0, 0, 0, 0, 0, 0, true, 0);
    //HomePage homePage=new HomePage(shell, 0, 0, 0, 0, 0, "", "", new Object());
    //homePage.tweetsListBackClicked(null);
    
	 /*WholePage wholePage=new WholePage(tv, 100, 100);
	 Event event=new Event();
	 org.eclipse.swt.widgets.Button button=new org.eclipse.swt.widgets.Button(controlBarItem, 0);
	 event.widget=button;
     //button.notifyListeners(SWT.MouseEnter, event);
	 org.eclipse.swt.events.MouseEvent mouseEvent=new org.eclipse.swt.events.MouseEvent(event);
	 wholePage.onCtrlBtnClicked(mouseEvent);
	 wholePage.onEnterPressed(null);
	 wholePage.onNumberItemClicked(mouseEvent);
	 wholePage.onNameLinkClicked(mouseEvent);*/
    
    
   // HomePage homePage=new HomePage(tv, 999, 90, 10,10, 90, "aa", "a", new Object());
   // HomePageControl homePageControl=new HomePageControl(homePage);
   // assertNotNull(homePageControl);
    final MockUser mockUser=new MockUser("FakeUser", "FackScreenName", true, "FakeDescription");
    final MockUser mockUserI=new MockUser("FakeUserI", "FackScreenName", true, "FakeDescription");
    Twitter twitter2=new Twitter() {
		
		@Override
		public RelatedResults getRelatedResults(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getTermsOfService() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Map<String, RateLimitStatus> getRateLimitStatus(String... arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Map<String, RateLimitStatus> getRateLimitStatus()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getPrivacyPolicy() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Language> getLanguages() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public TwitterAPIConfiguration getAPIConfiguration()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User reportSpam(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User reportSpam(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Trends getPlaceTrends(int arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Trends getLocationTrends(int arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Location> getClosestTrends(GeoLocation arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Location> getAvailableTrends(GeoLocation arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Location> getAvailableTrends() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Place> searchPlaces(GeoQuery arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Place> reverseGeoCode(GeoQuery arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SimilarPlaces getSimilarPlaces(GeoLocation arg0, String arg1,
				String arg2, String arg3) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Place getGeoDetails(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Place createPlace(String arg0, String arg1, String arg2,
				GeoLocation arg3, String arg4) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SavedSearch showSavedSearch(int arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<SavedSearch> getSavedSearches() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SavedSearch destroySavedSearch(int arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SavedSearch createSavedSearch(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList updateUserList(String arg0, String arg1, String arg2,
				boolean arg3, String arg4) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList updateUserList(long arg0, String arg1, String arg2,
				boolean arg3, String arg4) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList updateUserList(int arg0, String arg1, boolean arg2,
				String arg3) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUserListSubscription(String arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUserListSubscription(long arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUserListSubscription(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUserListMembership(String arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUserListMembership(long arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUserListMembership(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList showUserList(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList showUserList(long arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList showUserList(int arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<UserList> getUserLists(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<UserList> getUserLists(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<UserList> getUserListSubscriptions(String arg0,
				long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getUserListSubscribers(String arg0,
				String arg1, long arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getUserListSubscribers(long arg0,
				String arg1, long arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getUserListSubscribers(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserListStatuses(String arg0,
				String arg1, Paging arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserListStatuses(long arg0,
				String arg1, Paging arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserListStatuses(int arg0,
				Paging arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<UserList> getUserListMemberships(long arg0,
				long arg1, boolean arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<UserList> getUserListMemberships(String arg0,
				long arg1, boolean arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<UserList> getUserListMemberships(String arg0,
				long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<UserList> getUserListMemberships(long arg0,
				long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<UserList> getUserListMemberships(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getUserListMembers(String arg0,
				String arg1, long arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getUserListMembers(long arg0, String arg1,
				long arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getUserListMembers(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserListSubscription(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserListSubscription(long arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserListSubscription(int arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserListMember(String arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserListMember(long arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserListMember(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserList(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserList(long arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList destroyUserList(int arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList deleteUserListMember(long arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList deleteUserListMember(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListSubscription(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListSubscription(long arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListSubscription(int arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMembers(String arg0, String arg1,
				String[] arg2) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMembers(long arg0, String arg1, String[] arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMembers(String arg0, String arg1, long[] arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMembers(long arg0, String arg1, long[] arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMembers(int arg0, String[] arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMembers(int arg0, long[] arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMember(String arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMember(long arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserListMember(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList createUserList(String arg0, boolean arg1, String arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList addUserListMembers(long arg0, String arg1, String[] arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList addUserListMembers(long arg0, String arg1, long[] arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList addUserListMembers(int arg0, String[] arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList addUserListMembers(int arg0, long[] arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList addUserListMember(long arg0, String arg1, long arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UserList addUserListMember(int arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getFavorites(String arg0, Paging arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getFavorites(long arg0, Paging arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getFavorites(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getFavorites(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getFavorites(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getFavorites()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status destroyFavorite(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status createFavorite(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> getUserSuggestions(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Category> getSuggestedUserCategories()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> getMemberSuggestions(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User verifyCredentials() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User updateProfileImage(InputStream arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User updateProfileImage(File arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User updateProfileColors(String arg0, String arg1, String arg2,
				String arg3, String arg4) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void updateProfileBanner(InputStream arg0) throws TwitterException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileBanner(File arg0) throws TwitterException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public User updateProfileBackgroundImage(InputStream arg0, boolean arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User updateProfileBackgroundImage(File arg0, boolean arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User updateProfile(String arg0, String arg1, String arg2, String arg3)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccountSettings updateAccountSettings(Integer arg0, Boolean arg1,
				String arg2, String arg3, String arg4, String arg5)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User showUser(String arg0) throws TwitterException {
			if (arg0=="FakeUserI") {
				return mockUser;
			}
			else{
				return mockUserI;
			}
		}
		
		@Override
		public User showUser(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> searchUsers(String arg0, int arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void removeProfileBanner() throws TwitterException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public ResponseList<User> lookupUsers(String[] arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> lookupUsers(long[] arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> getContributors(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> getContributors(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> getContributees(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<User> getContributees(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getBlocksList(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getBlocksList() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getBlocksIDs(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getBlocksIDs() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccountSettings getAccountSettings() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User destroyBlock(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User destroyBlock(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User createBlock(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User createBlock(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Relationship updateFriendship(String arg0, boolean arg1, boolean arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Relationship updateFriendship(long arg0, boolean arg1, boolean arg2)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Relationship showFriendship(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Relationship showFriendship(long arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Friendship> lookupFriendships(String[] arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<Friendship> lookupFriendships(long[] arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getOutgoingFriendships(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getIncomingFriendships(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getFriendsList(String arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getFriendsList(long arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getFriendsIDs(String arg0, long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getFriendsIDs(long arg0, long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getFriendsIDs(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getFollowersList(String arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public PagableResponseList<User> getFollowersList(long arg0, long arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getFollowersIDs(String arg0, long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getFollowersIDs(long arg0, long arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IDs getFollowersIDs(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User destroyFriendship(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User destroyFriendship(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User createFriendship(String arg0, boolean arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User createFriendship(long arg0, boolean arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User createFriendship(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User createFriendship(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public DirectMessage showDirectMessage(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public DirectMessage sendDirectMessage(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public DirectMessage sendDirectMessage(long arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<DirectMessage> getSentDirectMessages(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<DirectMessage> getSentDirectMessages()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<DirectMessage> getDirectMessages(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<DirectMessage> getDirectMessages()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public DirectMessage destroyDirectMessage(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public QueryResult search(Query arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status updateStatus(StatusUpdate arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status updateStatus(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status showStatus(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status retweetStatus(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getRetweets(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public OEmbed getOEmbed(OEmbedRequest arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public twitter4j.Status destroyStatus(long arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserTimeline(long arg0, Paging arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserTimeline(String arg0,
				Paging arg1) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserTimeline(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserTimeline(long arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserTimeline(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getUserTimeline()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getRetweetsOfMe(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getRetweetsOfMe()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getMentionsTimeline(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getMentionsTimeline()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getMentions(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getMentions() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getHomeTimeline(Paging arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResponseList<twitter4j.Status> getHomeTimeline()
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void shutdown() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public String getScreenName() throws TwitterException,
				IllegalStateException {
			return "";
		}
		
		@Override
		public long getId() throws TwitterException, IllegalStateException {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Configuration getConfiguration() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Authorization getAuthorization() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void addRateLimitStatusListener(RateLimitStatusListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setOAuthConsumer(String arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setOAuthAccessToken(AccessToken arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public RequestToken getOAuthRequestToken(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RequestToken getOAuthRequestToken(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RequestToken getOAuthRequestToken() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(RequestToken arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(RequestToken arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
    AsyncTwitter asyncTwitter=new AsyncTwitter() {
		
		@Override
		public void getRelatedResults(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getTermsOfService() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getRateLimitStatus(String... arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getRateLimitStatus() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getPrivacyPolicy() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getLanguages() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getAPIConfiguration() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void reportSpam(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void reportSpam(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getPlaceTrends(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getLocationTrends(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getClosestTrends(GeoLocation arg0) throws TwitterException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getAvailableTrends(GeoLocation arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getAvailableTrends() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void searchPlaces(GeoQuery arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void reverseGeoCode(GeoQuery arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getSimilarPlaces(GeoLocation arg0, String arg1, String arg2,
				String arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getGeoDetails(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createPlace(String arg0, String arg1, String arg2,
				GeoLocation arg3, String arg4) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showSavedSearch(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getSavedSearches() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroySavedSearch(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createSavedSearch(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateUserList(long arg0, String arg1, String arg2,
				boolean arg3, String arg4) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateUserList(int arg0, String arg1, boolean arg2, String arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUserListSubscription(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUserListSubscription(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUserListMembership(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUserListMembership(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUserList(long arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUserList(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserLists(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserLists(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListSubscriptions(String arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListSubscribers(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListSubscribers(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListStatuses(long arg0, String arg1, Paging arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListStatuses(int arg0, Paging arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMemberships(String arg0, long arg1, boolean arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMemberships(long arg0, long arg1, boolean arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMemberships(String arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMemberships(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMemberships(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMembers(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserListMembers(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyUserListSubscription(long arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyUserListSubscription(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyUserListMember(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyUserListMember(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyUserList(long arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyUserList(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteUserListMember(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteUserListMember(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListSubscription(long arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListSubscription(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListMembers(long arg0, String arg1, String[] arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListMembers(long arg0, String arg1, long[] arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListMembers(int arg0, String[] arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListMembers(int arg0, long[] arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListMember(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserListMember(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createUserList(String arg0, boolean arg1, String arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addUserListMembers(long arg0, String arg1, String[] arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addUserListMembers(long arg0, String arg1, long[] arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addUserListMembers(int arg0, String[] arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addUserListMembers(int arg0, long[] arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addUserListMember(long arg0, String arg1, long arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addUserListMember(int arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFavorites(String arg0, Paging arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFavorites(long arg0, Paging arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFavorites(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFavorites(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFavorites(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFavorites() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyFavorite(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createFavorite(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserSuggestions(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getSuggestedUserCategories() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getMemberSuggestions(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void verifyCredentials() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileImage(InputStream arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileImage(File arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileColors(String arg0, String arg1, String arg2,
				String arg3, String arg4) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileBanner(InputStream arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileBanner(File arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileBackgroundImage(InputStream arg0, boolean arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfileBackgroundImage(File arg0, boolean arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateProfile(String arg0, String arg1, String arg2, String arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateAccountSettings(Integer arg0, Boolean arg1, String arg2,
				String arg3, String arg4, String arg5) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUser(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showUser(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void searchUsers(String arg0, int arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeProfileBanner() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lookupUsers(String[] arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lookupUsers(long[] arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getContributors(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getContributors(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getContributees(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getContributees(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getBlocksList(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getBlocksList() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getBlocksIDs(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getBlocksIDs() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getAccountSettings() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyBlock(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyBlock(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createBlock(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createBlock(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateFriendship(String arg0, boolean arg1, boolean arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateFriendship(long arg0, boolean arg1, boolean arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showFriendship(String arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showFriendship(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lookupFriendships(String[] arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lookupFriendships(long[] arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOutgoingFriendships(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getIncomingFriendships(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFriendsList(String arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFriendsList(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFriendsIDs(String arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFriendsIDs(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFriendsIDs(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFollowersList(String arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFollowersList(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFollowersIDs(String arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFollowersIDs(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getFollowersIDs(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyFriendship(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyFriendship(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createFriendship(String arg0, boolean arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createFriendship(long arg0, boolean arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createFriendship(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void createFriendship(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showDirectMessage(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void sendDirectMessage(String arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void sendDirectMessage(long arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getSentDirectMessages(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getSentDirectMessages() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getDirectMessages(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getDirectMessages() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyDirectMessage(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void search(Query arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateStatus(StatusUpdate arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateStatus(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showStatus(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void retweetStatus(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getRetweets(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOEmbed(OEmbedRequest arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void destroyStatus(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserTimeline(long arg0, Paging arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserTimeline(String arg0, Paging arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserTimeline(long arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserTimeline(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserTimeline(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getUserTimeline() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getRetweetsOfMe(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getRetweetsOfMe() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getMentions(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getMentions() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getHomeTimeline(Paging arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getHomeTimeline() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void shutdown() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public String getScreenName() throws TwitterException,
				IllegalStateException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getId() throws TwitterException, IllegalStateException {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Configuration getConfiguration() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Authorization getAuthorization() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void addRateLimitStatusListener(RateLimitStatusListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthRequestTokenAsync(String arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthRequestTokenAsync(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthRequestTokenAsync() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthAccessTokenAsync(String arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthAccessTokenAsync(RequestToken arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthAccessTokenAsync(RequestToken arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthAccessTokenAsync(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getOAuthAccessTokenAsync() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setOAuthConsumer(String arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setOAuthAccessToken(AccessToken arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public RequestToken getOAuthRequestToken(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RequestToken getOAuthRequestToken(String arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RequestToken getOAuthRequestToken() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(String arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(RequestToken arg0, String arg1)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(RequestToken arg0)
				throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken(String arg0) throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AccessToken getOAuthAccessToken() throws TwitterException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void addListener(TwitterListener arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	TwitterControl.setupTwitter(twitter2, asyncTwitter);
	TwitterControl twitterControl2=new TwitterControl();
	HomePage homePage2=new HomePage(shell, 0, 0, 0, 0, 0, "", "", new Object());
	assertNotNull(homePage2);
    
	
    shell.dispose();
    display.dispose();
    c.dispose();
    
    
	}
	



}

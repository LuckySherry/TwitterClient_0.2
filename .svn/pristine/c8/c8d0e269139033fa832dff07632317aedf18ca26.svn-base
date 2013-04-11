package test.hk.ust.cse.TwitterClient.Controls;

import static org.junit.Assert.*;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import hk.ust.cse.TwitterClient.Utils;
import hk.ust.cse.TwitterClient.Controls.HomePageControl;
import hk.ust.cse.TwitterClient.Controls.TweetViewControl;
import hk.ust.cse.TwitterClient.Controls.TwitterControl;
import hk.ust.cse.TwitterClient.Controls.UserPageControl;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.ControlBar;
import hk.ust.cse.TwitterClient.Views.ControlBarItem;
import hk.ust.cse.TwitterClient.Views.NumberBar;
import hk.ust.cse.TwitterClient.Views.NumberBarItem;
import hk.ust.cse.TwitterClient.Views.TweetView;
import hk.ust.cse.TwitterClient.Views.TweetsList;
import hk.ust.cse.TwitterClient.Views.WholePage;
import hk.ust.cse.TwitterClient.Views.Basic.ClickableComposite;
import hk.ust.cse.TwitterClient.Views.Home.HomePage;
import hk.ust.cse.TwitterClient.Views.Home.MiniProfile;
import hk.ust.cse.TwitterClient.Views.Home.RepliesList;
import hk.ust.cse.TwitterClient.Views.User.FriendView;
import hk.ust.cse.TwitterClient.Views.User.FriendsList;
import hk.ust.cse.TwitterClient.Views.User.ProfileView;
import hk.ust.cse.TwitterClient.Views.User.UserPage;

import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
//import hk.ust.cse.TwitterClient.Controls.TweetViewControl;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import test.hk.ust.cse.TwitterClient.Mocks.MockPagableResponseList;
import test.hk.ust.cse.TwitterClient.Mocks.MockUser;
import twitter4j.*;
import twitter4j.api.HelpResources.Language;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
public class TweetViewControlTest {

	
	
@Test
public void testControl() throws Throwable{
	
	Display display=new Display();
	Shell shell=new Shell(display);

	
final User user=new User() {
		
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
		public int compareTo(User arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public boolean isVerified() {
			// TODO Auto-generated method stub
			return true;
		}
		
		@Override
		public boolean isTranslator() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isShowAllInlineMedia() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isProtected() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isProfileUseBackgroundImage() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isProfileBackgroundTiled() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isGeoEnabled() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isFollowRequestSent() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isContributorsEnabled() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public int getUtcOffset() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public URLEntity getURLEntity() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getURL() {
			// TODO Auto-generated method stub
			return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
		}
		
		@Override
		public String getTimeZone() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getStatusesCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public twitter4j.Status getStatus() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getScreenName() {
			return "FakeUserI";
		}
		
		@Override
		public String getProfileTextColor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileSidebarFillColor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileSidebarBorderColor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileLinkColor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public URL getProfileImageUrlHttps() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileImageURLHttps() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileImageURL() {
			
			return "";
		}
		
		@Override
		public String getProfileBannerURL() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBannerRetinaURL() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBannerMobileURL() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBannerMobileRetinaURL() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBannerIPadURL() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBannerIPadRetinaURL() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBackgroundImageUrlHttps() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getProfileBackgroundImageUrl() {
			// TODO Auto-generated method stub
			return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
		}
		
		@Override
		public String getProfileBackgroundImageURL() {
			// TODO Auto-generated method stub
			return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
		}
		
		@Override
		public String getProfileBackgroundColor() {
			
			return "1111111111111111";
		}
		
		@Override
		public String getOriginalProfileImageURLHttps() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getOriginalProfileImageURL() {
			// TODO Auto-generated method stub
			return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
		}
		
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "name";
		}
		
		@Override
		public String getMiniProfileImageURLHttps() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getMiniProfileImageURL() {
			// TODO Auto-generated method stub
			return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
		}
		
		@Override
		public String getLocation() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getListedCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public String getLang() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getId() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getFriendsCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getFollowersCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getFavouritesCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public URLEntity[] getDescriptionURLEntities() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "description";
		}
		
		@SuppressWarnings("deprecation")
		@Override
		public Date getCreatedAt() {
			Date date=new Date();
			date.setDate((int) System.currentTimeMillis());
			return date;
		}
		
		@Override
		public String getBiggerProfileImageURLHttps() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getBiggerProfileImageURL() {
			// TODO Auto-generated method stub
			return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
		}
	};
	
	twitter4j.Status status=new twitter4j.Status() {
		String temp=null;
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
					return "displayUrl";
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
		public int compareTo(twitter4j.Status o) {
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
		    MockUser mockUser=new MockUser("", "ScreenName", true, "Description");
		    return mockUser;
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
		public twitter4j.Status getRetweetedStatus() {
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
			return "";
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
			Date date=new Date();
			date.setTime((int)(System.currentTimeMillis()-100000));
			return date;
		}
		
		@Override
		public long[] getContributors() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	
	twitter4j.Status status1=new twitter4j.Status() {
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
					return "displayUrl";
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
		public int compareTo(twitter4j.Status o) {
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
			return user;
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
		public twitter4j.Status getRetweetedStatus() {
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
			return "";
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
			Date date=new Date();
			date.setTime((int)(System.currentTimeMillis()-10000000));
			return date;
		}
		
		@Override
		public long[] getContributors() {
			// TODO Auto-generated method stub
			return null;
		}
	};


	ConfigurationBuilder builder = new ConfigurationBuilder();
    builder.setDebugEnabled(false);
	builder.setOAuthConsumerKey("jCuspkHm65ZsTHFZvq5usw");
	builder.setOAuthConsumerSecret("z0Kw6s1OG27rTtShhS8x9VUyAUlaH7VoLHSr3dy7RMM");
    builder.setOAuthAccessToken("1155799626-h5p6jpWaSlbQetb7i0koHtfWbnmBbaDUXXcMgEX");
    builder.setOAuthAccessTokenSecret("hClIuYyhKvVm10HiE5TcbsyAypHQt9sIlJkQrwiPtg");
	TwitterFactory factory = new TwitterFactory(builder .build());
	Twitter twitter = factory.getInstance();
	
	final MockUser mockUser=new MockUser("FakeUser", "FackScreenName", true, "FakeDescription");
	MockUser mockUser1=new MockUser("FakeUser1", "FackScreen", true, "FakeDescription");
	MockUser mockUser2=new MockUser("special", "FackScreenName", true, "FakeDescription");
	
	final MockUser mockUserI=new MockUser("FakeUserI", "FackScreenName", true, "FakeDescription");
	MockUser mockUserJ=new MockUser("FakeUserJ", "FackScreenName", true, "FakeDescription");
	
	
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
			
		}
			
			
		
	};
	
	TwitterControl twitterControl=new TwitterControl();
	TwitterControl.setupTwitter(twitter, asyncTwitter);
	
	
	List<twitter4j.Status> statuslist = twitter.getHomeTimeline();
	List<twitter4j.Status> statuslist1 = twitter.getHomeTimeline();
	
	PagableResponseList<User> friends = twitter.getFollowersList(12, 12);
	
	TwitterControl.getFollowers("", 0, "", new Object());
	TwitterControl.getFollowing("", 0, "", new Object());
	TwitterControl.getTwitter();
	TwitterControl.getUserTimeline("", 1, "", new Object());
	TwitterControl.getReplies(status, "", new Object());
	
	UserPage userPage=new UserPage(shell, twitter.showUser("Wang_Yumeng"), "followers", 100, 1000000, 100, 100,520, 260, "", shell);
	UserPage userPage1=new UserPage(shell, mockUser, "following", 1, -10000, 1, 1,520, 260, "", shell);
	UserPage userPage2=new UserPage(shell, mockUser2, "following", 1, 1, 1, 1,520, 260, "", shell);
    
	
	NumberBarItem numberBarItem0=new NumberBarItem(shell, 0, "wrong", 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
	Event event0=new Event();
	 Button button0=new Button(numberBarItem0,0);
	 event0.widget=button0;
	 org.eclipse.swt.events.MouseEvent mouseEvent0=new org.eclipse.swt.events.MouseEvent(event0);
	
	 userPage.onNumberItemClicked(mouseEvent0);
	
	    userPage.showFollowersList(friends);
	    userPage.showFollowingList(friends);
	    userPage.onMenuItemClicked(mouseEvent0);
	    userPage.tweetsListNextClicked(null);
	    userPage.tweetsListNextClicked(null);
	    userPage.tweetsListBackClicked(null);
	    userPage.getUser();
	    userPage.showTweetsList(null);
	    
	    userPage.showTweetsList(statuslist);
	    
	    numberBarItem0.dispose();
		button0.dispose();
	    
	
	NumberBarItem numberBarItem=new NumberBarItem(shell, 0, "tweets", 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
	Event event=new Event();
	 Button button=new Button(numberBarItem,0);
	 event.widget=button;
	 org.eclipse.swt.events.MouseEvent mouseEvent=new org.eclipse.swt.events.MouseEvent(event);
	 userPage.onMenuItemClicked(mouseEvent);
	 userPage.onNumberItemClicked(mouseEvent);
	 
	 UserPage userPage3=new UserPage(shell, twitter.showUser("Wang_Yumeng"), "followers", 100, 1000000, 100, 100,520, 260, "", shell);
	   MockPagableResponseList<User> friends1 =new MockPagableResponseList<User>();

	   friends1.add(mockUser);
	   friends1.add(mockUser1);
	   friends1.add(mockUser2);
	   
	     userPage1.showTweetsList(statuslist);
		 userPage1.onNumberItemClicked(mouseEvent);
		 userPage1.showFollowersList(friends);
		 userPage1.showFollowingList(friends);
	     userPage1.followersListNextClicked(null);
		 userPage1.followingListNextClicked(null);
		 userPage1.followingListBackClicked(null);
		 userPage1.followersListBackClicked(null);
		 userPage1.tweetsListNextClicked(null);
		 userPage1.tweetsListNextClicked(null);
		 userPage1.tweetsListBackClicked(null);
	  
	   userPage3.onNumberItemClicked(mouseEvent);		 
	   userPage3.showFollowingList(friends1);
	   userPage3.showFollowersList(friends1);
	   
	   
	   userPage3.followersListNextClicked(mouseEvent);
	   userPage3.followingListNextClicked(mouseEvent);
	   userPage3.followingListBackClicked(mouseEvent);
	   userPage3.followersListBackClicked(mouseEvent);
	numberBarItem.dispose();
	 button.dispose();
	 
	
	 
	 NumberBarItem numberBarItemA=new NumberBarItem(shell, 0, "following", 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
		Event eventA=new Event();
		 Button buttonA=new Button(shell, SWT.MouseEnter);
		 eventA.widget=numberBarItemA;
	   buttonA.notifyListeners(SWT.MouseEnter, eventA);
		 org.eclipse.swt.events.MouseEvent mouseEventA=new org.eclipse.swt.events.MouseEvent(eventA);
		 userPage.onNumberItemClicked(mouseEventA);
		 numberBarItemA.dispose();
		 buttonA.dispose();
		
	 NumberBarItem numberBarItemA1=new NumberBarItem(shell, 0, "followers", 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
		Event eventA1=new Event();
		 Button buttonA1=new Button(shell, SWT.MouseEnter);
		 eventA1.widget=numberBarItemA1;
	   buttonA1.notifyListeners(SWT.MouseEnter, eventA1);
		 org.eclipse.swt.events.MouseEvent mouseEventA1=new org.eclipse.swt.events.MouseEvent(eventA1);
		 userPage.onMenuItemClicked(mouseEventA1);
		 numberBarItemA1.dispose();
		 buttonA1.dispose();
	 
	NumberBarItem numberBarItemB=new NumberBarItem(shell, 0, "favorites", 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
			Event eventB=new Event();
			 Button buttonB=new Button(shell, SWT.MouseEnter);
			 eventB.widget=numberBarItemB;
		   buttonB.notifyListeners(SWT.MouseEnter, eventB);
			 org.eclipse.swt.events.MouseEvent mouseEventB=new org.eclipse.swt.events.MouseEvent(eventB);
			 userPage.onMenuItemClicked(mouseEventB);
			 numberBarItemB.dispose();
			 buttonB.dispose();
			 
			 
  
  
   
	
	UserPageControl userPageControl=new UserPageControl(userPage);
	userPageControl.showTweetsListCallback(friends);
	userPageControl.showFollowersListCallback(friends);
	userPageControl.showFollowingListCallback(friends);

	
	
	
	HomePage homePage=new HomePage(shell, 10, 10000, 10,100, 10, "a", "b", new Object());
	HomePage homePage1=new HomePage(shell, 0, -1000, 0, 0, 0, "", "", new Object());
	homePage.tweetsListBackClicked(null);
	homePage.showTweetsList(statuslist);
	homePage1.showTweetsList(statuslist);
	homePage.tweetsListNextClicked(null);
	homePage.tweetsListBackClicked(null);
	HomePageControl homePageControl=new HomePageControl(homePage);
	HomePageControl homePageControl2=new HomePageControl(homePage1);
	homePageControl.showTweetsListCallback(friends);
	
	 event.widget=shell;
	 org.eclipse.swt.events.MouseEvent mouseEvent1=new org.eclipse.swt.events.MouseEvent(event);
	 homePage.tweetsListNextClicked(mouseEvent1);
	homePage.tweetsListBackClicked(mouseEvent1); 
	   
	RepliesList repliesList=new RepliesList(shell, statuslist, 0, "", new Object());
	TweetView tweetView2=new TweetView(shell, status, 0, true, null, null, null, null, new Object());
	TweetView tweetView21=new TweetView(repliesList, status1, 0, true, null, null, null, null, new Object());
	tweetView21.toggleExpand(null);
	tweetView21.setParent(repliesList);
	tweetView21.showReplies(statuslist);
	tweetView2.showReplies(statuslist);
	
	statuslist1.clear();
	tweetView21.showReplies(statuslist1);
	tweetView2.showReplies(statuslist1);
	
	TweetViewControl tweetViewControl=new TweetViewControl(tweetView21);
	tweetViewControl.getRepliesCallback(friends);
	
	tweetView2.toggleExpand(null);
	TweetViewControl tweetViewControl1=new TweetViewControl(tweetView2);
	tweetViewControl1.getRepliesCallback(friends);
	
	ProfileView profileView0 = new ProfileView(shell, twitter.showUser("Wang_Yumeng"), 100, 100);
	
    ProfileView profileView1 = new ProfileView(shell, mockUser1, 0, 0);
    ProfileView profileView = new ProfileView(shell,mockUser, 100, 100);
    ProfileView profileView2=new ProfileView(shell, mockUser2, 10,10);
    
    ProfileView profileViewI=new ProfileView(shell, mockUserI, 100, 100);
    ProfileView profileViewJ = new ProfileView(shell, mockUserJ, 100, 100);
    profileView0.getUser();  
 
    MockUser friend11 = new MockUser("FakeUser", "FakeScreenName", false, "Fake Description");
    FriendView friendView = new FriendView(shell, twitter.showUser("Wang_Yumeng"), 10, null, null);
    FriendView friendView1 = new FriendView(shell, mockUser, 10, null, null);
 
    assertEquals("Wang Yumeng", friendView.getFriend().getName());
    assertEquals("Wang_Yumeng", friendView.getFriend().getScreenName());
    assertEquals("", friendView.getFriend().getDescription());
    assertFalse(friendView.getFriend().isVerified());
    
     TweetsList tl=new TweetsList(shell,statuslist,0,"",new Object(),"",new Object(),"",new Object());
     tl.toString();
    friends.add(twitter.showUser("Wang_Yumeng"));
    FriendsList fList=new FriendsList(shell, friends, "title", 0, "nc", new Object(), "bh", new Object(), "nh", new Object());
    fList.toString();
    
    
    PagableResponseList<User> friends11 = null;
    FriendsList fList1=new FriendsList(shell, friends11, "title", 0, "nc", new Object(), "bh", new Object(), "nh", new Object());
    fList1.toString();
    
    homePage.dispose();
	homePage1.dispose();
    userPage.dispose();
    org.eclipse.swt.graphics.Image image = Utils.loadImageFromUrl("https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png");
    ControlBar controlBar=new ControlBar(shell, 0, 0, 0, null, "", new Object());
    ControlBarItem controlBarItem=new ControlBarItem(shell, "Home", image, image);
    ControlBarItem controlBarItem2=new ControlBarItem(shell, "Me", image, image);
    ControlBarItem controlBarItem3=new ControlBarItem(shell, "Go to people", image, image);
    ControlBarItem controlBarItem4=new ControlBarItem(shell, "wrong", image, image);
    WholePage wholePage=new WholePage(shell, 520, 260);
    
    Event event1=new Event();
	 event1.widget=controlBar;
	 controlBar.setParent(controlBarItem);
	 org.eclipse.swt.events.MouseEvent mouseEvent11=new org.eclipse.swt.events.MouseEvent(event1);
	 wholePage.onCtrlBtnClicked(mouseEvent11);
	 wholePage.onEnterPressed(null);
	 
	 event1.widget=controlBar;
	 controlBar.setParent(controlBarItem2);
	 org.eclipse.swt.events.MouseEvent mouseEvent111=new org.eclipse.swt.events.MouseEvent(event1);
	 wholePage.onCtrlBtnClicked(mouseEvent111);
	 
	 event1.widget=controlBar;
	 controlBar.setParent(controlBarItem3);
	 org.eclipse.swt.events.MouseEvent mouseEvent1111=new org.eclipse.swt.events.MouseEvent(event1);
	 wholePage.onCtrlBtnClicked(mouseEvent1111);
	 
	 event1.widget=controlBar;
	 controlBar.setParent(controlBarItem4);
	 org.eclipse.swt.events.MouseEvent mouseEvent11111=new org.eclipse.swt.events.MouseEvent(event1);
	 wholePage.onCtrlBtnClicked(mouseEvent11111);
	 
	 long[] l=new long[1];
	 l[0]=1;
	 String[] strings=new String[1];
	 strings[0]="";
	 NumberBar numberBar=new NumberBar(shell, l, strings, 0, 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11, true, "", new Object());
	 NumberBarItem numberBarItem2=new NumberBarItem(shell, 0, "", 0, 0, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11);
	 Event event2=new Event();
	 //org.eclipse.swt.widgets.Button button1=new org.eclipse.swt.widgets.Button(controlBarItem, 0);
	 event2.widget=numberBar;
	 numberBar.setParent(numberBarItem2);
	 org.eclipse.swt.events.MouseEvent mouseEvent2=new org.eclipse.swt.events.MouseEvent(event2);
	 wholePage.onNumberItemClicked(mouseEvent2);
	 
	 Event event3=new Event();
	 //org.eclipse.swt.widgets.Button button1=new org.eclipse.swt.widgets.Button(controlBarItem, 0);
	 event3.widget=numberBar;
	 numberBar.setParent(friendView);
	 org.eclipse.swt.events.MouseEvent mouseEvent3=new org.eclipse.swt.events.MouseEvent(event3);
	 TweetView tweetView=new TweetView(shell, mockUser.getStatus(), 100, true, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, "", new Object());
	 wholePage.onNameLinkClicked(mouseEvent3);
	 
	 Event event31=new Event();
	 Button button2=new Button(tweetView, 0);
	 event31.widget=button2;
	 org.eclipse.swt.events.MouseEvent mouseEvent31=new org.eclipse.swt.events.MouseEvent(event31);
	 wholePage.onNameLinkClicked(mouseEvent31);
	
	 MiniProfile miniProfile=new MiniProfile(shell, mockUser, 1000, 1000);
	 MiniProfile miniProfile1=new MiniProfile(shell, mockUser1, 1000, 1000);
	 MiniProfile miniProfile2=new MiniProfile(shell, mockUser2, 1000, 1000);
	 miniProfile2.getUser();
	 miniProfile1.getUser();
	 Event event311=new Event();
	 Button button21=new Button(miniProfile, 0);
	 event311.widget=button21;
	 org.eclipse.swt.events.MouseEvent mouseEvent311=new org.eclipse.swt.events.MouseEvent(event311);
	 wholePage.onNameLinkClicked(mouseEvent311);
	 
	 Event event3111=new Event();
	 Button button3=new Button(numberBar, 0);
	 event3111.widget=button3;
	 button3.setParent(numberBar);
	 org.eclipse.swt.events.MouseEvent mouseEvent3111=new org.eclipse.swt.events.MouseEvent(event3111);
	 wholePage.onNameLinkClicked(mouseEvent3111);
	
}


}

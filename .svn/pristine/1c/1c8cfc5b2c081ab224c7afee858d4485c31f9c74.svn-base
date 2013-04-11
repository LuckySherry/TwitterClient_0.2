/*package test.hk.ust.cse.TwitterClient.Views.User;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.util.Date;
import java.util.List;

import hk.ust.cse.TwitterClient.Controls.UserPageControl;
import hk.ust.cse.TwitterClient.Views.TweetsList;
import hk.ust.cse.TwitterClient.Views.User.FriendView;
import hk.ust.cse.TwitterClient.Views.User.FriendsList;
import hk.ust.cse.TwitterClient.Views.User.ProfileView;
import hk.ust.cse.TwitterClient.Views.User.UserPage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

import test.hk.ust.cse.TwitterClient.Mocks.MockUser;
//import twitter4j.PagableResponseList;
//import twitter4j.Twitter;
//import twitter4j.TwitterFactory;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class ProfileViewTest {
	@Test(timeout=10000)
	  public void testConstructor() throws Throwable {
		Display display = new Display();
	    Shell shell = new Shell(display);
	    
	    User friend=new User() {
	    	String tempString=null;
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
						return "";
					}
					
					@Override
					public int getEnd() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public String getDisplayURL() {
						// TODO Auto-generated method stub
						return "";
					}
				};
				return urlEntity;
			}
			
			@Override
			public String getURL() {
				if (tempString==null) {
					tempString="";
					return null;
				}
				else{
				return "a";}
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
			public Status getStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getScreenName() {
				// TODO Auto-generated method stub
				return "FakeScreenName";
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
				// TODO Auto-generated method stub
				return null;
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
				return null;
			}
			
			@Override
			public String getProfileBackgroundImageURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getOriginalProfileImageURLHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getOriginalProfileImageURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "FakeUser";
			}
			
			@Override
			public String getMiniProfileImageURLHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getMiniProfileImageURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLocation() {
				if (tempString==null) {
					tempString="";
					return null;
				}
				else{
				return "a";}
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
				return "Fake Description";
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBiggerProfileImageURLHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBiggerProfileImageURL() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	    //MockUser friend = new MockUser("FakeUser1", "FakeScreenName", true, "Fake Description");
	    
		 ConfigurationBuilder builder = new ConfigurationBuilder();
		    builder.setDebugEnabled(false);
			builder.setOAuthConsumerKey("jCuspkHm65ZsTHFZvq5usw");
		    builder.setOAuthConsumerSecret("z0Kw6s1OG27rTtShhS8x9VUyAUlaH7VoLHSr3dy7RMM");
		    builder.setOAuthAccessToken("1155799626-h5p6jpWaSlbQetb7i0koHtfWbnmBbaDUXXcMgEX");
		    builder.setOAuthAccessTokenSecret("hClIuYyhKvVm10HiE5TcbsyAypHQt9sIlJkQrwiPtg");

		    TwitterFactory factory = new TwitterFactory(builder .build());
		    Twitter twitter = factory.getInstance();
		    List<Status> statuslist = twitter.getHomeTimeline();
		    
		    
	   // MockUser friend0 = new MockUser("FakeUser1", "FakeScreenName", false, "Fake Description");
	    
	}

}
*/
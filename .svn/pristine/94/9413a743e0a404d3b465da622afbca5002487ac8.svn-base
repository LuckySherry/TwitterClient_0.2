package hk.ust.cse.TwitterClient.Views;

import java.util.ArrayList;
import java.util.List;

import hk.ust.cse.TwitterClient.TwitterClient;
import hk.ust.cse.TwitterClient.Utils;
import hk.ust.cse.TwitterClient.Controls.TwitterControl;
import hk.ust.cse.TwitterClient.Controls.UserPageControl;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.Basic.ClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.ClickableImageLabel;
import hk.ust.cse.TwitterClient.Views.Basic.HoverClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.RowComposite;
import hk.ust.cse.TwitterClient.Views.Home.HomePage;
import hk.ust.cse.TwitterClient.Views.Home.MiniProfile;
import hk.ust.cse.TwitterClient.Views.User.FriendView;
import hk.ust.cse.TwitterClient.Views.User.MockUser;
import hk.ust.cse.TwitterClient.Views.User.MockUser.MockPageList;
import hk.ust.cse.TwitterClient.Views.User.MockUser.MockStatus;
import hk.ust.cse.TwitterClient.Views.User.MockUser.MockURLEntity;
import hk.ust.cse.TwitterClient.Views.User.ProfileView;
import hk.ust.cse.TwitterClient.Views.User.UserMenu;
import hk.ust.cse.TwitterClient.Views.User.UserMenuItem;
import hk.ust.cse.TwitterClient.Views.User.UserPage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.AfterClass;
import org.junit.Test;


import twitter4j.AsyncTwitter;
import twitter4j.AsyncTwitterFactory;
import twitter4j.PagableResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.json.DataObjectFactory;




public class WholePageTest {

	@Test
	public void testWholePage() throws TwitterException {
	    if (Display.getDefault() != null) {
	        Display.getDefault().dispose();
	      }
	    Display display = new Display();
	    Shell shell2 = new Shell(display);
	    Shell shell = new Shell(shell2);
	    
	    RowComposite m_rightFrame = new RowComposite(shell, 0, SWT.VERTICAL, false, 0, 0, 0, 0, -1);;
		List<Status> tweets = new ArrayList<Status>();
		Status status = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 23 06:21:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 23 06:21:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		MockUser basis = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
		MockStatus mStatus = basis.new MockStatus();
		mStatus.mURLE = new MockURLEntity[2];
		mStatus.mURLE[0] = basis. new MockURLEntity();
		mStatus.mURLE[1] = basis. new MockURLEntity();
		mStatus.mURLE[0].url = "url";
		mStatus.mURLE[0] .DisplayURL = "djfdkj";
		mStatus.mURLE[1].url = "url";
		mStatus.mURLE[1] .DisplayURL = "djfdkj";
		Status status1 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 25 19:00:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 25 19:00:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status2 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 11:07:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 11:07:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status3 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:13:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:13:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status4 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:14:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:14:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status5 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:15:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:15:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status6 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:16:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:16:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status7 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:17:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:17:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status8 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:18:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:18:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");
		Status status9 = DataObjectFactory.createStatus("{\"text\":\"\\\\u5e30%u5e30 &lt;%}& foobar &lt;&Cynthia&gt;\",\"contributors\":null,\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":null,\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[]},\"in_reply_to_status_id_str\":null,\"id\":12029015787307008,\"in_reply_to_user_id_str\":null,\"source\":\"web\",\"favorited\":false,\"in_reply_to_status_id\":null,\"in_reply_to_user_id\":null,\"created_at\":\"Sat Feb 27 14:19:55 +0000 2013\",\"retweet_count\":0,\"id_str\":\"12029015787307008\",\"place\":null,\"user\":{\"location\":\"location:\",\"statuses_count\":13405,\"profile_background_tile\":false,\"lang\":\"en\",\"profile_link_color\":\"0000ff\",\"id\":6358482,\"following\":true,\"favourites_count\":2,\"protected\":false,\"profile_text_color\":\"000000\",\"contributors_enabled\":false,\"description\":\"Hi there, I do test a lot!new\",\"verified\":false,\"profile_sidebar_border_color\":\"87bc44\",\"name\":\"twit4j\",\"profile_background_color\":\"9ae4e8\",\"created_at\":\"Sat Feb 27 14:19:55 +0000 2013\",\"followers_count\":24,\"geo_enabled\":true,\"profile_background_image_url\":\"http://a3.twimg.com/profile_background_images/179009017/t4j-reverse.gif\",\"follow_request_sent\":false,\"url\":\"http://yusuke.homeip.net/twitter4j/\",\"utc_offset\":-32400,\"time_zone\":\"Alaska\",\"notifications\":false,\"friends_count\":4,\"profile_use_background_image\":true,\"profile_sidebar_fill_color\":\"e0ff92\",\"screen_name\":\"twit4j\",\"id_str\":\"6358482\",\"profile_image_url\":\"http://a3.twimg.com/profile_images/1184543043/t4j-reverse_normal.jpeg\",\"show_all_inline_media\":false,\"listed_count\":3},\"coordinates\":null}");


		
		tweets.add(status);
		tweets.add(status);
		tweets.add(status1);
		tweets.add(status2);
		tweets.add(status3);
		tweets.add(status4);
		tweets.add(status5);
		tweets.add(status6);
		tweets.add(status7);
		tweets.add(status8);
		tweets.add(status9);
		tweets.add(mStatus);
		Twitter twitter = TwitterFactory.getSingleton();
	    //twitter.setOAuthConsumer("3hvcfKoeE6ro7r1cfookSg", "jATKiwMK2cWTmD7RGbWKqn79Ovps7JfXdAJw8vLoOC0");
	    //AccessToken accesstoken = new AccessToken("364342010-JC1f82Hp5roWwevX1nGg7MOJiusK8WUvVWuUle91","2t0S35W2Hd7ld3fIIhcmswi3cgVxb4qgScXkL5nGY");
	    //twitter.setOAuthAccessToken(accesstoken);
	    AsyncTwitter AT = AsyncTwitterFactory.getSingleton();
	    //AT.setOAuthConsumer("3hvcfKoeE6ro7r1cfookSg", "jATKiwMK2cWTmD7RGbWKqn79Ovps7JfXdAJw8vLoOC0");
	    //AT.setOAuthAccessToken(accesstoken);
	    TwitterControl.setupTwitter(twitter, AT);
		List<Status> sTweet = twitter.getUserTimeline();
		TweetsList m_itemList = new TweetsList(m_rightFrame, sTweet , 
		        m_rightFrame.getBounds().width, "onNumberItemClicked", this, 
		        "tweetsListBackClicked", this, "tweetsListNextClicked", this);
		TweetView m_view = new TweetView(shell, sTweet.get(0), m_itemList.getBounds().width, true, 
	            Resources.WHITE_COLOR, Resources.HOVER_COLOR, Resources.WHITE_COLOR, "m_nameClkHandler", this,false,-1, false);
		
		TweetView fakeView1 = new TweetView(shell, sTweet.get(1), m_itemList.getBounds().width, true, 
	            Resources.WHITE_COLOR, Resources.HOVER_COLOR, Resources.WHITE_COLOR, "m_nameClkHandler", this,false,-1L, false);
		mStatus.u.ProfileImageURL = "jjjj";
		TweetView fakeView2 = new TweetView(shell, sTweet.get(2), m_itemList.getBounds().width, true, 
	            Resources.WHITE_COLOR, Resources.HOVER_COLOR, Resources.WHITE_COLOR, "m_nameClkHandler", this,false,-1L, false);
		//TweetViewControl m_control = new TweetViewControl(m_view);
		//TwitterControl.getReplies(status, "getRepliesCallback", m_control);
		
		//reply Test written by cwk
		m_view.replyFuntion(null);
		m_view.deleteFuntion(null);
		//m_view.retweetgfunction(null);
		
		HoverClickableComposite m_upperFrame = new HoverClickableComposite(shell, Resources.WHITE_COLOR, Resources.HOVER_COLOR, Resources.WHITE_COLOR);
		m_upperFrame.isClicked();
		ScrolledComposite scrollContainer = new ScrolledComposite(shell, SWT.H_SCROLL | SWT.V_SCROLL);
	    scrollContainer.getVerticalBar().setIncrement(10);
	    
	    
	    
	    TwitterControl.setupTwitter(twitter, AT);
	    // create the whole window
	    TwitterControl.getTwitter();
	    
	    WholePage m_wholeWindow = new WholePage(scrollContainer, 1200, 700);
	    
	    Control control = (Control) m_view;
	    Status tweet = ((TweetView) control).getTweet();
	    
	    MockUser mockUserPage = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
	    mockUserPage.StatusesCount = 0;
	    mockUserPage.ProfileBackgroundColor = tweet.getUser().getProfileBackgroundColor();
	    mockUserPage.ProfileBackgroundImageURL = "...";
	    UserPage mock_userPage = new UserPage(m_wholeWindow, mockUserPage, "TWEETS", 1200, 
	            0, 300, 98, 520, 260, "onNameLinkClicked", m_wholeWindow,false);
	    mock_userPage.tweetsListBackClicked(null);
	    mock_userPage.tweetsListNextClicked(null);
	    
	    UserPage uselessPage = new UserPage(m_wholeWindow, mockUserPage, "aaaaaa", 1200, 
	            99999, 300, 98, 520, 260, "onNameLinkClicked", m_wholeWindow,false);
	    MockPageList<MockUser> mockP = mockUserPage.new MockPageList();
	    uselessPage.showFollowersList(mockP);
	    uselessPage.showFollowingList(mockP);
	    uselessPage.followersListBackClicked(null);
	    uselessPage.followersListNextClicked(null);
	    uselessPage.followingListBackClicked(null);
	    uselessPage.followingListNextClicked(null);
	    uselessPage.showTweetsList(sTweet);
	   
	    ControlBar CB = new ControlBar(shell,1200,40, 200, "onCtrlBtnClicked", "onEnterPressed", m_wholeWindow);
	    CB.setLayoutData(new RowData(1200, 40));
	    
	    Control controlCBs[] = CB.getChildren();
	    for(Control controlCB:controlCBs){
	    	if(controlCB instanceof RowComposite){
	    		Control control_CBs1[] = ((RowComposite) controlCB).getChildren();
	    		for(Control control_CB1:control_CBs1){
	    			if(control_CB1 instanceof RowComposite){
	    				Control control_CBs2[] = ((RowComposite) control_CB1).getChildren();
	    				for(Control control_CB:control_CBs2){
	    					if(control_CB instanceof Text){
	    	    	    		Event FocusLost = new Event();
	    	    	    		FocusLost.widget = control_CB;
	    	    	    		FocusLost.type = SWT.FocusOut;
	    	    	    		Event FocusGain = new Event();
	    	    	    		FocusGain.widget = control_CB;
	    	    	    		FocusGain.type = SWT.FocusIn;
	    	    	    		Listener textLis[] = control_CB.getListeners(SWT.FocusOut);
	    	    	    		for(Listener textLi:textLis){
	    	    	    			textLi.handleEvent(FocusLost);
	    	    	    		}
	    	    	    		textLis = control_CB.getListeners(SWT.FocusIn);
	    	    	    		for(Listener textLi:textLis){
	    	    	    			textLi.handleEvent(FocusGain);
	    	    	    		}
	    					}
	    				}
	    	    	}
	    		}
	    	}
	    }
	    
	    RowComposite gotoFrame = new RowComposite(CB, SWT.LEFT, SWT.HORIZONTAL, false, 7, 7, 0, 0, 10);
	    gotoFrame.setBackground(Resources.CONTROL_BAR_COLOR);
	    gotoFrame.setLayoutData(new RowData(250, 40));
	    
	    final RowComposite textFrame = new RowComposite(gotoFrame, SWT.LEFT, SWT.HORIZONTAL, false, 3, 3, 0, 0, -1);
	    textFrame.setBackground(Resources.SPLIT_COLOR);
	    Text m_people1 = new Text(textFrame, SWT.LEFT);
	    m_people1.setFont(Resources.FONT11);
	    m_people1.setBackground(Resources.SPLIT_COLOR);
	    m_people1.setForeground(Resources.TEXT_COLOR);
	    m_people1.setLayoutData(new RowData(200, 40 - 20));
	    Utils.addEnterListener(m_people1, "onEnterPressed", m_wholeWindow);
	    
	    Event enterKey = new Event();
	    enterKey.widget = m_people1;
	    enterKey.type = SWT.KeyUp;
	    enterKey.keyCode = '\r';
	    Listener enterLis[] = m_people1.getListeners(SWT.KeyUp);
	    for(Listener enterLi:enterLis){
	    	enterLi.handleEvent(enterKey);
	    }
	    enterKey.keyCode = 'd';
	    enterLis = m_people1.getListeners(SWT.KeyUp);
	    for(Listener enterLi:enterLis){
	    	enterLi.handleEvent(enterKey);
	    }
	    enterKey.type = SWT.KeyDown;
	    enterLis = m_people1.getListeners(SWT.KeyDown);
	    for(Listener enterLi:enterLis){
	    	enterLi.handleEvent(enterKey);
	    }
	    
	    
	    
	    
	    UserPage m_userPage = new UserPage(m_wholeWindow, tweet.getUser(), "TWEETS", 1200, 
	            700 - 40, 300, 98, 520, 260, "onNameLinkClicked", m_wholeWindow,false);
	    UserPage m_userPage2 = new UserPage(m_wholeWindow, tweet.getUser(), "FOLLOWING", 1200, 
	            700 - 40, 300, 98, 520, 260, "onNameLinkClicked", m_wholeWindow,false);
	    UserPage m_userPage3 = new UserPage(m_wholeWindow, tweet.getUser(), "FOLLOWERS", 1200, 
	            700 - 40, 300, 98, 520, 260, "onNameLinkClicked", m_wholeWindow,false);
	   // UserPage m_userPage4 = new UserPage(m_wholeWindow, tweet.getUser(), "FAVORITES", 1200, 
	     //       700-40, 100, 100, 1, 1, "onNameLinkClicked", m_wholeWindow);
	    //UserPage m_userPage5 = new UserPage(m_wholeWindow, tweet.getUser(), "LISTS", 1200, 
	      //      700 - 40, 300, 98, 520, 260, "onNameLinkClicked", m_wholeWindow);
	    
	    ConfigurationBuilder builder = new ConfigurationBuilder();
	    TwitterFactory factory = new TwitterFactory(builder .build());
	    Twitter twitter1 = factory.getInstance();
	    
	    List<Status> statuslist = twitter.getHomeTimeline();
	    PagableResponseList<User> friends = twitter.getFollowersList(12, 12);
	    MockUser friend1 = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    friends.add(friend1);
	    
	    
	    UserPageControl m_userPageControl = new UserPageControl(m_userPage);
	    m_userPageControl.showFollowersListCallback(friends);
	    m_userPageControl.showFollowingListCallback(friends);
	    m_userPageControl.showTweetsListCallback(tweets);
	    
	    
	    m_userPage.showFollowersList(friends);
	    
	    Control control_userPages[] = m_userPage.getChildren();
	    for(Control control_userPage:control_userPages){
	    	if(control_userPage instanceof RowComposite){
	    		Control tempCUs[] = ((RowComposite) control_userPage).getChildren();
	    		for(Control tempCU:tempCUs){
	    			if(tempCU instanceof ListView){
	    				Listener userPage_Lis[] = tempCU.getListeners(SWT.Resize);
	    				for(Listener userPage_Li:userPage_Lis){
	    					userPage_Li.handleEvent(null);
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    m_userPage.showFollowingList(friends);
	    
	    control_userPages = m_userPage.getChildren();
	    for(Control control_userPage:control_userPages){
	    	if(control_userPage instanceof RowComposite){
	    		Control tempCUs[] = ((RowComposite) control_userPage).getChildren();
	    		for(Control tempCU:tempCUs){
	    			if(tempCU instanceof ListView){
	    				Listener userPage_Lis[] = tempCU.getListeners(SWT.Resize);
	    				for(Listener userPage_Li:userPage_Lis){
	    					userPage_Li.handleEvent(null);
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    m_userPage.showTweetsList(sTweet);
	    
	    control_userPages = m_userPage.getChildren();
	    for(Control control_userPage:control_userPages){
	    	if(control_userPage instanceof RowComposite){
	    		Control tempCUs[] = ((RowComposite) control_userPage).getChildren();
	    		for(Control tempCU:tempCUs){
	    			if(tempCU instanceof ListView){
	    				Listener userPage_Lis[] = tempCU.getListeners(SWT.Resize);
	    				for(Listener userPage_Li:userPage_Lis){
	    					userPage_Li.handleEvent(null);
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    m_userPage.onMenuItemClicked(null);	
	    m_userPage.tweetsListNextClicked(null);	
	    m_userPage.tweetsListBackClicked(null);    
	    m_userPage.followersListNextClicked(null);
	    m_userPage.followersListBackClicked(null);
	    m_userPage.followingListBackClicked(null);
	    m_userPage.followingListNextClicked(null);
		
	    m_wholeWindow.onEnterPressed(null);
	    
	    RowComposite numbersFrame = new RowComposite(shell, 0, SWT.HORIZONTAL, false, 0, 0, 0, 0, 1);
	    
	    NumberBarItem n = new NumberBarItem(numbersFrame, 25, "TWEETS",300, 90, Resources.MINI_PROFILE_COLOR, Resources.MINI_PROFILE_COLOR, Resources.MINI_PROFILE_COLOR, 
		        Resources.FONT11B, Resources.FONT7);
	    Event n_enter = new Event();
		n_enter.widget = n;
		n_enter.type = SWT.MouseEnter;
		Event n_exit = new Event();
		n_exit.widget = n;
		n_exit.type = SWT.MouseExit;
		Event n_hover = new Event();
		n_hover.widget = n;
		n_hover.type = SWT.MouseHover;
		
		Listener n_lis[] = n.getListeners(SWT.MouseEnter);
		for(Listener n_li:n_lis){
			n_li.handleEvent(n_enter);
		}
		n_exit.x = 10000;
		n_exit.y = 10000;
		n_lis = n.getListeners(SWT.MouseExit);
		for(Listener n_li:n_lis){
			n_li.handleEvent(n_exit);
		}
		n_exit.x = 5;
		n_exit.y = 5;
		n_lis = n.getListeners(SWT.MouseExit);
		for(Listener n_li:n_lis){
			n_li.handleEvent(n_exit);
		}
		n_lis = n.getListeners(SWT.MouseHover);
		for(Listener n_li:n_lis){
			n_li.handleEvent(n_hover);
		}
	    
	    
	    
	    
	    n.getNumber();
	    m_wholeWindow.onEnterPressed(null);
	    Event e = new Event();
	    e.widget = m_view;
	    //EventObject e = new EventObject(m_view);
	    MouseEvent m = new MouseEvent(e);
	    m_wholeWindow.onNameLinkClicked(m);
	    e.widget = n;
	    MouseEvent m1 = new MouseEvent(e);
	    m_wholeWindow.onNumberItemClicked(m1);
	    Button b = new Button(n,0);
	    e.widget = b;
	    MouseEvent mb = new MouseEvent(e);
	    m_wholeWindow.onNumberItemClicked(mb);
	    
	    MockUser friend = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
	    
	    User m_user = TwitterControl.getAccountUser();
	    FriendView friendView = new FriendView(shell, m_user, 10, null, null,true);
	    e.widget = friendView;
	    MouseEvent m2 = new MouseEvent(e);
	    m_wholeWindow.onNameLinkClicked(m2);
	    
	    int miniProfileWidth = 1200;
	    int miniProfileHeight = 700-40;
	    
	    RowComposite leftFrame = new RowComposite(shell, 0, SWT.VERTICAL, false, 0, 0, 0, 0, 0);
	    leftFrame.setBackground(Resources.WHITE_COLOR);
	    leftFrame.setLayoutData(new RowData(miniProfileWidth, -1));
	    MiniProfile m_miniProfile = new MiniProfile(leftFrame, m_user, miniProfileWidth, miniProfileHeight);
	    friend.OriginalProfileImageURL = null;
	    MiniProfile mockMiniProfile1 = new MiniProfile(leftFrame, friend, miniProfileWidth, miniProfileHeight);
	    friend.OriginalProfileImageURL = "..........";
	    MiniProfile mockMiniProfile2 = new MiniProfile(leftFrame, friend, miniProfileWidth, miniProfileHeight);

	    m_miniProfile.setLayoutData(new RowData(miniProfileWidth, miniProfileHeight));
	    m_miniProfile.getUser();
	    
	    Event enter = new Event();
		enter.widget = m_miniProfile;
		enter.type = SWT.MouseEnter;
		Event exit = new Event();
		exit.widget = m_miniProfile;
		exit.type = SWT.MouseExit;
		Event hover = new Event();
		hover.widget = m_miniProfile;
		hover.type = SWT.MouseHover;
		
		Listener lis[] = m_miniProfile.getListeners(SWT.MouseEnter);
		for(Listener li:lis){
			li.handleEvent(enter);
		}
		exit.x = 10000;
		exit.y = 10000;
		lis = m_miniProfile.getListeners(SWT.MouseExit);
		for(Listener li:lis){
			li.handleEvent(exit);
		}
		exit.x = 5;
		exit.y = 5;
		lis = m_miniProfile.getListeners(SWT.MouseExit);
		for(Listener li:lis){
			li.handleEvent(exit);
		}
		lis = m_miniProfile.getListeners(SWT.MouseHover);
		for(Listener li:lis){
			li.handleEvent(hover);
		}
		
	    e.widget = m_miniProfile;
	    MouseEvent m3 = new MouseEvent(e);
	    m_wholeWindow.onNameLinkClicked(m3);
	    
	    Button b1 = new Button(m_view,0);
	    e.widget = b1;
	    MouseEvent mb1 = new MouseEvent(e);
	    m_wholeWindow.onNameLinkClicked(mb1);
	    //Event e = new Event();
	    //e.item = n;
	    //e.type = SWT.MouseDoubleClick;
	    //n.addListener(SWT.MouseDoubleClick, null);
	    //display.post(e);
	    
	    RowComposite buttonFrame = new RowComposite(shell, SWT.LEFT, SWT.HORIZONTAL, false, 10, 0, 0, 0, 40);
	    buttonFrame.setBackground(Resources.CONTROL_BAR_COLOR);
	    buttonFrame.setLayoutData(new RowData(-1, 40));
	    
	    // set Home button
	    ControlBarItem m_home = new ControlBarItem(buttonFrame, "Home", Resources.HOME_IMG, Resources.HOME_HOVER_IMG);
	    m_home.setLayoutData(new RowData(Resources.HOME_IMG.getBounds().width, 
	                                   Resources.HOME_IMG.getBounds().height));
	    Utils.addClickListener(m_home, "onCtrlBtnClicked", "onEnterPressed");
	    // set Me button
	    ControlBarItem m_me = new ControlBarItem(buttonFrame, "Me", Resources.ME_IMG, Resources.ME_HOVER_IMG);
	    m_me.setLayoutData(new RowData(Resources.ME_IMG.getBounds().width, 
	                                   Resources.ME_IMG.getBounds().height));
	    Utils.addClickListener(m_me, "onCtrlBtnClicked", "onEnterPressed");
	    
	 // set Go TO People button
	    ControlBarItem m_people = new ControlBarItem(buttonFrame, "Go to people", Resources.PEOPLE_IMG, Resources.PEOPLE_HOVER_IMG);
	    m_people.setLayoutData(new RowData(Resources.PEOPLE_IMG.getBounds().width, 
	                                   Resources.PEOPLE_IMG.getBounds().height));
	    Utils.addClickListener(m_people, "onCtrlBtnClicked", "onEnterPressed");
	    
	    ControlBarItem m_people0 = new ControlBarItem(buttonFrame, "Go", Resources.PEOPLE_IMG, Resources.PEOPLE_HOVER_IMG);
	    m_people.setLayoutData(new RowData(Resources.PEOPLE_IMG.getBounds().width, 
	                                   Resources.PEOPLE_IMG.getBounds().height));
	    Utils.addClickListener(m_people, "onCtrlBtnClicked", "onEnterPressed");
	    
	    Event Ectr = new Event();
	    Ectr.widget = m_home;
	    MouseEvent mEctr = new MouseEvent(Ectr);
	    m_wholeWindow.onCtrlBtnClicked(mEctr);
	    
	    Control control_WholePages[] = m_wholeWindow.getChildren();
	    for(Control control_WholePage:control_WholePages){
	    	if(control_WholePage instanceof HomePage){
	    		Listener WholePageLis[] = control_WholePage.getListeners(SWT.Resize);
	    		for(Listener WholePageLi : WholePageLis){
	    			WholePageLi.handleEvent(null);
	    		}
	    	}
	    }
	    
	    
	    Ectr.widget = m_me;
	    MouseEvent mEctr1 = new MouseEvent(Ectr);
	    m_wholeWindow.onCtrlBtnClicked(mEctr1);
	    
	    control_WholePages = m_wholeWindow.getChildren();
	    for(Control control_WholePage:control_WholePages){
	    	if(control_WholePage instanceof UserPage){
	    		Listener WholePageLis[] = control_WholePage.getListeners(SWT.Resize);
	    		for(Listener WholePageLi : WholePageLis){
	    			WholePageLi.handleEvent(null);
	    		}
	    	}
	    }
	    Ectr.widget = m_people;
	    MouseEvent mEctr2 = new MouseEvent(Ectr);
	    m_wholeWindow.onCtrlBtnClicked(mEctr2);
	    /**************************************
	     * WholePage m_wholeWindowTest = new WholePage(scrollContainer, 1200, 700);
	     * Control CWholeWindowTests[] = m_wholeWindowTest.getChildren();
	     * for(Control CWholeWindowTest: CWholeWindowTests){
	     *	   if(CWholeWindowTest instanceof ControlBar){
	     *			CWholeWindowTest = null;
	     *	   }
	     * }
	     * ***********************************/
	    
	    
	    
	    
	    
	    
	    Ectr.widget = m_people0;
	    MouseEvent mEctr3 = new MouseEvent(Ectr);
	    m_wholeWindow.onCtrlBtnClicked(mEctr3);
	    
	    Button bCtr = new Button(m_me,0);
	    Ectr.widget = bCtr;
	    MouseEvent mbCtr = new MouseEvent(Ectr);
	    m_wholeWindow.onCtrlBtnClicked(mbCtr);
	    
	    
	    
	    HomePage m_homePage = new HomePage(m_wholeWindow, 1200, 
	            700 - 40, 300, 56, 520, "onNameLinkClicked", "onNumberItemClicked", m_wholeWindow);
	    HomePage m_homePage1 = new HomePage(m_wholeWindow, 1200, 
	            700 - 40, 300, 56, 520, "onNameLinkClicked", "onNumberItemClicked", m_wholeWindow);
	    HomePage miniPageHeight0 = new HomePage(m_wholeWindow, 1200, 
	            0, 300, 56, 520, "onNameLinkClicked", "onNumberItemClicked", m_wholeWindow);
	    HomePage miniPageHeightInf = new HomePage(m_wholeWindow, 1200, 
	            9999999, 300, 56, 520, "onNameLinkClicked", "onNumberItemClicked", m_wholeWindow);
	    m_homePage.showTweetsList(sTweet);
	    
	    
	    Control control_homePage[] = m_homePage.getChildren();
	    for(Control c:control_homePage){
	    	if(c instanceof RowComposite){
	    		Control tempC_homePages[] = ((RowComposite) c).getChildren();
	    		for(Control tempC_homePage:tempC_homePages){
	    			if(tempC_homePage instanceof ListView){
		    			Listener listener_homePage[] = tempC_homePage.getListeners(SWT.Resize);
			    		for(Listener li_homePage:listener_homePage){
			    			li_homePage.handleEvent(null);
			    		}
	    			}
	    		}
	    	}
	    }
	    
	    ListView LV = new ListView(shell,"TEST", 0,"Back",this,"Next",this);
		  RowComposite headerFrame = new RowComposite(LV, 0, SWT.HORIZONTAL, true, 0, 0, 10, 10, -1);
	      headerFrame.setLayoutData(new RowData(LV.getBounds().width, 44));
	      headerFrame.setBackground(Resources.WHITE_COLOR);
	      headerFrame.setAlignMiddle(44);
	      
	      RowComposite rightHeaderFrame = new RowComposite(headerFrame, 0, SWT.HORIZONTAL, false, 0, 0, 0, 0, 5);
	      rightHeaderFrame.setLayoutData(new RowData(30, 13));
	      ClickableComposite backButtonView = new ClickableComposite(rightHeaderFrame);
	      backButtonView.setLayout(new FillLayout());
	      backButtonView.setLayoutData(new RowData(Resources.BACK_IMG.getBounds().width, 
	                                               Resources.BACK_IMG.getBounds().height));
	      ClickableImageLabel imageLabel = new ClickableImageLabel(backButtonView, 0, Resources.BACK_IMG, 
	          Resources.BACK_CLICKED_IMG, "tweetsListNextClicked",m_homePage);
	      Utils.addClickListener(imageLabel, "tweetsListNextClicked",m_homePage);
	   Event CILenter = new Event();
	   CILenter.widget = imageLabel;
	   CILenter.type = SWT.MouseEnter;
	   Event CILexit = new Event();
	   CILexit.widget = imageLabel;
	   CILexit.type = SWT.MouseExit;
	   Event CILhover = new Event();
	   CILhover.widget = imageLabel;
	   CILhover.type = SWT.MouseHover;
	   Listener CILlis[] = imageLabel.getListeners(SWT.MouseEnter);
	   for(Listener CILli:CILlis){
		   CILli.handleEvent(CILenter);
	   }
	   CILlis = imageLabel.getListeners(SWT.MouseExit);
	   for(Listener CILli:CILlis){
		   CILli.handleEvent(CILexit);
	   }
	   CILlis = imageLabel.getListeners(SWT.MouseHover);
	   for(Listener CILli:CILlis){
		   CILli.handleEvent(CILhover);
	   }
	   CILenter.type = SWT.MouseUp;
	   CILlis = imageLabel.getListeners(SWT.MouseUp);
	   for(Listener CILli:CILlis){
		   CILli.handleEvent(CILenter);
	   }
	   CILexit.type = SWT.MouseDown;
	   
	   CILlis = imageLabel.getListeners(SWT.MouseDown);
	   for(Listener CILli:CILlis){
		   CILli.handleEvent(CILexit);
	   }
	   CILhover.type = SWT.MouseDoubleClick;
	   CILlis = imageLabel.getListeners(SWT.MouseDoubleClick);
	   for(Listener CILli:CILlis){
		   CILli.handleEvent(CILhover);
	   }
	   ClickableImageLabel imageLabelNull = new ClickableImageLabel(backButtonView, 0, Resources.BACK_IMG, 
		          Resources.BACK_CLICKED_IMG, null,this);
	   
	    
	    
	    
	    
	    m_homePage.tweetsListNextClicked(null);
	    int m_t = 0;
	    	m_homePage.tweetsListNextClicked(null);
	    	m_t++;
	    m_homePage.tweetsListBackClicked(null);
	    m_homePage.showTweetsList(sTweet);
	    miniPageHeightInf.showTweetsList(sTweet);
	    

	    Event eNull = new Event();
	    eNull.widget = shell;
	    MouseEvent mNull = new MouseEvent(eNull);
	    m_homePage1.tweetsListBackClicked(mNull); 

	    Event e1 = new Event();
		e1 .widget = n;
	    MouseEvent m_n = new MouseEvent(e1);
	    m_userPage.onNumberItemClicked(m_n);
	    m_userPage.onNumberItemClicked(mb);
	    m_userPage.getUser();
	    
	    
	    
	    m_rightFrame = new RowComposite(shell, 0, SWT.VERTICAL, false, 0, 0, 0, 0, 15);
	    m_rightFrame.setLayoutData(new RowData(520, -1));
	    
	    // set profile/number frame
	    RowComposite profileFrame = new RowComposite(m_rightFrame, 0, SWT.VERTICAL, false, 0, 0, 0, 0, 0);
	    profileFrame.setLayoutData(new RowData(520, -1));
	    ProfileView m_profile = new ProfileView(profileFrame, friend, 520, 260);
	    MockUser friend2 = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
	    friend2.ProfileBannerURL = ".....";
	    friend2.BiggerProfileImageURL = null;
	    friend2.Location = "....";
	    ProfileView oriImageNull = new ProfileView(profileFrame, friend2, 520, 260);
	    friend2.ProfileBannerURL = null;
	    friend2.Location = null;
	    friend2.BiggerProfileImageURL = ".....";
	    friend2.mockURLEntity.DisplayURL = "....";
	    friend2.mockURLEntity.getDisplayURL();
	    ProfileView profileBannerURLNull = new ProfileView(profileFrame, friend2, 520, 260);
	    
	    m_profile.setLayoutData(new RowData(520, 260));
	    m_profile.getWidth();
	    m_profile.getHeight();
	    Utils.cutRoundCorner(m_profile, true, true, false, false);
	    m_profile.getUser();
	    
	    ListView v = new ListView(shell,10);
	    v.addItem(m_itemList);
	    
	    
	    UserMenu fake = new UserMenu(shell,300,98,null,m_userPage);
	    UserMenuItem iFake = fake.getMenuItems().get(0);
	    Event FakeMenu = new Event();
	    FakeMenu.widget = iFake;
	    MouseEvent MouseFake = new MouseEvent(FakeMenu);
	    fake.onMenuItemClicked(MouseFake);
	    
	    
	    UserMenu m_leftMenu = new UserMenu(m_userPage, 300, 98, "onMenuItemClicked", m_userPage);
	    UserMenuItem item = m_leftMenu.getMenuItems().get(0);
	    Event eUserMenu = new Event();
	    eUserMenu.widget = item;
	    MouseEvent mUM = new MouseEvent(eUserMenu);
	    m_leftMenu.onMenuItemClicked(mUM);
	    
	    Button bMUM = new Button(item,0);
	   eUserMenu.widget = bMUM;
	   MouseEvent mBMUM = new MouseEvent(eUserMenu);
	   m_leftMenu.onMenuItemClicked(mBMUM);
	   
	   bMUM.dispose();
	   m_leftMenu.dispose();
	   v.dispose();
	   m_profile.dispose();
	   profileFrame.dispose();
	   m_homePage.dispose();
	   bCtr.dispose();
	   m_people.dispose();
	   m_me.dispose();
	   m_home.dispose();
	   buttonFrame.dispose();
	   b1.dispose();
	   m_miniProfile.dispose();
	   leftFrame.dispose();
	   friendView.dispose();
	   b.dispose();
	   n.dispose();
	   numbersFrame.dispose();
	    m_userPage3.dispose();
	   m_userPage2.dispose();
	  m_userPage.dispose();
	   control.dispose();
	   m_wholeWindow.dispose();
	   scrollContainer.dispose();	   
	   m_upperFrame.dispose();
	   m_view.dispose();
	   m_itemList.dispose();
	   //m_rightFrame.dispose();
	   
	}

	@Test
	public void testCompareTo() {
		MockUser friend = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
		MockUser friend1 = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
		friend.compareTo(friend1);
	}

	@Test
	public void testGetAccessLevel() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getAccessLevel();
	}

	@Test
	public void testGetRateLimitStatus() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getRateLimitStatus();
	}

	@Test
	public void testGetBiggerProfileImageURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getBiggerProfileImageURL();
	}

	@Test
	public void testGetBiggerProfileImageURLHttps() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getBiggerProfileImageURLHttps();
	}

	@Test
	public void testGetCreatedAt() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getCreatedAt();
	}



	@Test
	public void testGetDescriptionURLEntities() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getDescriptionURLEntities();
	}

	@Test
	public void testGetFavouritesCount() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getFavouritesCount();
	}

	@Test
	public void testGetFollowersCount() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getFollowersCount();
	}

	@Test
	public void testGetFriendsCount() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getFriendsCount();
	}

	@Test
	public void testGetId() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getId();
	}

	@Test
	public void testGetLang() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getLang();
	}

	@Test
	public void testGetListedCount() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getListedCount();
	}

	@Test
	public void testGetMiniProfileImageURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getMiniProfileImageURL();
	}

	@Test
	public void testGetMiniProfileImageURLHttps() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getMiniProfileImageURLHttps();
	}

	@Test
	public void testGetName() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getName();
	}

	@Test
	public void testGetOriginalProfileImageURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getOriginalProfileImageURL();
	}

	@Test
	public void testGetOriginalProfileImageURLHttps() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getOriginalProfileImageURLHttps();
	}

	@Test
	public void testGetProfileBackgroundColor() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBackgroundColor();
	}

	@Test
	public void testGetProfileBackgroundImageURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBackgroundImageURL();
	}

	@Test
	public void testGetProfileBackgroundImageUrl() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBackgroundImageUrl();
	}

	@Test
	public void testGetProfileBackgroundImageUrlHttps() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBackgroundImageUrlHttps();
	}

	@Test
	public void testGetProfileBannerIPadRetinaURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBannerIPadRetinaURL();
	}

	@Test
	public void testGetProfileBannerIPadURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBannerIPadURL();
	}

	@Test
	public void testGetProfileBannerMobileRetinaURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBannerMobileRetinaURL();
	}

	@Test
	public void testGetProfileBannerMobileURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBannerMobileURL();
	}

	@Test
	public void testGetProfileBannerRetinaURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBannerRetinaURL();
	}

	@Test
	public void testGetProfileBannerURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileBannerURL();
	}

	@Test
	public void testGetProfileImageURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileImageURL();
	}

	@Test
	public void testGetProfileImageURLHttps() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileImageURLHttps();
	}

	@Test
	public void testGetProfileImageUrlHttps() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileImageUrlHttps();
	}

	@Test
	public void testGetProfileLinkColor() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileLinkColor();
	}

	@Test
	public void testGetProfileSidebarBorderColor() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileSidebarBorderColor();
	}

	@Test
	public void testGetProfileSidebarFillColor() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileSidebarFillColor();
	}

	@Test
	public void testGetProfileTextColor() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getProfileTextColor();
	}

	@Test
	public void testGetScreenName() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getScreenName();
	}

	@Test
	public void testGetStatus() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getStatus();
	}

	@Test
	public void testGetStatusesCount() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getStatusesCount();
	}

	@Test
	public void testGetTimeZone() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getTimeZone();
	}

	@Test
	public void testGetURL() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getURL();
	}

	@Test
	public void testGetURLEntity() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getURLEntity();
	}

	@Test
	public void testGetUtcOffset() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").getUtcOffset();
	}

	@Test
	public void testIsContributorsEnabled() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isContributorsEnabled();
	}

	@Test
	public void testIsFollowRequestSent() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isFollowRequestSent();
	}

	@Test
	public void testIsGeoEnabled() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isGeoEnabled();
	}

	@Test
	public void testIsProfileBackgroundTiled() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isProfileBackgroundTiled();
	}

	@Test
	public void testIsProfileUseBackgroundImage() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isProfileUseBackgroundImage();
	}

	@Test
	public void testIsProtected() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isProtected();
	}

	@Test
	public void testIsShowAllInlineMedia() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isShowAllInlineMedia();
	}

	@Test
	public void testIsTranslator() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isTranslator();
	}

	@Test
	public void testIsVerified() {
		new MockUser("FakeUser", "FakeScreenName", true, "Fake Description").isVerified();
	}
	/*@AfterClass
	public static void testClient() throws TwitterException{
		TwitterClient.main(null);
	}*/

}

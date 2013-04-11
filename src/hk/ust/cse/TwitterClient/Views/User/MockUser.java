package hk.ust.cse.TwitterClient.Views.User;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.RateLimitStatus;
import twitter4j.Status;
import twitter4j.TwitterResponse;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;

@SuppressWarnings("serial")
public class MockUser implements User, TwitterResponse {

  public MockUser(String name, String screenName, boolean verified, String description) {
	mockURLEntity = new MockURLEntity();
	m_name        = name;
    m_screenName  = screenName;
    m_verified    = verified;
    m_description = description;
    OriginalProfileImageURL = "";
    ProfileBannerURL = "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
    BiggerProfileImageURL = "";
    StatusesCount = 0;
    //lalalalallalatest
  }
public class MockURLEntity implements URLEntity{

	public MockURLEntity(){
		getEnd();
		getExpandedURL();
		getExpandedURL();
		getStart();
		getURL();
	}
	@Override
	public String getDisplayURL() {
		// TODO 自动生成的方法存根
		return DisplayURL;
	}

	@Override
	public int getEnd() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public String getExpandedURL() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int getStart() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public String getURL() {
		// TODO 自动生成的方法存根
		return url;
	}
	public String url;
	public String DisplayURL;
};
public class MockPageList<T> extends ArrayList<User> implements PagableResponseList<User>{

	public MockPageList(){
		getRateLimitStatus();
		getAccessLevel();
		hasNext();
		hasPrevious();
	}
	@Override
	public RateLimitStatus getRateLimitStatus() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int getAccessLevel() {
		// TODO 自动生成的方法存根
		return 1;
	}

	@Override
	public long getNextCursor() {
		// TODO 自动生成的方法存根
		return 1;
	}

	@Override
	public long getPreviousCursor() {
		// TODO 自动生成的方法存根
		return 1;
	}

	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean hasPrevious() {
		// TODO 自动生成的方法存根
		return false;
	}
	
}

public class MockStatus implements Status{

	public MockStatus(){
		
		u = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
		compareTo(null);
		getAccessLevel();
		getRateLimitStatus();
		getHashtagEntities();
		getMediaEntities();
		getURLEntities();
		getUserMentionEntities();
		getContributors();
		getCreatedAt();
		getCurrentUserRetweetId();
		getGeoLocation();
		getId();
		getInReplyToScreenName();
		getInReplyToStatusId();
		getInReplyToUserId();
		getPlace();
		getRetweetCount();
		getRetweetedStatus();
		getSource();
		getText();
		getUser();
		isFavorited();
		isPossiblySensitive();
		isRetweet();
		isRetweetedByMe();
		isTruncated();
	}
	@Override
	public int compareTo(Status o) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int getAccessLevel() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public RateLimitStatus getRateLimitStatus() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public HashtagEntity[] getHashtagEntities() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public MediaEntity[] getMediaEntities() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public URLEntity[] getURLEntities() {
		// TODO 自动生成的方法存根
		return mURLE;
	}

	@Override
	public UserMentionEntity[] getUserMentionEntities() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public long[] getContributors() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Date getCreatedAt() {
		// TODO 自动生成的方法存根
		return new Date(System.currentTimeMillis()+10000);
	}

	@Override
	public long getCurrentUserRetweetId() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public GeoLocation getGeoLocation() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public long getId() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public String getInReplyToScreenName() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public long getInReplyToStatusId() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public long getInReplyToUserId() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Place getPlace() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public long getRetweetCount() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Status getRetweetedStatus() {
		// TODO 自动生成的方法存根
		return mStatus;
	}

	@Override
	public String getSource() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getText() {
		// TODO 自动生成的方法存根
		return "null";
	}

	@Override
	public User getUser() {
		// TODO 自动生成的方法存根
		return u;
	}

	@Override
	public boolean isFavorited() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean isPossiblySensitive() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean isRetweet() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean isRetweetedByMe() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean isTruncated() {
		// TODO 自动生成的方法存根
		return false;
	}
	
	public MockUser u;
	public MockURLEntity[] mURLE;
	public MockStatus mStatus;
	
}


  @Override  public int compareTo(User arg0) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getAccessLevel() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public RateLimitStatus getRateLimitStatus() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getBiggerProfileImageURL() {
    // TODO Auto-generated method stub
    return BiggerProfileImageURL;
  }

  @Override
  public String getBiggerProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date getCreatedAt() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getDescription() {
    return m_description;
  }

  @Override
  public URLEntity[] getDescriptionURLEntities() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getFavouritesCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getFollowersCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getFriendsCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public long getId() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getLang() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getListedCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getLocation() {
    // TODO Auto-generated method stub
    return Location;
  }

  @Override
  public String getMiniProfileImageURL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getMiniProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getName() {
    return m_name;
  }

  @Override
  public String getOriginalProfileImageURL() {
    // TODO Auto-generated method stub
    return OriginalProfileImageURL;
  }

  @Override
  public String getOriginalProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileBackgroundColor() {
    // TODO Auto-generated method stub
    return ProfileBackgroundColor;
  }

  @Override
  public String getProfileBackgroundImageURL() {
    // TODO Auto-generated method stub
    return ProfileBackgroundImageURL;
  }

  @Override
  public String getProfileBackgroundImageUrl() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileBackgroundImageUrlHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileBannerIPadRetinaURL() {
    // TODO Auto-generated method stub
    return ProfileBannerURL;
  }

  @Override
  public String getProfileBannerIPadURL() {
    // TODO Auto-generated method stub
    return ("https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png");
  }

  @Override
  public String getProfileBannerMobileRetinaURL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileBannerMobileURL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileBannerRetinaURL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileBannerURL() {
    // TODO Auto-generated method stub
	  return ProfileBannerURL;
  }

  @Override
  public String getProfileImageURL() {
    // TODO Auto-generated method stub
    return ProfileImageURL;
  }

  @Override
  public String getProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public URL getProfileImageUrlHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileLinkColor() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileSidebarBorderColor() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileSidebarFillColor() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileTextColor() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getScreenName() {
    return m_screenName;
  }

  @Override
  public Status getStatus() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getStatusesCount() {
    // TODO Auto-generated method stub
    return StatusesCount;
  }

  @Override
  public String getTimeZone() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getURL() {
    // TODO Auto-generated method stub
    return null;
  }

  
  @Override
  public URLEntity getURLEntity() {
    // TODO Auto-generated method stub
    return mockURLEntity;
  }

  
  @Override
  public int getUtcOffset() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isContributorsEnabled() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isFollowRequestSent() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isGeoEnabled() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isProfileBackgroundTiled() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isProfileUseBackgroundImage() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isProtected() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isShowAllInlineMedia() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isTranslator() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isVerified() {
    return m_verified;
  }
  
  public String ProfileImageURL;
  public String ProfileBackgroundImageURL;
  public String ProfileBackgroundColor;
  public int StatusesCount;
  public String Location;
  public MockURLEntity mockURLEntity;
  public String BiggerProfileImageURL;
  public String ProfileBannerURL;
  public String OriginalProfileImageURL;
  private final String  m_name;
  private final String  m_screenName;
  private final String  m_description;
  private final boolean m_verified;

}


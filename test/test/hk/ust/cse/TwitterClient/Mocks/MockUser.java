package test.hk.ust.cse.TwitterClient.Mocks;

import java.net.URL;
import java.util.Date;

import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Place;
import twitter4j.RateLimitStatus;
import twitter4j.Status;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;

@SuppressWarnings("serial")
public class MockUser implements User {

  public MockUser(String name, String screenName, boolean verified, String description) {
    m_name        = name;
    m_screenName  = screenName;
    m_verified    = verified;
    m_description = description;
    m_urlentity   = new URLEntity() {
		
		@Override
		public String getURL() {
			if(m_name=="FakeUser"){
			    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
		  else if(m_name=="FakeUser1"){
			  return "";
		  }
		  else if(m_name=="FakeUserI"){
			  return "";
		  }
		  else if(m_name=="FakeUserJ"){
			  return "bbbb";
		  }
				  else {
					return null;
				}
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
			if(m_name=="FakeUser"){
			    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
		  else if(m_name=="FakeUser1"){
			  return "";
		  }
		  else if(m_name=="FakeUserI"){
			  return "";
		  }
		  else if(m_name=="FakeUserJ"){
			  return "bbbb";
		  }
				  else {
					return null;
				}
		}
	};
	m_urlentityArray = new URLEntity[1];
	m_urlentityArray[0] = m_urlentity;
	
  }
  
  @Override
  public int compareTo(User arg0) {
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
	  if(m_name=="FakeUser"){
		    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
			  else if(m_name=="FakeUser1"){
				  return "";
			  }
			  else {
				return null;
			}
  }

  @Override
  public String getBiggerProfileImageURLHttps() {
	  if(m_name=="FakeUser"){
		    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
			  else if(m_name=="FakeUser1"){
				  return "";
			  }
			  else {
				return null;
			}
  }

  @Override
  public Date getCreatedAt() {
    Date d=new Date();
    d.setTime(0);
    return d;
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
    return "abcdef";
  }

  @Override
  public int getListedCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getLocation() {
	  if(m_name=="FakeUser"){
		    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
	  else if(m_name=="FakeUser1"){
		  return "";
	  }
	  else if(m_name=="FakeUserI"){
		  return "aaaa";
	  }
	  else if(m_name=="FakeUserJ"){
		  return "";
	  }
			  else {
				return null;
			}
  }

  @Override
  public String getMiniProfileImageURL() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getMiniProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getName() {
    return m_name;
  }

  @Override
  public String getOriginalProfileImageURL() {
   if(m_name=="FakeUser"){
    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
   else if(m_name=="FakeUser1"){
	   return "aa";
   }
	  else {
		return null;
	}
  }

  @Override
  public String getOriginalProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBackgroundColor() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBackgroundImageURL() {////////////
	  if(m_name=="FakeUser"){
    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
	  else if (m_name=="FakeUser1"){
		  return null;
	  }
	  else {
		return "";
	}
  }

  @Override
  public String getProfileBackgroundImageUrl() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBackgroundImageUrlHttps() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBannerIPadRetinaURL() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBannerIPadURL() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBannerMobileRetinaURL() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBannerMobileURL() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getProfileBannerRetinaURL() {
    // TODO Auto-generated method stub
    return "abcdef";
  }
  
  @Override
  public String getProfileBannerURL() {
    // TODO Auto-generated method stub
	  if(m_name=="FakeUser"){
    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
	  else if(m_name=="FakeUser1"){
		  return "";
	  }
	  else {
		return null;
	}
  }
  

  @Override
  public String getProfileImageURL() {
    if(m_name=="FakeUser"){
    	return null;
    }
    else if(m_name=="FakeUser1"){
    	return "";
    }
    else{
    	  return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";
    }
  }
  
  public String getProfileImageURL(String a) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileImageURLHttps() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public URL getProfileImageUrlHttps() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProfileLinkColor() {
    // TODO Auto-generated method stub
    return "red";
  }

  @Override
  public String getProfileSidebarBorderColor() {
    // TODO Auto-generated method stub
    return "red";
  }

  @Override
  public String getProfileSidebarFillColor() {
    // TODO Auto-generated method stub
    return "red";
  }

  @Override
  public String getProfileTextColor() {
    // TODO Auto-generated method stub
    return "red";
  }

  @Override
  public String getScreenName() {
    return m_screenName;
  }

  @Override
  public Status getStatus() {
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
					return "";
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
					if(m_name=="FakeUser"){
					    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
				  else if(m_name=="FakeUser1"){
					  return "";
				  }
				  else if(m_name=="FakeUserI"){
					  return "";
				  }
				  else if(m_name=="FakeUserJ"){
					  return "bbbb";
				  }
						  else {
							return null;
						}
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
			MockUser mockUser=new MockUser("", "", true, "");
			return mockUser;
		}
		
		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return "";
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
			Date date=new Date();
			return date;
		}
		
		@Override
		public long[] getContributors() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	return status;
  }

  @Override
  public int getStatusesCount() {
    // TODO Auto-generated method stub
    return 1000000000;
  }

  @Override
  public String getTimeZone() {
    // TODO Auto-generated method stub
    return "abcdef";
  }

  @Override
  public String getURL() {
	  if(m_name=="FakeUser"){
		    return "https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png";}
	  else if(m_name=="FakeUser1"){
		  return "";
	  }
	  else if(m_name=="FakeUserI"){
		  return "";
	  }
	  else if(m_name=="FakeUserJ"){
		  return "bbbb";
	  }
			  else {
				return null;
			}
  }

  @Override
  public URLEntity getURLEntity() {
    return m_urlentity;
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

  private final String  m_name;
  private final String  m_screenName;
  private final String  m_description;
  private final boolean m_verified;
  public URLEntity m_urlentity;
  public URLEntity[] m_urlentityArray;


}

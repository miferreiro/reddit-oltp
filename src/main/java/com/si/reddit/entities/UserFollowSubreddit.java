package com.si.reddit.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(UserFollowSubreddit.class)
public class UserFollowSubreddit implements Serializable{
    @Id
    @ManyToOne
    private User user;

    @Id
    @ManyToOne
    private Subreddit subreddit;
    
    public UserFollowSubreddit() {    	
    }
    
    public UserFollowSubreddit(User user, Subreddit subreddit) {
    	this.user = user;
    	this.subreddit = subreddit;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Subreddit getSubreddit() {
		return subreddit;
	}

	public void setSubreddit(Subreddit subreddit) {
		this.subreddit = subreddit;
	}
    
	@Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.user);
        hash = 53 * hash + Objects.hashCode(this.subreddit);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserFollowSubreddit other = (UserFollowSubreddit) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.subreddit, other.subreddit)) {
            return false;
        }
        return true;
    }
    
	@Override
	public String toString() {
		return "UserFollowSubreddit {" + "User=" + user + ", subreddit=" + subreddit + "}";
	}
}
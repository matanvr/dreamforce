package com.dreamforce.lunchlearn;

import java.util.Date;
import java.util.UUID;

import android.location.Location;

public class Lunch {

	    public String getmDescription() {
		return mDescription;
	}
	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}
		public UUID getmId() {
		return mId;
	}
	public void setmId(UUID mId) {
		this.mId = mId;
	}
	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	public Location getmLocation() {
		return mLocation;
	}
	public void setmLocation(Location mLocation) {
		this.mLocation = mLocation;
	}
	public String getmURL() {
		return mURL;
	}
	public void setmURL(String mURL) {
		this.mURL = mURL;
	}
	public String getmOwner() {
		return mOwner;
	}
	public void setmOwner(String mOwner) {
		this.mOwner = mOwner;
	}
	public int getmMinAttendees() {
		return mMinAttendees;
	}
	public void setmMinAttendees(int mMinAttendees) {
		this.mMinAttendees = mMinAttendees;
	}
	public int getmMaxAttendees() {
		return mMaxAttendees;
	}
	public void setmMaxAttendees(int mMaxAttendees) {
		this.mMaxAttendees = mMaxAttendees;
	}
	public int getmAttendees() {
		return mAttendees;
	}
	public void setmAttendees(int mAttendees) {
		this.mAttendees = mAttendees;
	}
		private UUID mId;
	    private String mTitle;
	    private Date mDate;
	    private Location mLocation;
	    private String mURL;
	    private String mOwner;
	    private int mMinAttendees;
	    private int mMaxAttendees;
	    private int mAttendees;
	    private String mDescription;

	

}

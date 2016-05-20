package com.example.user.projectnineparsingjson.model;


import java.util.Date;
import java.util.List;

public class Member {
    private String mId;
    private int mIndex;
    private String mGuid;
    private boolean mIsActive;
    private String mBalance;
    private String mPicture;
    private int mAge;
    private String mEyeColor;
    private String mName;
    private String mGender;
    private String mCompany;
    private String mEmail;
    private String mPhone;
    private String mAddress;
    private String mAbout;
    private Date mRegistered;
    private float mLatitude;
    private float mLongitude;
    private List<String> mTags;
    private List<Friend> mFriends;
    private String mGreeting;
    private String mFavoriteFruit;

    public Member(String id, int index, String guid, boolean isActive, String balance, String picture, int age, String eyeColor, String name, String gender, String company, String email, String phone, String address, String about, Date registered, float latitude, float longitude, List<String> tags, List<Friend> friends, String greeting, String favoriteFruit) {
        this.mId = id;
        this.mIndex = index;
        this.mGuid = guid;
        this.mIsActive = isActive;
        this.mBalance = balance;
        this.mPhone = picture;
        this.mAge = age;
        this.mEyeColor = eyeColor;
        this.mName = name;
        this.mGender = gender;
        this.mCompany = company;
        this.mEmail = email;
        this.mPhone = phone;
        this.mAddress = address;
        this.mAbout = about;
        this.mRegistered = registered;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
        this.mTags = tags;
        this.mFriends = friends;
        this.mGreeting = greeting;
        this.mFavoriteFruit = favoriteFruit;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int index) {
        this.mIndex = index;
    }

    public String getGuid() {

        return mGuid;
    }

    public void setGuid(String guid) {
        this.mGuid = guid;
    }

    public boolean isActive() {
        return mIsActive;
    }

    public void setActive(boolean active) {
        mIsActive = active;
    }

    public String getBalance() {
        return mBalance;
    }

    public void setBalance(String balance) {
        this.mBalance = balance;
    }

    public String getPicture() {
        return mPicture;
    }

    public void setPicture(String picture) {
        this.mPicture = picture;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        this.mAge = age;
    }

    public String getEyeColor() {
        return mEyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.mEyeColor = eyeColor;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        this.mGender = gender;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String company) {
        this.mCompany = company;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        this.mAddress = address;
    }

    public String getAbout() {
        return mAbout;
    }

    public void setAbout(String about) {
        this.mAbout = about;
    }

    public Date getRegistered() {
        return mRegistered;
    }

    public void setRegistered(Date registered) {
        this.mRegistered = registered;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public void setLatitude(float latitude) {
        this.mLatitude = latitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Long longitude) {
        this.mLongitude = longitude;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setTags(List<String> tags) {
        this.mTags = tags;
    }

    public List<Friend> getFriends() {
        return mFriends;
    }

    public void setFriends(List<Friend> friends) {
        this.mFriends = friends;
    }

    public String getGreeting() {
        return mGreeting;
    }

    public void setGreeting(String greeting) {
        this.mGreeting = greeting;
    }

    public String getFavoriteFruit() {
        return mFavoriteFruit;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.mFavoriteFruit = favoriteFruit;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mId='" + mId + '\'' +
                ", mIndex=" + mIndex +
                ", mGuid='" + mGuid + '\'' +
                ", mIsActive=" + mIsActive +
                ", mBalance='" + mBalance + '\'' +
                ", mPicture='" + mPicture + '\'' +
                ", mAge=" + mAge +
                ", mEyeColor='" + mEyeColor + '\'' +
                ", mName='" + mName + '\'' +
                ", mGender='" + mGender + '\'' +
                ", mCompany='" + mCompany + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mAbout='" + mAbout + '\'' +
                ", mRegistered=" + mRegistered +
                ", mLatitude=" + mLatitude +
                ", mLongitude=" + mLongitude +
                ", mTags=" + mTags +
                ", mFriends=" + mFriends +
                ", mGreeting='" + mGreeting + '\'' +
                ", mFavoriteFruit='" + mFavoriteFruit + '\'' +
                '}';
    }
}

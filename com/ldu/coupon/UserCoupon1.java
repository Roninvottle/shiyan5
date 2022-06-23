package com.ldu.coupon;

public class UserCoupon1 extends Coupon {
    private String id;
    private String user_id;
    private String buyers_id;

    public UserCoupon1(String id, String user_id, String buyers_id) {
        this.id = id;
        this.user_id = user_id;
        this.buyers_id = buyers_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBuyers_id() {
        return buyers_id;
    }

    public void setBuyers_id(String buyers_id) {
        this.buyers_id = buyers_id;
    }
}

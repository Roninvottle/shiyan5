package com.ldu.coupon;

import java.util.ArrayList;

public class UserCoupon {
    private String id;
    private String coupon_id;
    private String user_id;
    private String buyers_id;
    private String coupon_name;
    private String coupon_type;
    private Double condition_amount;
    private String benefit_amount;
    private String create_time;
    private Boolean coupon_status;
    private String start_time;
    private String end_time;
    private String expire_time;

    public UserCoupon(String id, String coupon_id, String user_id, String buyers_id, String coupon_name, String coupon_type, Double condition_amount, String benefit_amount, String create_time, Boolean coupon_status, String start_time, String end_time, String expire_time) {
        this.id = id;
        this.coupon_id = coupon_id;
        this.user_id = user_id;
        this.buyers_id = buyers_id;
        this.coupon_name = coupon_name;
        this.coupon_type = coupon_type;
        this.condition_amount = condition_amount;
        this.benefit_amount = benefit_amount;
        this.create_time = create_time;
        this.coupon_status = coupon_status;
        this.start_time = start_time;
        this.end_time = end_time;
        this.expire_time = expire_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserCoupon() {
    }

    public String getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(String coupon_id) {
        this.coupon_id = coupon_id;
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

    public String getCoupon_name() {
        return coupon_name;
    }

    public void setCoupon_name(String coupon_name) {
        this.coupon_name = coupon_name;
    }

    public String getCoupon_type() {
        return coupon_type;
    }

    public void setCoupon_type(String coupon_type) {
        this.coupon_type = coupon_type;
    }

    public Double getCondition_amount() {
        return condition_amount;
    }

    public void setCondition_amount(Double condition_amount) {
        this.condition_amount = condition_amount;
    }

    public String getBenefit_amount() {
        return benefit_amount;
    }

    public void setBenefit_amount(String benefit_amount) {
        this.benefit_amount = benefit_amount;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Boolean getCoupon_status() {
        return coupon_status;
    }

    public void setCoupon_status(Boolean coupon_status) {
        this.coupon_status = coupon_status;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    public ArrayList<UserCoupon> getAll(){
        return null;
    }

    public ArrayList<UserCoupon> getAll_used_coupon(){
        return null;
    }

    public String get_popular_type(){
        return null;
    }

    public Boolean get_coupon_status(){
        return null;
    };
}

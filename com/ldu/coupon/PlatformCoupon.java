package com.ldu.coupon;


public class PlatformCoupon extends Coupon{
    private String id;
    private String platform_coupon_user_id;

    public PlatformCoupon(String id, String platform_coupon_user_id) {
        super();
        this.id = id;
        this.platform_coupon_user_id = platform_coupon_user_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlatform_coupon_user_id() {
        return platform_coupon_user_id;
    }

    public void setPlatform_coupon_user_id(String platform_coupon_user_id) {
        this.platform_coupon_user_id = platform_coupon_user_id;
    }
}

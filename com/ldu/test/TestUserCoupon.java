package com.ldu.test;

import com.ldu.coupon.UserCoupon;

import java.util.ArrayList;
import java.util.HashMap;

public class TestUserCoupon {
    ArrayList<UserCoupon> userCouponList = new ArrayList<>();


    public static void main(String[] args) {
        TestUserCoupon testUserCoupon = new TestUserCoupon();
        testUserCoupon.createUserCoupon();
        testUserCoupon.getUserCouponList();
        testUserCoupon.getPopularUserCoupon();
    }

    public void createUserCoupon() {
        UserCoupon userCoupon1 = new UserCoupon("1", "1", "1", "1", "优惠券1", "现金券", 20D, null, "2022-05-11", true, "2022-05-11", null, "2022-05-20");
        UserCoupon userCoupon2 = new UserCoupon("2", "2", "2", "1", "优惠券2", "满减券", null, "100/20", "2022-05-11", true, "2022-05-11", null, "2022-05-20");
        UserCoupon userCoupon3 = new UserCoupon("3", "3", "3", "2", "优惠券3", "现金券", 20D, null, "2022-05-11", true, "2022-05-15", "2022-05-16", "2022-05-20");
        UserCoupon userCoupon4 = new UserCoupon("4", "3", "3", "3", "优惠券3", "现金券", 20D, null, "2022-05-11", true, "2022-05-15", "2022-05-16", "2022-05-20");
        UserCoupon userCoupon5 = new UserCoupon("5", "3", "3", "4", "优惠券3", "现金券", 20D, null, "2022-05-11", true, "2022-05-15", "2022-05-16", "2022-05-20");

        userCouponList.add(userCoupon1);
        userCouponList.add(userCoupon2);
        userCouponList.add(userCoupon3);
        userCouponList.add(userCoupon4);
        userCouponList.add(userCoupon5);

    }


    public void getUserCouponList() {
        for (UserCoupon userCoupon : userCouponList) {
            System.out.println("优惠券id" + userCoupon.getCoupon_id());
            System.out.println("用户id" + userCoupon.getUser_id());
            System.out.println("买家id" + userCoupon.getBuyers_id());
            System.out.println("优惠券名称" + userCoupon.getCoupon_name());
            System.out.println("优惠券类别" + userCoupon.getCoupon_type());
            System.out.println("现金券优惠金额" + userCoupon.getCondition_amount());
            System.out.println("满减券（/分割）" + userCoupon.getBenefit_amount());
            System.out.println("创建时间" + userCoupon.getCreate_time());
            System.out.println("优惠券状态" + userCoupon.getCoupon_status());
            System.out.println("开始时间" + userCoupon.getStart_time());
            System.out.println("使用时间" + userCoupon.getEnd_time());
            System.out.println("过期时间" + userCoupon.getExpire_time());
            System.out.println();
        }
    }

    public void getPopularUserCoupon() {
        HashMap<String, Long> popularCoupon = new HashMap<>();
        for (UserCoupon userCoupon : userCouponList) {
            if (!popularCoupon.containsKey(userCoupon.getCoupon_id())) {
                popularCoupon.put(userCoupon.getCoupon_id(), 0L);
            }
        }
        for (UserCoupon userCoupon : userCouponList) {
            if (userCoupon.getBuyers_id() != null) {
                Long count = popularCoupon.get(userCoupon.getCoupon_id());
                count = count + 1;
                popularCoupon.put(userCoupon.getCoupon_id(), count);
            }
        }
        popularCoupon.forEach((key,value)->{
            System.out.println("优惠券id" + key + ",使用人数：" + value);
        });
    }
}

package com.ldu.test;

import java.util.regex.Pattern;


public class Date {
    private static final Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");

    public static String nextDate(String s_year, String s_month, String s_day) {
        //检测是否存在无效字符
        if (!(isInteger(s_year) && isInteger(s_month) && isInteger(s_day))) {
            return "无效的输入日期！";
        }
        //将字符串转为int
        int year = Integer.parseInt(s_year);
        int month = Integer.parseInt(s_month);
        int day = Integer.parseInt((s_day));
        boolean flag = false;
        if (year < 1900 || year > 2050) {
            return ("年的值不在指定范围之内");
        } else if (month > 12 || month < 1) {
            return ("月的值不在指定范围之内");
        } else if (day > 31 || day < 1) {
            return ("日的值不在指定范围之内");
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month = month + 1;
                } else {
                    day = day + 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month = month + 1;
                } else if (day == 31) {
                    flag = true;
                } else {
                    day = day + 1;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                } else {
                    day = day + 1;
                }
                break;
            case 2: {
                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                    // 闰年
                    if (day == 29) {
                        day = 1;
                        month = 3;
                    } else if (day < 29) {
                        day = day + 1;
                    } else {
                        flag = true;
                        // day超过29
                    }
                } else {
                    //非闰年
                    if (day == 28) {
                        day = 1;
                        month = 3;
                    } else if (day < 28) {
                        day = day + 1;
                    } else {
                        flag = true;
                    }
                }

            }
            break;
            default:
        }

        if (year > 2050) {
            return ("年的值不在指定范围之内");
        } else if (flag) {
            return ("日的值不在指定范围之内");
        } else {
            return ("下一天是" + year + "年" + month + "月" + day + "日！");
        }
    }

    public static boolean isInteger(String str) {
        return pattern.matcher(str).matches();
    }
}


package com.ldu.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DateTests {
    private String input1;
    private String input2;
    private String input3;
    private String expected;

    @Parameters
    public static Collection<?> prepareData() {
        String[][] object = {
                // 有效等价类
                {"2016", "2", "29", "下一天是2016年3月1日！"},
                {"2017", "1", "28", "下一天是2017年1月29日！"},
                {"2017", "1", "31", "下一天是2017年2月1日！"},
                {"2017", "4", "30", "下一天是2017年5月1日！"},
                // 无效等价类
                {"1899", "3", "1", "年的值不在指定范围之内"},
                {"2051", "3", "1", "年的值不在指定范围之内"},
                {"205%", "3", "1", "无效的输入日期！"},
                {"1901", "-1", "1", "月的值不在指定范围之内"},
                {"1901", "13", "1", "月的值不在指定范围之内"},
                {"1901", "1%", "1", "无效的输入日期！"},
                {"1901", "1", "-1", "日的值不在指定范围之内"},
                {"2016", "2", "30", "日的值不在指定范围之内"},
                {"2017", "2", "29", "日的值不在指定范围之内"},
                {"2017", "3", "32", "日的值不在指定范围之内"},
                {"2017", "4", "31", "日的值不在指定范围之内"},
                {"2017", "4", "32", "日的值不在指定范围之内"},
                {"2017", "4", "3%", "无效的输入日期！"}
        };
        return Arrays.asList(object);
    }

    public DateTests(String input1, String input2, String input3, String expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.expected = expected;
    }

    @Test
    public void testDate() {
        String result = Date.nextDate(input1, input2, input3);
        Assert.assertEquals(expected, result);
    }
}


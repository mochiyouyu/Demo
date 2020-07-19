package com.youkeda;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

public class YKDTest {

    public static void error(String msg) {
        System.err.println("<YkdError>" + msg + "</YkdError>");
    }

    @Test
    public void runA() {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.youkeda.YKDArrayList");
        } catch (ClassNotFoundException e) {
            error("没有创建`YKDArrayList`类");
            return;
        }

        Object instance = null;
        try {
            instance = aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try {
            Method method = aClass.getMethod("get", int.class);
            try {
                int result = (int) method.invoke(instance, 0);
                if (result != 1) {
                    error("`YKDArrayList`类 get(0)返回结果不正确");
                    return;
                }

                result = (int) method.invoke(instance, 1);
                if (result != 10) {
                    error("`YKDArrayList`类 get(1)返回结果不正确");
                    return;
                }

                result = (int) method.invoke(instance, 2);
                if (result != 30) {
                    error("`YKDArrayList`类 get(2)返回结果不正确");
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                error("`YKDArrayList`类 get 执行错误:" + e.getMessage());
                return;
            }
        } catch (NoSuchMethodException e) {
            error("`CourseTimetableTest`类没有创建 main 方法");
            return;
        }


    }


}

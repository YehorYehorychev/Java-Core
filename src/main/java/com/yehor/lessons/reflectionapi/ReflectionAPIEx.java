package com.yehor.lessons.reflectionapi;

public class ReflectionAPIEx {

    public static void main(String[] args) {
        User user = new User(15,"Yehor");
        Class<? extends User> userClass = user.getClass();
        Class<User> userClass1 = User.class;
        System.out.println(userClass == userClass1);
    }
//    private class Test1 {
//
//    }
//    private  enum Test2 {
//        ONE, TWO;
//    }
}


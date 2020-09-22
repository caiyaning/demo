package com.caiyn.util;

public class CommonUtils {

    public static void main(String[] args) {
        CommonUtils commonUtils = new CommonUtils();
        String path1 = commonUtils.getClass().getResource("/name.txt")
                .getPath();
        String path2 = commonUtils.getClass().getClassLoader().getResource("")
                .getPath();
        System.out.println(path1);
        System.out.println(path2);
    }

}

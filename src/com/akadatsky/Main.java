package com.akadatsky;

public class Main {

    public static void main(String... args) {
        int result = sum(10, 20, 30, 40, 50, 60);
        result = sum(10, 20);

    }

    public static int sum(int... arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

}

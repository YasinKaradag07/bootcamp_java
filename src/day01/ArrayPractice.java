package day01;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] nums = new int[3]; // index: 0,1,2
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------");

        String[] words = {"Java","Selenium","API"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }

        System.out.println("--------------------------");

        char[] characters = {'A','B','C','D','E'};

        for (char each : characters) {
            System.out.println(each);
        }





    }
}

package com.pm.stream.publisher.model;

import java.util.ArrayList;

public class Task {

    public static void main(String[] args) {

        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(13);
        al.add(5);
        al.add(7);
        al.add(9);

        int k=17;

        System.out.println("Result  "+ extracted(al, k));


    }

    private static boolean extracted(ArrayList<Integer> al, int k) {
        boolean flag =false;
        for (int i = 0; i < al.size(); i++) {
            int temp = al.get(i);
            for (int j = 0; j < al.size(); j++) {
                if(temp + al.get(j) == k){
                    return true;
                }
            }
        }
        return flag;
    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(String s : towerBuilder(5)){
            System.out.println(s);
        }


    }
    public static String[] towerBuilder(int nFloors)
    {

        String space = " ";
        char[] floor = new char[nFloors*2 -1];

        for(int i = 0; i< floor.length; i++){
           floor[i] = '*';
        }

        String[] pyramid = new String[nFloors];
        pyramid [nFloors-1] = new String(floor);
        int n = 0;
        for(int i = nFloors -2; i>=0; i--){
                floor[n++] = ' ';
                floor[floor.length  - n] = ' ';
                pyramid [i] = new String(floor);
        }
        return pyramid;
    }

}

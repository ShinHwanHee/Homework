package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check[] = new int[26];
        String str = sc.nextLine();
        str = str.toUpperCase();

        for(int i=0; i<str.length(); i++){
            int n = str.charAt(i);
            check[n-65]++;
        }

        int tmp[] = Arrays.copyOf(check, 26);
        Arrays.sort(check);

        if(check[25] == check[24]){
            System.out.println("?");
        }else{
            for(int i=0; i<tmp.length; i++){
                if(check[25] == tmp[i]){
                    System.out.printf("%c", 65+i);
                }
            }
        }

        sc.close();
    }
}
package com.company;

import java.util.Scanner;

public class choose {
    public void ch(){
        System.out.println("애플");
        System.out.println("삼성");
        System.out.println("샤오미");
        Scanner scan = new Scanner(System.in);
        System.out.print("선택>");
        String text = scan.nextLine();




        System.out.println(text + "이(가) 선택되었습니다.");

    }
}

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //성적입력받기
        Scanner scan = new Scanner(System.in);

        LinkedList list = new LinkedList();

        for(int i = 0; i <=4; i++) {
            System.out.println("성적을 입력하세요");
            list.add(scan.nextLine());
        }

        //리스트 성적 출력
        System.out.println("초기성적:" + list);


        //1,3,5번 성적 바꾸기
        list.set(0,0);
        list.set(2,0);
        list.set(4,0);
        //


        //바뀐성적 출력
        System.out.println("바뀐성적:" + list);




    }
}

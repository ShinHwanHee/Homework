package study01;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        // 입력받는걸 선언한다
        Scanner scan = new Scanner(System.in);
        // 입력을 받자 , 문자로 받자
        System.out.println("문장을 입력하세요 >");
        String text = scan.nextLine();
        // 총길이를 구한다
        int size = text.length();
        // 마지막 , 첫글자 찾아서 자르기
        String start  = text.substring(0,1);
        String end = text.substring( size-1  , size );
        //출력한다. 둘다
        System.out.println("end : "+end);
        System.out.println("start : "+start);
    }
}

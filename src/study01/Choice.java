package study01;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        //문장을 선언한다
        Scanner scan = new Scanner(System.in);
        //문장을 입력받는다
        System.out.println("문장을 입력하세요:");
        String text = scan.nextLine();
        //홀수와 짝수 선택
        System.out.println("홀수와 짝수중 하나를 선택하세요");
        //선택하여 입력
        String choose = scan.nextLine();
        //입력받는문장을 출력
        System.out.println(text);

        //문장을 가공한다 / 편하게 문자를 숫자로 가공한다 아님 문자를 배열로 집어넣는다등등
        int size = text.length();

        //그문장을 홀수로 나눈다

        // 짝수로 나눈다

        //출력한다

    }
}

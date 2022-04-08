package study01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("연산을 입력하세요: ");
        String Symbol = input.next();

        System.out.print("숫자 2개를 입력하세요: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (Symbol == "+") {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        }

        else if (Symbol == "-") {
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        }

        else if (Symbol == "*") {
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        }

        else if (Symbol == "/") {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        }

    }

}

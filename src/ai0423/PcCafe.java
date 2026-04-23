package ai0423;

import java.util.Calendar;
import java.util.Scanner;

public class PcCafe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("* 출생년도 입력:");
        int birthYear = s.nextInt();

//        나이계산
        Calendar calendar = Calendar.getInstance();
        int age = calendar.get(Calendar.YEAR) - birthYear;
        String result = "";

        if(age >= 19)
            result = "가능";
        else
            result = "불가능";

        System.out.printf("당신의 나이는 %d세이므로 오후 10시 이후 PC방 사용이 %s합니다.\n", age, result);
        System.out.println("협조해 주셔서 감사합니다.");

        s.close();
    }
}

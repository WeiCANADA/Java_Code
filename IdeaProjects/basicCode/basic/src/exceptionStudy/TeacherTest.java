package exceptionStudy;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»Î∑÷ ˝");
        int score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
package classString.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public Login() {
    }

    public char[] inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("user name:");
        String inPutName = sc.nextLine();
        char[] charName = inPutName.toCharArray();
        return charName;
    }

    public char[] inputPassWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("password");
        String inPutPassWord = sc.nextLine();
        char[] charPassWord = inPutPassWord.toCharArray();
        return charPassWord;
    }

    public boolean compare(char[] exit, char[] input) {
        int cont = exit.length;
        if (exit.length == input.length) {
            for (int i = 0; i < exit.length; i++) {
                if (exit[i] == input[i]) {
                    cont--;
                }
            }

        }
        return cont == 0;
    }
}


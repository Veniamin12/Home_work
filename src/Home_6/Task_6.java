package Home_6;

import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Task_6.getCatch(words);
    }

    public static void getCatch(String[] s) {
        Random random = new Random();
        int a = random.nextInt(s.length);
        String secret = s[a];
        System.out.println("Secret word is : " + secret);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Find a word: ");
        String t = scanner.next().toLowerCase();

        while (!t.equals(secret)) {
            String g = "";
            for (int i = 0; i < secret.length(); i++) {
                if (i < t.length() && t.charAt(i) == secret.charAt(i)) {
                    g += t.charAt(i);
                } else {
                    g += "#";
                }
            }
            System.out.println(g + "############");
            System.out.println("Try again please! ");
            t = scanner.next().toLowerCase();
        }
        if (t.equals(secret)) {
            System.out.println("Game is over you find word:  \"" + t + "\""  );
        }
        scanner.close();
    }

}

package Home_6;

public class    Main {
    public static void main(String[] args) {
        System.out.println(Main.findSymbolOccurance("Hello enter the worlds", 'e'));
        System.out.println(Main.findWordPosition("Hellow wolrd", "olrd"));
        System.out.println(Main.stringReverse("Hello"));
        System.out.println(Main.isPalindrome("kork"));

    }

    public static int findSymbolOccurance(String s, char c) {
        char[] strArray = s.toCharArray();
        int repeat = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == c) {
                repeat++;
            }
        }
        return repeat;
    }

    public static int findWordPosition(String sorce, String target) {
        int pos = 0;
        if (sorce.contains(target)) {
            pos = sorce.indexOf(target);
            return pos;
        } else {
            pos = -1;
            return pos;
        }
    }

    public static String stringReverse(String s) {
        char[] str = s.toCharArray();
        char[] str2 = new char[str.length];
        int u = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            str2[u] = str[i];
            u++;
        }
        return new String(str2);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

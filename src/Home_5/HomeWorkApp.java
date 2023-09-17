package Home_5;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp.printThreeWords();
        HomeWorkApp.checkSumSign();
        HomeWorkApp.printColor();
        HomeWorkApp.compareNumbers();
        System.out.println(HomeWorkApp.compareInt(7,3));
        HomeWorkApp.getNumber(-10);
        System.out.println(HomeWorkApp.getNumberParameter(-10));
        HomeWorkApp.printNumber("HallVG", 3);
        System.out.println(HomeWorkApp.getYear(2016));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        if ((a + b) >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }
    public static void printColor(){
        int value = 100;
     if(value<=0){
         System.out.println("Red");
     } else if (value<=100 && value>0) {
         System.out.println("Yellow");
     } else if (value>100) {
         System.out.println("Green");
     }
    }

    public static void compareNumbers(){
        int a =5;
        int b =7;
        if (a>=b){
            System.out.println("a>=b");
        }else {
            System.out.println("a<b");
        }
    }
    public static boolean compareInt(int a, int b){
        int result = a+b;
        return result > 10 && result <= 20;
    }
    public static void getNumber(int a){
        if(a>=0){
            System.out.println("Number is positive!");
        }else {
            System.out.println("Number is negative!");
        }
    }

    public static boolean getNumberParameter(int a){
        return a < 0;
    }

    public static void printNumber(String s, int a){
        for(int i =0; i<a; i++){
            System.out.println(s);
        }
    }
    public static boolean getYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

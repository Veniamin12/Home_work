package Home_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Garage");
        list1.add("Oil");
        list1.add("Lemon");
        list1.add("Apple");
        list1.add("Apple");
        list1.add("Lemon");
        list1.add("Beer");
        list1.add("Table");
        list1.add("Sofa");
        list1.add("Oil");
        System.out.println(Main.countOccurance(list1, "Oil"));

        String arrayString[] = new String[6];
        arrayString[0] = "Andriy";
        arrayString[1] = "Svitlana";
        arrayString[2] = "Viktoria";
        arrayString[3] = "Oksana";
        arrayString[4] = "Ighor";
        arrayString[5] = "Oleg";

        List<String> listword = new ArrayList<>(Main.toList(arrayString));
        System.out.println(listword);

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(0);
        listInteger.add(4);
        listInteger.add(8);
        listInteger.add(8);
        listInteger.add(7);
        listInteger.add(10);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(2);
        listInteger.add(1);
        listInteger.add(10);
        Main.calcOccurance(list1);
        System.out.println(Main.findOccurance(list1));

    }

    public static int countOccurance(List<String> list, String line) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == line) {
                counter++;
            }
        }
        return counter;
    }

    public static List<String> toList(String array[]) {
        List<String> list = new ArrayList<>();
        for (String word : array) {
            list.add(word);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> listInteger = new ArrayList<>();
        for (Integer num : list) {
            if (!listInteger.contains(num)) {
                listInteger.add(num);
            }
        }
        return listInteger;
    }

    public static void calcOccurance(List<String> words) {
        List<String> coreWords = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        for (String line : words) {
            int index = coreWords.indexOf(line);
            if (index != -1) {
                int counter = count.get(index);
                count.set(index, counter + 1);
            } else {
                coreWords.add(line);
                count.add(1);
            }
        }
        for (int i = 0; i < coreWords.size(); i++) {
            System.out.println(coreWords.get(i) + ":" + count.get(i));
        }
    }

    public static List<String> findOccurance(List<String> words) {
        List<String> occList = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        List<String> findList = new ArrayList<>();
        for (String line : words) {
            int index = occList.indexOf(line);
            if (index != -1) {
                int cnt = count.get(index);
                count.set(index, cnt + 1);
            } else {
                occList.add(line);
                count.add(1);
            }
        }
        for (int i = 0; i < occList.size(); i++) {
            findList.add(i, "{name:" + occList.get(i) + ", occurrence:" + count.get(i) + "}");
        }
        return findList;
    }
}

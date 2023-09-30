package phonebook;

public class Main {
    public static void main(String[] args) {
        Phone_Directory phoneDirectory = new Phone_Directory();
        String[] galimskiyPhones = {"4354534", "4535345345"};
        String[] malinovskaPhones = {"7686786", "41113445"};
        String[] melnykPhones = {"121212", "49879045"};
        String[] zinkPhones = {"49879045"};
        String[] ostapPhones = {"1818118", "87878787"};

        Record record1 = new Record("Andriy", "Galimiskiy", galimskiyPhones);
        Record record2 = new Record("Vitalina", "Malinovska", malinovskaPhones);
        Record record3 = new Record("Svitlana", "Melnyk", melnykPhones);
        Record record4 = new Record("Olexa", "Zink", zinkPhones);
        Record record5 = new Record("Olexa", "Ostap", ostapPhones);

        phoneDirectory.add(record1);
        phoneDirectory.add(record2);
        phoneDirectory.add(record3);
        phoneDirectory.add(record4);
        phoneDirectory.add(record5);


        System.out.println(phoneDirectory.find("Andriy"));
        System.out.println(phoneDirectory.find("Olexa"));
        System.out.println(phoneDirectory.findAll("Olexa"));
        System.out.println(record1.getPhone());

    }
}

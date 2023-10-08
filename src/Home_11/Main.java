package Home_11;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        FileNavigator fileNavigator = new FileNavigator();

        FileData fileData1 = new FileData("files12.txt", (byte) 14, "/path/to/file");
        FileData fileData2 = new FileData("AppHillel.java", (byte) 28, "/path/ty/to/file");
        FileData fileData3 = new FileData("files12.txt", (byte) 14, "/path/to/file");
        FileData fileData4 = new FileData("Doc.txt", (byte) 23, "/pa/tuy/to/file");
        FileData fileData5 = new FileData("AppHillel.java", (byte) 28, "/path/ty/to/file");

        try {
            fileNavigator.addFile(fileData1, "/path/to/file");
            fileNavigator.addFile(fileData2, "/path/ty/to/file");
            fileNavigator.addFile(fileData3, "/path/to/file");
            fileNavigator.addFile(fileData4, "/pa/tuy/to/file");
            fileNavigator.addFile(fileData5, "/path/ty/to/file");
        } catch (InvalidPathException e) {
            throw new RuntimeException(e.getMessage());
        }

        fileNavigator.print();
        fileNavigator.sortBySize();
        System.out.println(" ");
        System.out.println("List fileData sorted in ascending order by size : " + fileNavigator.sortBySize());

        System.out.println(fileNavigator.find("/pa/tuy/to/file"));
        System.out.println(fileNavigator.filterBySize((byte) 25));
        fileNavigator.remove("/path/ty/to/file");
        System.out.println("After remove files along the way: ");
        fileNavigator.print();

    }

}

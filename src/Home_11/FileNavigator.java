package Home_11;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> file;

    public FileNavigator() {
        file = new HashMap<>();
    }

    public void addFile(FileData fileData, String path) throws InvalidPathException {
        if (!path.equals(fileData.getPath())) throw new InvalidPathException("Not correct path to the file : " + path);
        if (file.containsKey(path)) {
            file.get(path).add(fileData);
        } else {
            List<FileData> list = new ArrayList<>();
            list.add(fileData);
            file.put(path, list);
        }
    }

    public List<FileData> find(String path) {
        if (file.containsKey(path)) {
            return file.get(path);
        } else {
            return new ArrayList<>();
        }
    }

    public List<FileData> filterBySize(Byte size) {
        List<FileData> list = new ArrayList<>();
        for (String key : file.keySet()) {
            for (FileData fileData : file.get(key)) {
                if (fileData.getSizeFile() <= size) {
                    list.add(fileData);
                }
            }
        }
        return list;
    }

    public void remove(String path) {
        file.remove(path);
    }

    public List<FileData> sortBySize() {
      List<FileData> list = new ArrayList<>();
      for (List<FileData> fileData: file.values()){
          list.addAll(fileData);
      }
      Collections.sort(list, new Comparator<FileData>() {
          @Override
          public int compare(FileData o1, FileData o2) {
              return Byte.compare(o1.getSizeFile(), o2.getSizeFile());
          }
      });
      return list;
    }

    public void print() {
        for (String path : file.keySet()) {
            for (FileData data : file.get(path)) {
                System.out.println("Name of file : " + data.getNameFile() +
                        ". Size in bytes is: " + data.getSizeFile() + ". Path to file is:  " + data.getPath());
            }
        }

    }
}

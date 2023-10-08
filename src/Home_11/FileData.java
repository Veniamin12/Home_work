package Home_11;

public class FileData {

    private String nameFile;
    private byte sizeFile;
    private String path;

    public FileData(String nameFile, byte sizeFile, String path) {
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
        this.path = path;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public byte getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(byte sizeFile) {
        this.sizeFile = sizeFile;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileData{" + " nameFile='" + nameFile + '\'' + ", sizeFile=" + sizeFile + ", path='" + path + '\'' + '}';
    }

}

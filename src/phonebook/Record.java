package phonebook;


import java.util.Arrays;

public class Record {
    private String name;
    private String secondname;
    private String[] phone;


    public Record(String name, String secondname, String[] phone) {
        this.name = name;
        this.secondname = secondname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return "phone={" + Arrays.toString(phone) + "}";
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", phone=" + Arrays.toString(phone) +
                '}';
    }

}


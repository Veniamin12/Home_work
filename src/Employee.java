public class Employee {
    private String First_Name_Second_name;
    private String position;
    private String email;
    private int phone;
    private int year;

    public Employee(String first_Name_Second_name, String position, String email, int phone, int year) {
        First_Name_Second_name = first_Name_Second_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.year = year;
    }

    public String getFirst_Name_Second_name() {
        return First_Name_Second_name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getYear() {
        return year;
    }
}

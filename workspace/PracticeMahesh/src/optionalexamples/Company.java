package optionalexamples;

import java.util.List;

public class Company {
    private String name;
    private String address;
    private List<Student> students;

    public Company(String name, String address, List<Student> students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", students=" + students +
                '}';
    }
}

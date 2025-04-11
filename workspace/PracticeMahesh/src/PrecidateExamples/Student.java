package PrecidateExamples;

public class Student {

    private String name;
    private Integer marks;
    private Double attendancePercentage;

    public Student(String name, Integer marks, Double attendancePercentage) {
        this.name = name;
        this.marks = marks;
        this.attendancePercentage = attendancePercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(Double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", attendancePercentage=" + attendancePercentage +
                '}';
    }
}

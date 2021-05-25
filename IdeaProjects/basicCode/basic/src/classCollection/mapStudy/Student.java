package classCollection.mapStudy;

import java.util.Objects;

public class Student {
    private int iD;
    private String name;

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iD == student.iD && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, name);
    }

    public Student(String name, int iD) {
        this.iD = iD;
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


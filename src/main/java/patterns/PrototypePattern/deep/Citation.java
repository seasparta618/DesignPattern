package patterns.PropertyPattern.deep;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println("Student " + this.getStudent().toString() + " at year 2022 was honored with this citation for his excellent performance during the competition");
    }
}

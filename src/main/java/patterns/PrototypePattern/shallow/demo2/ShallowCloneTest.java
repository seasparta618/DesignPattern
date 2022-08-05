package patterns.PropertyPattern.shallow.demo2;

import org.junit.Test;

public class ShallowCloneTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setStudent(new Student("Lion", 9, 4));
        citation.show();

        Citation citation1 = citation.clone();
        citation1.getStudent().setName("Leon");
        citation.show();
        citation1.show();

        assert citation.getStudent().getName() == citation1.getStudent().getName();

        // to explain this part, the shallow clone will create a new object,
        // while the reference type will point to the same address
        // thus for citation and citation1, they all have the Student property point to the same address,
        // once you modify student's name inside citation, the student point to the same address on citation1 will be changed as well

        assert citation != citation1;
        assert citation.getStudent() == citation1.getStudent();
    }
}

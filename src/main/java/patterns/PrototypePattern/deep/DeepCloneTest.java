package patterns.PropertyPattern.deep;

import org.junit.Test;

import java.io.*;

public class DeepCloneTest {
    @Test
    public void test() throws Exception {
        Citation citation = new Citation();
        citation.setStudent(new Student("Lion", 9, 4));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/clone.txt"));

        objectOutputStream.writeObject(citation);

        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/clone.txt"));
        Citation citation1 = (Citation) objectInputStream.readObject();
        objectInputStream.close();
        citation1.getStudent().setName("Leon");

        assert citation != citation1;
        assert citation.getStudent() != citation1.getStudent();
        assert !citation.getStudent().getName().equals(citation1.getStudent().getName());
    }
}

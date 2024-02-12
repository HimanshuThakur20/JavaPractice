import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = "C:\\path\\Projects\\java\\TestDoc.txt";

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj = (Student) ois.readObject();

            System.out.println(obj.studentName);
            System.out.println(obj.studnetID);

            ois.close();
            fis.close();
        }catch (FileNotFoundException e) {
            System.out.println("Exception occurred " + e);
        }
    }
}

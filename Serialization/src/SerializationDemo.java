import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.studnetID =12;
        s1.studentName ="Himanshu";

        String fileName = "C:\\path\\Projects\\java\\TestDoc.txt";

        try {
            FileOutputStream foo = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(foo);
            oos.writeObject(s1);

            oos.close();
            foo.close();
            System.out.println("Object saved successfully");
        } catch (IOException e){
            System.out.println("There is an exception in loading the file "+e);
        }



    }
}

package serialize;

import java.io.*;

/**
 * Serialize
 *  - 오브젝트의 정보를 비트열(바이트코드)화하는 것을 말한다.
 */
public class SerialStream {
    public static void test() {
        Hello hello = new Hello();
        hello.check();

        try (
                FileOutputStream outFile = new FileOutputStream("serialcheck.dat");
                ObjectOutputStream outObject = new ObjectOutputStream(outFile);
        ) {
            outObject.writeObject(hello);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                FileInputStream inFile = new FileInputStream("serialcheck.dat");
                ObjectInputStream inObject = new ObjectInputStream(inFile);
        ) {
            Hello chkHello = (Hello) inObject.readObject();
            chkHello.check();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

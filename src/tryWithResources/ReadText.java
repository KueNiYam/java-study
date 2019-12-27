package tryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    /**
     * try-with-resources
     *  - try 문을 벗어날 때 자동으로 try 뒤에 쓴 파일 오픈 처리에 대해 자동으로 close 를 해준다.
     *  - 그렇기 때문에, close 를 명시해 줄 필요가 없다.
     */
    public static void test(String arg) {
        try (FileReader in = new FileReader(arg)) {
            int c;
            StringBuilder s = new StringBuilder();
            while ((c = in.read()) != -1) {
                s.append((char) c);
            }
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

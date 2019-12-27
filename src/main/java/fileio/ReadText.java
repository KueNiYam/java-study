package fileio;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {
    public static void test() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            FileReader in = new FileReader(name);
            int c;
            StringBuilder s = new StringBuilder(new String());
            while ((c = in.read()) != -1) {
                s.append((char) c);
            }
            System.out.println(s.toString());
            in.close();
        } catch (IOException ie) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (Exception e) {
            System.out.println("파일을 지정하지 않습니다.");
        }
    }
}

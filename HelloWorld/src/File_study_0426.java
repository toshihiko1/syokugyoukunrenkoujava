import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_study_0426 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/fujiitoshihiko/Desktop/out.txt");
        try{
            FileReader filereader = new FileReader(file);
            int ch = filereader.read();
            while(ch != -1) {
                System.out.printf("%s",(char) ch);
                ch = filereader.read();
            }
            System.out.printf("\n");
            filereader.close();

        } catch(FileNotFoundException e) {
            System.out.println("ファイルが存在しません");
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_write_0427 {
    public static void main(String[] args) throws Exception {


        File file = new File("/Users/fujiitoshihiko/Desktop/out.txt");
        try{
            FileWriter filewriter = new FileWriter(file,true);
            filewriter.write("こんにちは");
            filewriter.close();
        } catch(IOException e) {
            System.out.println("ファイルの書き込みに失敗しました");
        }


    }
}

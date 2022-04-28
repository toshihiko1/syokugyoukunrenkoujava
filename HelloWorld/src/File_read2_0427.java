import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class File_read2_0427 {
    public static void main(String[] args) throws Exception {
        // try{
        //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //     System.out.println("入力してください");
        //     String str = br.readLine();
        //     System.out.println("今入力されたデータは：" + str + "です");
        // } catch(FileNotFoundException e) {
        //     System.out.println("入力に失敗しました");
        // }

        Scanner scn = new Scanner(System.in);
        System.out.println("入力してください");
        String s = scn.next();
        int num = Integer.parseInt(s);
        System.out.println("今入力されたデータは：" + num + "です");
        scn.close();
    }
}

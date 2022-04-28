import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Rensyu_0427 {
    public static void main(String[] args) throws Exception {
        // 練習問題1
        // File file = new File("/Users/fujiitoshihiko/Desktop/input.txt");
        // Path path1  = Paths.get("/Users/fujiitoshihiko/Desktop/input.txt");
        // Path path2  = Paths.get("/Users/fujiitoshihiko/Desktop/input2.txt");
        // try{
        //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //     System.out.println("入力してください");
        //     String str = br.readLine();
        //     System.out.println("今入力されたデータは：" + str + "です");
        //     FileWriter filewriter = new FileWriter(file, true);
        //     filewriter.write(str);
        //     filewriter.close();
        //     Files.copy(path1, path2);
        // } catch(FileNotFoundException e) {
        //     System.out.println("入力に失敗しました");
        // } catch (IOException e) {
        //     System.out.println("ファイルの書き込みに失敗しました");
        // }

        // 2
        // try{
        // } catch(IOException e) {
        //     System.out.printf("ファイルのコピーに失敗しました");
        // }

        // 3
        // if(file.delete()) {
        //     System.out.println("ファイルが削除されました");
        // } else {
        //         System.out.println("ファイルは削除されませんでした");
        // }

        // 4
        // String num;
        // List<Integer>input_num = new ArrayList<Integer>();
        // Scanner scn = new Scanner(System.in);
        // int num2 = 1;
        // while(num2 != 0) {
        // System.out.println("入力してください");
        // num = scn.next();
        // num2 = Integer.parseInt(num);
        // input_num.add(num2);
        // }
        // scn.close();

        // 4-2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer>input_num = new ArrayList<Integer>();
        int num2 = 1;
        while(num2 != 0) {
        System.out.println("入力してください");
        String num = br.readLine();
        num2 = Integer.parseInt(num);
        input_num.add(num2);
        }
        br.close();

        //5
        // System.out.println(input_num);

        // 6
        File file = new File("/Users/fujiitoshihiko/Desktop/num.csv");
        String to_string = String.valueOf(input_num);
        if (file.exists()) {
            System.out.println("ファイルは存在します");
            // 8
            try {
                FileWriter filewriter = new FileWriter(file,true);
                filewriter.write(to_string);
                filewriter.close();
                System.out.println("ファイルの書き込みました");
            } catch (IOException e) {
                System.out.println("ファイルの書き込みに失敗しました");
            }
        } else {
            System.out.println("ファイルは存在しません");
            // 7
            try {
                FileWriter filewriter = new FileWriter(file);
                filewriter.write(to_string);
                filewriter.close();
                System.out.println("ファイルの書き込みました");
            } catch (IOException e) {
                System.out.println("ファイルの書き込みに失敗しました");
            }
        }


    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_method_0427 {
    public static void main(String[] args) throws Exception {


        File file = new File("/Users/fujiitoshihiko/Desktop/out.txt");
            if(file.exists()) {
                System.out.println("ファイルは存在します");
            }else{
                System.out.println("ファイルは存在しません");
            }

        if(file.delete()) {
            System.out.println("ファイルが削除されました");
        } else {
            System.out.println("ファイルは削除されませんでした");
        }

        File file1 = new File("/Users/fujiitoshihiko/Desktop/out1.txt");
        File file2 = new File("/Users/fujiitoshihiko/Desktop/out2.txt");
        if(file1.renameTo(file2)) {
            System.out.println("out1.txtへの移動が成功しました");
        } else {
            System.out.println("out1.txtへの移動に失敗しました");
        }


    }
}

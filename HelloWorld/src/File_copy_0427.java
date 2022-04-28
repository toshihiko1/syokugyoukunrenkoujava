import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_copy_0427 {
    public static void main(String[] args) throws Exception {


        Path path1  = Paths.get("/Users/fujiitoshihiko/Desktop/out1.txt");
        Path path2  = Paths.get("/Users/fujiitoshihiko/Desktop/out2.txt");
        try{
            Files.copy(path1, path2);
        }catch(IOException e) {
            System.out.printf("ファイルのコピーに失敗しました");
        }
    }
}

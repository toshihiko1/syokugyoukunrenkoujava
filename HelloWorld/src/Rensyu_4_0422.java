import java.util.Scanner;

// 練習問題4
public class Rensyu_4_0422 {
    public static void main(String[] args) throws Exception {
        int nums[] = new int[100];
        int num = 0;
        int i;
        int ii = 0;
        int sum = 0;
        double ave = 0;
        Scanner scanner = new Scanner(System.in);


        for(i = 0;;i++) {
            System.out.printf("入力してください > ");
            num = scanner.nextInt();
            if(num == 0) {
                nums[i] = num;
                scanner.close();
                break;
            }else{
                nums[i] = num;
            }
        }


        ii = i;
        for(i = 0; i < ii; i++) {
            sum += nums[i];
        }
        System.out.printf("合計は%d\n",sum);



        ave = ((double)sum / (double)ii);
        System.out.printf("平均は%.1f\n", ave);

    }
}

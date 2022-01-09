import java.util.Scanner;

public class Jishi2_4 {
    public static boolean existSeven (int num) {//能否被7整除，或者十进制表示法中某个位数上为7
        if (num % 7 == 0)   //被7整除
            return false;
        while (num != 0) {  //某个位数上为7
            if (num % 10 == 7)
                return false;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (existSeven(i) == true) {
                ans += (i * i);
            }
        }
        System.out.println(ans);
    }
}

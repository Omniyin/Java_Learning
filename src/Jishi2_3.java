public class Jishi2_3 {
    public static int reverse (int num) {//计算对称数
        int ans = 0;
        while (num != 0) {
            ans *= 10;
            ans += (num % 10);
            num /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 256; i ++) {
            if ((i * i) == reverse(i * i)) {
                System.out.println(i);
            }
        }
    }

}

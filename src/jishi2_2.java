public class jishi2_2 {
    public static int reverse(int num) {//计算反序数
        int ans = 0;
        while (num != 0) {
            ans *= 10;
            ans += (num % 10);
            num /= 10;
        }

        return ans;

    }

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i ++) {//四位数
            if ((i * 9) == reverse(i)) {
                System.out.println(i);
            }
        }
    }
}

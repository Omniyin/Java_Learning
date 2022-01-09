import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Jishu2_5 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = br.readLine()) != null) {
                double n = (double) Integer.parseInt(str);
                double sum = 0;
                for (int i = 0; i <= 100; i++) {
                    if (i * 5 > n) break;
                    for (int j = 0; j <= 100; j++) {
                        if (j * 3 > n) break;
                        int k = 100 - i - j;
                        if (k < 0) break;
                        sum = 5 * i + 3 * j + k * (1.0 / 3.0);
                        if (sum <= n) {
                            System.out.println("x=" + i + "," + "y=" + j + "," + "z=" + k);
                        }
                        else
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

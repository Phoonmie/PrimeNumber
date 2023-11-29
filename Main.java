
public class Main {
    public static void main(String[] args) {
        int x;
        int sum, y;
        int n = 100;
        int d;

        System.out.println("Prime numbers between 0 and " + n + " are:");

        for (x = 0; x <= n; x++) {
            if (x == 0)
                continue;
            d = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    d = 0;
                    break;
                }
            }
            if (d == 1)
                System.out.println(x + " ");

        }
    }
}


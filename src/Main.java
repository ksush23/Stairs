import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[]A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }

        int costFirst = 0;
        int costSecond = A[0];

        for (int i = 1; i < n; i++){
            int value = Math.max(A[i] + costSecond, A[i] + costFirst);

            costFirst = costSecond;
            costSecond = value;
        }

        System.out.println(costSecond);
    }
}

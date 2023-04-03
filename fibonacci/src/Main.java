import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output);
    }

    private static int fibonacci(int num) {
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);

        return aux(memo, num);
    }

    public static int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        return memo.get(num);
    }
}
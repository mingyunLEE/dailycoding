import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output);
    }

    private static boolean isSubsetOf(int[] base, int[] sample) {
        List<Integer> list = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; i < sample.length; i++) {
            if (!list.contains(sample[i])){
                return false;
            }

        }
        return true;
    }
}
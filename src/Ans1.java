import java.util.*;
import java.util.stream.Stream;

public class Ans1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int[] AN= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(AN[0]%(AN[1]+1));
    }
}
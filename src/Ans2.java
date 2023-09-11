import java.util.Scanner;
import java.util.stream.Stream;

public class Ans2 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        int[] dxy= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if((Math.abs(0 - dxy[1]) + Math.abs(0 - dxy[2])) <= dxy[0]) System.out.println("Yes");
        else System.out.println("No");
    }
}

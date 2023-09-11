import java.util.*;
public class Ans3 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b);
        boolean a=true;
        while(a){
            int d = (b-b%2)/2;
            if(d!=0){
                System.out.println(d);
                b=d;
            }else a=false;
        }
    }
}

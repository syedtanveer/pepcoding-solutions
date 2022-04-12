import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        toh(n, n1, n2, n3);
    }

    public static void toh(int n, int a, int b, int c){
        if(n == 0) return;
        toh(n-1, a, c, b);
        System.out.printf("%d[%d -> %d]\n", n, a, b);
        toh(n-1, c, b, a);
    }

}
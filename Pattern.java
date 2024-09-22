import java.util.*;
import java.io.*;
public class Pattern {
    public static void star(int n){
        for(int i=0;i<n;i++){
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            for(int j=i+1;j<n; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        star(n);
    }
}

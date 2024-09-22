import java.util.*;
import java.io.*;
public class PatternThree {
    public static void star(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1 || i==0 || i==4 || j==0 || j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
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
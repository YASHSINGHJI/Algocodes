import java.util.Scanner;
public class recursion_6 {
    public static int sumofdigits(int n){
        if(n>=0 && n<=9)
        return n;
        int h=n%10;
        return sumofdigits(n/10)+h; 
    }  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sumofdigits(n));
    }
    
}

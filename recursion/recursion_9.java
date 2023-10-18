import java.util.Scanner;
public class recursion_9 {
    static int sum(int n,int s){
        if(n==0) return s;
        if(n%2==0) s-=n;
        else s+=n;
        return sum(n-1,s);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n,0));
  }
}

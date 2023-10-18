import java.util.*;
public class recursion_8 {
    static int multiple(int n,int k,int h,int l){
        if(k==0)
        return 1;
        multiple(n,k-1,h,l);
        System.out.print(k * n + " ");
        return h*l;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(multiple(n,k-1,n,k));    
        
      }    
}

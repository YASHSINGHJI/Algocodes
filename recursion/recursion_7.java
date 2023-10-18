import java.util.Scanner;
public class recursion_7 {
   static int nod(int n,int s){
   if(n==0)
   return s ;
   return nod(n/10,s+1);  
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("No of digits:"+ nod(n,0));
               
    }
    
}

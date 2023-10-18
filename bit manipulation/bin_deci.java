import java.util.*;
public class bin_deci {
    public static void binarytodecimal(int n)
    {
        int c=-1;
        int o=0;
        for(int i=n;i!=0;i/=10){
            c++;
            int j=i%10;
            int h=(int)Math.pow(2,c);
            if(j==1)
            o+=h;
        }
    System.out.println("Decimal no.="+o);
    }

    public static void decimaltobinary(int l){
        String w="";
        while(l!=0){
            int p=l%2;
            String q=Integer.toString(p);
            w=q+w;
            l/=2;            
        }
        String t=Integer.toString(l);
        System.out.println("Binary no.="+(t+w));
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to convert binary to decimal");
    int n=sc.nextInt();
    System.out.println("enter a number to convert decimal to binary");
    int l=sc.nextInt();
    binarytodecimal(n);
    decimaltobinary(l);
}    
}

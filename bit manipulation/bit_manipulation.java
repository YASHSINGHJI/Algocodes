import java.util.*;
public class bit_manipulation {
    
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a choice \n 1.getbit \n 2.setbit \n 3. clearbit" );
       int choice=sc.nextInt();
       int n=5; //0101
       int bitmask=0;
       int newnumber=0;
       int j=1;
       switch(choice){
        case 1:
        System.out.println("enter position to get");
        j=sc.nextInt();
        bitmask=1<<j;
        if((n & bitmask) ==0)
        System.out.println("bit was zero");
        else
        System.out.println("bit was one");
        break;
        case 2:
        System.out.println("enter position to set");
         j=sc.nextInt();
        bitmask=1<<j;
         newnumber=bitmask | n;
        System.out.println(newnumber);
        break;
        case 3:
       
        
                System.out.println("Enter the position to clear:");
                int newbit = sc.nextInt();
                bitmask = ~(1 << newbit); 
                newnumber = bitmask & n;
                System.out.println(newnumber);
                break;
        
        default: 
        System.out.println("wrong choice");
    }

    }
}

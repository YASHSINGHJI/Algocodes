public class recursion_5 {
    public static int pow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int p=pow(x,n-1);
        int po=x*p;
        return po;
    }
    public static void main(String[] args) {
        System.out.print(pow(5,4));
    
   } 
}

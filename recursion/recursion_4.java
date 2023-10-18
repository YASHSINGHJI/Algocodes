public class recursion_4 {
    public static void fibonacci(int n,int a,int b){
    if(n==0)
    return;
    int c=a+b;
    System.out.println(c);
    fibonacci(n-1,b,c);

        
    }
    
    public static void main(String args[]){
        int a=0,b=1;
        System.out.println(a+"\n"+b);
        int n=7;
        fibonacci(n-2,a,b);
    }
    
}

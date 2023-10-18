public class recursion_3 {
    public static int factorial(int n,int fact){
        if(n==1 || n==0){
        System.out.println(fact);
        return 1;
        }
        fact*=n; 
        factorial(n-1,fact);
        return fact;
    }
    public static void main(String args[]){
    factorial(5,1);

    }
    
}

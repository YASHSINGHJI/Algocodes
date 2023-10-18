public class recursion_2 {
    public static void sum(int n,int i,int s){
        if(i==n){
        s+=i;
        System.out.println(s);    
        return;
        }      
        s+=i;
        sum(n,i+1,s);
    
    }
     public static void main(String args[]){
     sum(7,1,0);
    }
}

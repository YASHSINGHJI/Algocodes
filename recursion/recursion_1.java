public class recursion_1{
      public static void printno(int n){
        if(n==0)
        return;
        System.out.print(n+" ");
        printno(n-1); //function calling itself

      }
    public static void main(String args[]){
        printno(5);

    }
    }
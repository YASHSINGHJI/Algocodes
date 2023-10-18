public class secondcode {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int h=5;h>=i;h--){
                    System.out.print(" ");
                }   
            for(int j=4;j>=1;j--){
                                           
                if(j==1 || j==4 || i==1 || i==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
        System.out.println("");
        }
    }
}

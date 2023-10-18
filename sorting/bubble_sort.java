public class bubble_sort{
    public static void main(String args[]){
        int n[]={7,8,1,3,2,0};
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-i-1;j++){
            if(n[j]>n[j+1]){
                int temp=n[j];
                n[j]=n[j+1];
                n[j+1]=temp;
            }
  
        }
    }
       for(int o=0;o<n.length;o++){
        System.out.print(n[o]+" ");
       }
       System.out.println("");
}
}

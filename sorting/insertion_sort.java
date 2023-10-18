public class insertion_sort{
    public static void main(String args[]){
        int n[]={7,3,8,2,1};
        for(int i=1;i<n.length;i++){
            int current=n[i];
            int j=i-1;
            while(j>=0 && current < n[j]){
                n[j+1]=n[j];
                j--;
            }

        n[j+1]=current;
        }
    for(int k=0;k<n.length;k++){
        System.out.print(n[k]+" ");
    }
    System.out.println("");
    }
    
}

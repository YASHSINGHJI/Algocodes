public class selection_sort {
    public static void main(String args[]){
        int n[]={7,8,3,1,2};
        for(int i=0;i<n.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<n.length;j++){
                if(n[smallest]>n[j])
                smallest=j;
            }
            int temp=n[smallest];
            n[smallest]=n[i];
            n[i]=temp;
        }
    for(int y=0;y<n.length;y++){
        System.out.print(n[y]+" ");
    }
    System.out.println("");
} 
}

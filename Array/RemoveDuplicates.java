class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,4};
        
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]) count++;
            }
            if(count==0) System.out.print(a[i]+" ");
        }
    }
}
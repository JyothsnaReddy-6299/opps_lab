class Frequency {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,3};

        for(int i=0;i<a.length;i++){
            int count=1;
            int visited=0;

            for(int k=0;k<i;k++)
                if(a[i]==a[k]) visited=1;

            if(visited==1) continue;

            for(int j=i+1;j<a.length;j++)
                if(a[i]==a[j]) count++;

            System.out.println(a[i]+" "+count);
        }
    }
}
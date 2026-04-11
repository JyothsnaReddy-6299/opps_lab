class SumArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int sum = 0;

        for (int x : a) sum += x;

        System.out.println(sum);
    }
}
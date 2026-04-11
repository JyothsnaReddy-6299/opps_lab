class Search {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int key = 30;
        int found = 0;

        for (int x : a) {
            if (x == key) {
                found = 1;
                break;
            }
        }

        if (found == 1) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
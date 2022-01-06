public class Max_min {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

        public static void main(String[] args) {
        int[] array = {3, 5, 6, 2, 10, 7, 8, 4, 9};
        Max_min m = new Max_min();
        System.out.println("Maximum value in the array is::"+m.max(array));
        System.out.println("Minimum value in the array is::"+m.min(array));
    }
}

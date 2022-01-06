//Write a program to find if any element is duplicate. If duplicate, show the value.

public class DuplicateElement {
    public static void findingDuplicates(int[] arr) {

        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 3, 10, 7, 8, 7, 9};
        System.out.println("Duplicate elements in given array: ");

        findingDuplicates(arr);
    }

}


public class Program {
    public static void main(String[] args) {
        // int[] array = {34, 21, 97, 89, 45, 65, 43};
        // Linear_Search(array, 21);

        int[] sorted_array = { 2, 5, 6, 10, 32, 45, 48, 49, 50, 100, 105, 106, 2000 };
        int bin_result = Binary_Search(sorted_array, 2000);
        int lin_result = Linear_Search(sorted_array, 2000);
        int max = Find_Max(sorted_array);

        System.out.println(bin_result);
        System.out.println(lin_result);
        System.out.println(max);
    }

    public static int Linear_Search(int[] array, int value) {
        int counter = 0;

        for(int i = 0; i < array.length; i++) {
            counter++;
            if(array[i] == value) {
                System.out.println("Linear search counter is " + counter);
                return i;
            }
        }
        System.out.println("Linear search counter is " + counter);

        return -1;
    }

    public static int Binary_Search(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        int counter = 0;

        while(low <= high) {
            counter++;

            int mid = (low + high) / 2;

            if(array[mid] == value) {
                System.out.println("Binary search counter is " + counter);
                return mid;
            } else if(array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary search counter is " + counter);

        return -1;
    }

    public static int Find_Max(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
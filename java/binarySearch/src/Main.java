import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the array size: ");
        int arrSize = sc.nextInt();

        int[] arr = generateArray(arrSize);

        System.out.print("enter the target number of your array: ");
        int target = sc.nextInt();

        System.out.println(binarySearch(arr, target));

        sc.close();
    }

    public static int[] generateArray(int size) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("enter the #%d number: ", i + 1);
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int binarySearch(int[] arr, int target) {
        int lowest = 0;
        int higher = arr.length - 1;

        while (lowest <= higher) {
            int mid = (lowest + higher) / 2;
            int guess = arr[mid];

            if (target == guess) {
                return mid;
            }

            if (target > guess) {
                lowest = mid + 1;
            } else {
                higher = mid - 1;
            }
        }

        return 0;
    }
}
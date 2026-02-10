class Smallest {
    int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

class Largest {
    int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 5, 30};

        Smallest s = new Smallest();
        Largest l = new Largest();

        System.out.println("Smallest number: " + s.findSmallest(arr));
        System.out.println("Largest number: " + l.findLargest(arr));
    }
}

/*
OUTPUT:
Smallest number: 5
Largest number: 45
 */
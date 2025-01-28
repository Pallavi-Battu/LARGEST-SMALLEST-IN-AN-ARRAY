
public class largestsmallestinarray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}


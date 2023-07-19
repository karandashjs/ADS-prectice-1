import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // Problem 1 and 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size]; //declaration of new array of the given size
        System.out.println("Enter the numbers");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); //initialization of the array
        }

        functions m = new functions();

        System.out.println("Minimum value in the array is " + m.min(arr));
        System.out.println("Average value in the array is " + m.ave(arr));

        // Problem 3
        System.out.println("Enter any number to check if it is prime or composite");
        int number = sc.nextInt();

        m.checker(number);


    }

//new class
    public static class functions {

    // Problem 1
        public int min(int[] array) {
            int min = array[0]; // initialising min value as the first value of the array

            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {  // comparing rest of the array values to the min value
                    min = array[i]; // assigning new value to the min variable
                }
            }
            return min; //returning the minimal value
        }

    // Problem 2
        public double ave(int[] array) {
            double sum = 0; // declaring sum as zero

            for (int i = 0; i < array.length; i++) {
                sum += array[i]; //adding all values of the array into the sum
            }
            return sum / array.length; // returning the average of all values
        }

    // Problem 3
        public void checker(int number) {
            boolean prime = true;

            for (int i = 2; i <= number/2; i++) {
                if(number%i != 0){
                    prime = false;
                    break;
                }
            }
            if(prime = true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Composite");
            }

        }

    }
}








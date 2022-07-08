import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,7, 14, 18, -2, 36, 42,-7,25};
        int[] otherNumbers = {5,7, 12, 18, -2, 32, 42,-7,25};

        //Arrays ex. 1 - check if an array contains at least 1 prime number
        boolean isPrime = false;
        for (int elem:numbers) {
            int divisors = 0;
            for (int i = 2; i <= elem/2; i++) {
                if (elem % i == 0) divisors += 1;
            }
            if (divisors == 0) {
                isPrime = true;
                break;
            }
        }
        if (isPrime) System.out.println("There is at least one prime number");
        else System.out.println("There are no prime numbers in your array");

        //Arrays ex. 2 - Calculate how many negative numbers there are in an array
        int counterNegative = 0;
        for (int elem : numbers) {
            if (elem < 0)
                counterNegative += 1;
        }
        System.out.println("There are " + counterNegative + " negative numbers in your array");

        //Arrays ex. 3 - calculate the sum of all multiples of 3 in an array
        int sumOfMultiples = 0;
        for (int elem : numbers) {
            if (elem % 3 == 0)
                sumOfMultiples += elem;
        }
        System.out.println("The sum of the multiples of 3 is: " + sumOfMultiples);

        //Arrays ex. 4 - find a specific number in an array
        Scanner sc = new Scanner(System.in);
        System.out.print("What number are you looking for? ");
        int givenNumber = sc.nextInt();
        boolean foundNumber = false;
        for (int elem : numbers) {
            if (elem == givenNumber) {
                foundNumber = true;
                break;
            }
        }
        if (foundNumber) System.out.println("The number has been found!");
        else System.out.println("The number has not been found");

        //Arrays ex. 5 - for a given number, output the index value of where it is first found
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == givenNumber) {
                System.out.println("The first index value of the given number is: " + i);
                break;
            }
        }

        //Arrays ex. 6 - for a given number, output how many times the number is in the array
        int numberOfAppearances = 0;
        for (int elem : numbers) {
            if (elem == givenNumber) numberOfAppearances += 1;
        }
        System.out.println("The number" + givenNumber + " has been found " + numberOfAppearances + " times.");

        //Arrays ex. 7 - check if all the numbers in the array are larger than the given number
        for (int elem : numbers) {
            if (elem < givenNumber) {
                System.out.println("Not all the number in the array are less than: " + givenNumber);
                break;
            } else System.out.println("All the numbers in the array are larger or equal to: " + givenNumber);
            break;
        }

        //Arrays ex. 8 - Check if the sums of the numbers of 2 arrays are equal
        int sumOne = 0, sumTwo = 0;
        for (int elem : numbers) {
            sumOne += elem;
        }
        for (int elem : otherNumbers) {
            sumTwo += elem;
        }
        if (sumOne == sumTwo) System.out.println("The sums are equal.");
        else
            System.out.println("The sums are not equal.");

        //Arrays ex. 9 - calculate the minimum and maximum value from an array
        int min = numbers[0], max = numbers[0];
        for (int elem : numbers) {
            if (elem <= min) min = elem;
            else if (elem >= max) max = elem;
        }
        System.out.println("The minimum is: " + min + " and the maximum is: " + max);
    }
}

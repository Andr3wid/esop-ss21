package Assignment7.Andreas;

public class SomeRecursions {

    // iterative approach
    static int countBunnyEars(int numberOfBunnies) {

        int temp_numberOfBunnies = numberOfBunnies;
        int earCount = 0;

        while(temp_numberOfBunnies > 0) {
            earCount = earCount +2;
            temp_numberOfBunnies--;
        }

        return earCount;
    }

    // recursive approach
    // basic structure:
    // always a base-case and a recursion step
    static int countBunnyEarsRecursive(int numberOfBunnies) {

        // recursion step
        if(numberOfBunnies > 1) {
            return 2 + countBunnyEarsRecursive(numberOfBunnies-1);
        }
        // base-case
        else {
            return 2; // because a "healthy" bunny always has two ears
        }

    }

    public static void main(String[] args) {

        int bunnyPopulation = 11;

        // use iterative function
        int retrievedNumberOfEars = countBunnyEars(bunnyPopulation);
        System.out.println("Calculated number of ears: " + retrievedNumberOfEars);

        // use recursive function
        int retrievedNumberOfEarsRecursive = countBunnyEarsRecursive(bunnyPopulation);
        System.out.println("Recusively calculated number of ears: " + retrievedNumberOfEarsRecursive);

    }
}

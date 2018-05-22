package practice_07_3;

public class ShoppingCart {
    public static void main(String[] args) {
        int int1;
        
	// Declare and initialize variables of type long, float, and char.
        long x = 1234567890123L;
        float y = 2.4f;
        char c = 'a';

        // Print the long variable.
        System.out.println("Long variable x= " + x);

        // Assign the long to the int and print the int variable.
        //int1 = x;//eroare
        int1 = (int)x;
        System.out.println("Long variable to int intl = " + int1);
        
    }
}
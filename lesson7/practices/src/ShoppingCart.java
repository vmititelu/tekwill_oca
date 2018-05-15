public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName.

        spaceIdx = custName.indexOf(' ');

        // Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println("The first name is: " + firstName);

        //Instantiate and initialize sb to firstName.
        StringBuilder sb = new StringBuilder(firstName);


        // Put the full name back together, using StringBuilder append method.
        // You can just enter the String literal for the last name.
        // Print the full name.

        sb.append(" Smith");
        System.out.println(sb);

        // (Optional) Can you append the last name without using a String literal?



    }
}

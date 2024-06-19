public class FindMultiples {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 within the range 71 to 150:");

        // Loop through the range 71 to 150
        for (int junk = 71; junk <= 150; junk++) {
            // Find if multiple of 2
            if (junk% 2 == 0) {
                System.out.println(junk + " is a multiple of 2");
            }

            // Find if multiple of 3
            if (junk % 3 == 0) {
                System.out.println( junk + " is a multiple of 3");
            }

            // Find if multiple of 7
            if (junk% 7 == 0) {
                System.out.println(junk + " is a multiple of 7");
            }
        }
    }
}

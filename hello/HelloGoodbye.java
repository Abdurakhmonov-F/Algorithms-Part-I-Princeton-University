package hello;

/* *****************************************************************************
 *  Name:              Feruz Abdurakhmonov
 *  Coursera User ID:  123456
 *  Last modified:     September 19, 2024
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        final String firstName = args[0];
        final String secondName = args[1];
        System.out.println("Hello " + firstName + " and " + secondName + ".");
        System.out.println("Goodbye " + secondName + " and " + firstName + ".");
    }
}

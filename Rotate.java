
/** Application of rotating plain text with a specific shift.
* Format in CMD <code>java Rotate n Cipher text</code> where n is the shift.
* Created an object 'cipher_text' which will have access to the method from Caesar.
* @author Mahir Hussain
*/

public class Rotate {

  /** Instantiates relevant information from Caesar. This includes the process of encryption. Handles with multiple arguments as well.
  * @param Requirement arguments length calculated to determine the extreme cases. Expects 2 arguments, first argument will be the integer and the second argument is the string
  */
  public static void main(String[] args) {

    // Instantitiation
    Caesar cipher_text = new Caesar();

    if (args.length == 2) { // Checks if there are only 2 arguments
      String first_arg = args[0];
      int new_first_arg = Integer.parseInt(first_arg); // Converts the string into an int for the rotate method
      String second_arg = args[1];
      cipher_text.rotate(second_arg, new_first_arg); // Encryption occurs
    }
    // Exception handling
    else if (args.length > 2) {
      System.out.println("Too Many Parameters!");
      System.out.println("Usage: java Rotate n 'Cipher text'");
    }
    else if (args.length == 0) {
      System.out.println("No Parameters!");
      System.out.println("Usage: java Rotate n 'Cipher text'");
    }
    else if (args.length < 2) {
      System.out.println("Too few Parameters!");
      System.out.println("Usage: java Rotate n 'Cipher text'");
    }    
  }
}
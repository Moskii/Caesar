import java.util.Arrays;

/** Caesar class has access to the <b>interface</b> (abstract) methods which are declared in RotationCipher.
* Each method defined in the interface will be defined again here but with a body.
* @author Mahir Hussain
*/

public class Caesar implements RotationCipher {
  // Note: for frequency, should count up the letters in the string then divide it by the length of string.

  /** Shifts a string, either left or right depending on the <b>sign</b> of integer. If it is positive, the letter will be shifted to the right.
  * @param Goal To encrypt a message with a given key.
  */
  // rotate method
  public void rotate(String plain_text, int shift) {
    if (shift > 26 ) {
      shift = shift % 26; // The 'wrap' around
    }
    else if (shift < 0) {
      shift = (shift % 26) + 26; // The 'wrap' around for negative shifts
    }

    String cipher_text = "";
    for (int i = 0; i < plain_text.length(); i++){ 
      char letter = plain_text.charAt(i); // Breaks the string into characters
      if (Character.isLetter(letter)) { 
        if (Character.isLowerCase(letter)) { // Checks if the character is lowercase. 
          char newChar = (char) (letter+shift); // adds the shift into the character.
          if (newChar > 'z') {
            cipher_text += (char) (letter - (26-shift));
          }
          else {
            cipher_text += newChar;
          }
        }
        else if (Character.isUpperCase(letter)) { // Checks if the character is uppercase.
          char newChar = (char) (letter+shift);
          if (newChar > 'Z') {
            cipher_text += (char) (letter - (26-shift));
          }
          else {
            cipher_text += newChar;
          }
        }
      }
      else {
        cipher_text += letter; // This handles with full stops, question marks etc
      }
    }
    System.out.println(cipher_text);
  }
}

/*
* Amer Stas
* 2/24/2020
* This program will tell the user if the word is palingdrome or not
*/
package assigment.pkg2.pkgfinal;

import javax.swing.*;
public class Assigment2Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String input;
    String revin="";
    // Asking the user to enter an input
    input = JOptionPane.showInputDialog("Enter a word and the program will find out if its palingdrome or not");
    //Using a loop to invere the word entered
    for (int i=input.length()-1;i>=0;i--){
        revin+=input.charAt(i);
        
    }
    //comparing the two words to find out if they are the same
    if (input.equalsIgnoreCase(revin)){
        JOptionPane.showMessageDialog(null,input + "It's palindromre");
    }
    else 
    {
        JOptionPane.showMessageDialog(null, input + "It's not a palindrome");
    }
    }
    
    
}

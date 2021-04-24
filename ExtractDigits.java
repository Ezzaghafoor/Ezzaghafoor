import java.util.*;
  public class ExtractDigits{
  public static void main(String[]args){
    // to get numbers from the given string.
    String sInput = " He is78 a go23od Prog97ram08er!";
    //replaceAllString from integers used arg0, arg1.
    // By using this ^ only integers part is separated from string.
    System.out.println("The number part is :" + sInput.replaceAll("[^0-9]", ""));
    System.out.println("The string part is :" + sInput.replaceAll("[0-9]", ""));
    
    
  }
}
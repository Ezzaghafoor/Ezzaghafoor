import java.util.*;
  public class ridMultipleBlank{
  public static void main(String[]args){
    String str = "The quick brown fox jump";
//s represents single space.
// all blank spaces replace with empty.
// By using unique code of the space we remove all wide spaces in the string.
    String str1=str.replaceAll("\\s" ,"");
    System.out.println(str1);
  }
}
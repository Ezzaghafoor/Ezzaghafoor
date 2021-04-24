import java.util.*;
// Java program to find SubString
  public class IsSubsequence{
// Function to check the SubString
  public static boolean isSubsequence (String str1, String str2)
  {
    if(str1.length()== 0)
      return true;
    int i=0;
    int j=0;
    while(i<str1.length()&&j<str2.length()){
      if(str1.charAt(i)==str2.charAt(j))
      {
        i++;
      }
      if (str1.length()==i)
      {
// Returns true is 1 in SubString
        return true;
      }
      j++;
    }
// Returns false is 0 in SubString
    return false;
  }
// Driver code
  public static void main(String[]args){
    boolean result= isSubsequence("ade","abcdefg");
    System.out.println(result);
  }
}
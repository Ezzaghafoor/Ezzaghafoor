import java.util.*;
public class Test
{
  public static void main(String[]args)
  {
    Scanner sc =new Scanner (System .in);
    System.out.println("Enter a new String");
    String s1=sc.nextLine();
    int i;
    int l=s1.length();
    char ch;
    int c=0;
    String s=s1.toLowerCase();
    for(i=0;i<l;i++)
    {
      ch=s.charAt(i);
      if(ch=='a'|| ch=='e' || ch== 'i' || ch== 'o' || ch== 'u')
      c++;
  }
    System.out.print("total numbers of vowels : " +c);
  }
}
      

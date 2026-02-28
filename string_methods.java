import java.util.*;
public class string_methods {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string1:");
        String str1=sc.nextLine();
        System.out.println("Enter string2:");
        String str2=sc.nextLine();
        System.out.println("Length:"+str1.length());
        System.out.println("Upper:"+str1.toUpperCase());
        System.out.println("Lower:"+str1.toLowerCase());
        System.out.println("Trimmed:"+str1.trim());
        System.out.println("Substring:"+str1.substring(0,9));
        System.out.println("Equals:"+str2.equals(str1));
        System.out.println("Equals Ignore Case:"+str2.equalsIgnoreCase(str1));
        System.out.println("Compare To:"+str1.compareTo(str2));
        sc.close();
    }
}

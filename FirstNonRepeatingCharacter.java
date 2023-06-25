import java.util.*;
public class Solution {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String s = sc.nextLine();
  System.out.println("Index of first non-repeating character in '" + s + "' is: " + firstNonRepeating(s));
 }

 public static int firstNonRepeating(String s) {
  HashMap < Character, Integer > map = new HashMap < > ();
  for (int i = 0; i < s.length(); ++i) {
   char chr = s.charAt(i);
   map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
  }
  for (int i = 0; i < s.length(); ++i) {
   if (map.get(s.charAt(i)) < 2) {
    return i;
   }
  }
  return -1;
 }
}

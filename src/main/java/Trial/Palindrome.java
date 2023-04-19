package Trial;
import java.util.ArrayList;
import java.util.Scanner;
//ma.la$@y!(al*#a;m
class CheckPalindrome{
    static boolean check(ArrayList<Character> c){
        boolean flag=true;
        for (int i = 0; i < c.size()/2; i++) {
            if(c.get(i)==c.get((c.size()-1)-i));
            else{
                flag=false;
            }
        }
        return flag;
    }
}
class ReverseString{
    static String print(ArrayList<Character> c){
        String t="";
        for (int i = (c.size()-1); i >=0 ; i--) {
            t=t+c.get(i);
        }
        return t;
    }
}
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the string : ");
        String s= scan.nextLine();
//        String s="ma.la$@y!(al*#a;m";
        ArrayList<Character> c=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                c.add(s.charAt(i));
            }
        }
        System.out.println(c);
        System.out.println(CheckPalindrome.check(c));
        System.out.println(ReverseString.print(c));
    }
}

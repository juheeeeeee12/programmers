import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i=0;i <a.length(); i++){
            char c = a.charAt(i);
            String b = String.valueOf(c);
            if(Character.isUpperCase(c)){
                result += b.toLowerCase();
            } else{
                result += b.toUpperCase();
            }
        }
        System.out.println(result);
    }
}
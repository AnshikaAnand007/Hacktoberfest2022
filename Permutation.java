package Permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // permutation("" , "abc");
        ArrayList<String> ans = permutat("", "abc");
        System.out.println(ans);
    }

    static void permutation(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        for(int i = 0 ; i <= p.length() ; i++) {
            String first = p.substring(0 , i);
            String second = p.substring( i , p.length());
            permutation(first +c + second , up.substring(1));
        }
    }

    //array list  
    static ArrayList<String> permutat(String p , String up) {
        if(up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        char c = up.charAt(0);

        ArrayList<String> ans = new ArrayList<String>();

        for(int i = 0 ; i <= p.length() ; i++) {
            String first = p.substring(0 , i);
            String second = p.substring( i , p.length());
            ans.addAll(permutat(first +c + second , up.substring(1)));
        }
        return ans;
    }
}

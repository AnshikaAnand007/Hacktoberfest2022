package Permutation;

public class CountSteps {
    public static void main(String[] args) {
        // countpermutation("", "abc");
        System.out.println(countpermutation("", "abc"));
    }

    static int countpermutation(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return 1;
        }

        char c = up.charAt(0);

        int count = 0;
        for(int i = 0 ; i <= p.length() ; i++) {
            String first = p.substring(0 , i);
            String second = p.substring( i , p.length());
            count = count + countpermutation(first +c + second , up.substring(1));
        }
        return count;
}
}

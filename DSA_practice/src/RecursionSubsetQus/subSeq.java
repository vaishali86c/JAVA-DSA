package RecursionSubsetQus;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        subSequenceAscii("", "abc");
//        System.out.println(subSequence("", "abc"));
    }

    static void subSequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSequence(p + ch, up.substring(1));
        subSequence(p, up.substring(1));
    }


    static ArrayList<String> subSequenceRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSequenceRet(p + ch, up.substring(1));
        ArrayList<String> right = subSequenceRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSequenceAscii(p + ch, up.substring(1));
        subSequenceAscii(p, up.substring(1));
        subSequenceAscii(p + (ch + 0), up.substring(1));
    }
}

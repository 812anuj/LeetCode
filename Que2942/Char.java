package Que2942;

import java.util.*;
//2942. Find Words Containing Character
public class Char {
    public static void main(String[] args) {
        String[] words ={"abc", "bcd", "aaaa", "cbc"};
        char x = 'b';
        System.out.println(res(words, x));
    
    }

    public static List<Integer> res(String[] words, char x) {

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                res.add(i);
            }
        }
        return res;
    }


}

package bishi;

import java.util.HashMap;
import java.util.Scanner;

public class xiechen_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String sentence = scanner.nextLine();
        String change = scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!hashMap.containsKey(word.charAt(i))) {
                hashMap.put(word.charAt(i), 1);
            } else hashMap.put(word.charAt(i), hashMap.get(word.charAt(i)) + 1);
        }
        int lenmap=hashMap.size();
        int len_word = word.length();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < sentence.length(); ) {
            if (hashMap.containsKey(sentence.charAt(i))) {
                HashMap<Character,Integer> map=new HashMap<>();
                for (int j = 0; j < len_word; j++) {
                    if (hashMap.containsKey(sentence.charAt(i + j))){
                        if (j == len_word - 1) {
                            if (!map.containsKey(sentence.charAt(i+j))) {
                                map.put(sentence.charAt(i+j), 1);
                            } else map.put(sentence.charAt(i+j), map.get(sentence.charAt(i+j)) + 1);
                            if (map.size()==lenmap){
                                res.append(change);
                                i=i+len_word;
                                break;
                            }
                            else {
                                res.append(sentence.charAt(i));
                                i++;
                                break;
                            }
                        }
                        else {
                            if (!map.containsKey(sentence.charAt(i+j))) {
                                map.put(sentence.charAt(i+j), 1);
                            } else map.put(sentence.charAt(i+j), map.get(sentence.charAt(i+j)) + 1);
                            continue;
                        }
                        }
                    else if (!hashMap.containsKey(sentence.charAt(i + j))){
                        res.append(sentence.charAt(i));
                        i++;
                        break;
                    }
                }
            }
            else {
                res.append(sentence.charAt(i));
                i++;
            }
        }
        res.toString();
        System.out.println(res);
    }
}

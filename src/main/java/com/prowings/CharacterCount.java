package com.prowings;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args){

        printCharacterCountUsingJava8(" Jay Shree Hanuman ");
        printCharacterCount(" Jay Shree Ram ");

    }

    public static void printCharacterCountUsingJava8(String str){

            if(str == null || str.isEmpty()){
               System.out.println("Input String is null or empty");
            }
            str = str.toLowerCase();

            Map <Character,Integer> charCountMap = new HashMap<>();

        for(char ch : str.toCharArray()) {
            if (ch != ' ') {
               charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
              System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
        System.out.println("printCharacterCountUsingJava8 this method execution successfully completed");
    }

    public static void printCharacterCount(String str1){

        if(str1 == null || str1.isEmpty()) {
            System.out.println("Input String is Null or Empty ");
            return;
        }
        str1 = str1.toLowerCase();

        Map<Character,Integer> charCountMap = new HashMap<>();

        for(char ch :str1.toCharArray()){
            if(ch !=' '){
                if(charCountMap.containsKey(ch)){
                    charCountMap.put(ch,charCountMap.get(ch)+1);
                }
                else {
                    charCountMap.put(ch,1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + ": " +entry.getValue() );
        }
        System.out.println("printCharacterCount this method execution successfully completed");
    }
}

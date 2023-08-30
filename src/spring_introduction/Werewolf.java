package spring_introduction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Werewolf {

    public static void main(String[] args) {
        StringBuilder inputString =
                new StringBuilder("Max ,,,,!!  St!!oba34   5567");

        System.out.println(werewolf(inputString));

    }

    public static StringBuilder werewolf(StringBuilder s){
        StringBuilder outputString = new StringBuilder();
        StringBuilder outputString2 = new StringBuilder();

        Pattern pattern1 = Pattern.compile("[A-Za-z]");
        Matcher matcher1 = pattern1.matcher(s);

        while(matcher1.find()){
            outputString.insert(0,(matcher1.group()));
            outputString2.append(matcher1.group());
        }
        System.out.println(outputString2);
        System.out.println("-----------");
        boolean b= false;
        if (outputString.toString().equals(outputString2.toString())){
            b = true;
        }
        System.out.println(b);

        return outputString;
    }
}

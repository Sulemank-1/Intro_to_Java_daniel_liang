package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;

public class Exercise11_18 {
    public static void main(String[] args) {
        System.out.println(toCharacterArray("suleman"));
    }

    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        return characters;
    }
}

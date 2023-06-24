import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {
        if(identifier.contains(" ")){
            identifier = replace_any_spaces_encountered_with_underscores(identifier);
        }
        if(identifier.contains("\\")){
            identifier = replace_control_characters_with_the_upper_case_string_CTRL(identifier);
        }
        if(identifier.contains("-")){
            identifier = convert_kebab_case_to_camelCase(identifier);
        }
        return identifier;
    }

    static String replace_any_spaces_encountered_with_underscores(String word){
        String regex = " ";
        return word.replaceAll(regex, "_");
    }

    static String replace_control_characters_with_the_upper_case_string_CTRL(String word){
        String regex = "\\p{Cntrl}";
        return word.replaceAll(regex, "CTRL");
    }

    static String convert_kebab_case_to_camelCase(String word) {
        char[] characters = word.toCharArray();
        word="";
        for (char letter : characters){
            if(Character.isLetter(letter)){
                word = word.concat(String.valueOf(letter));
            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(SqueakyClean.convert_kebab_case_to_camelCase("caio_vinicius\n"));
    }
}
package linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="awesh subhash taral";
        char target='l';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(StringSearchforeachloop(name,target));
    }

    static boolean StringSearchforeachloop(String name, char target){
        if (name.length()==0){
            return false;
        }
        for(char ch:name.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }


    static boolean StringSearch(String name, char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i<name.length(); i++){
            char element=name.charAt(i);
            if (element==target){
                return true;
            }

        }
        return false;
    }
}

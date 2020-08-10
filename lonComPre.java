import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lonComPre {

    public static void main(String[] args){
        String[] strs = {"", "", ""};
        String comPre = findCom(strs);
        for (int i = 0; i < comPre.length(); i++){
            System.out.print(comPre.charAt(i));
        }
    }

    public static String findCom(String[] strs) {
        for (int i = 0; i < strs.length; i++){
            if (strs[i].equals("")){
                return "";
            }
        }

        if(strs.length == 0){
            return "";
        }

        if (strs.length == 1){
            return strs[0];
        }

        String minString = "";
        int minLength = 1000;
        int elemIndex = -1;
        for (int i = 0; i < strs.length; i++){
            if(strs[i].length() < minLength){
                minLength = strs[i].length();
                minString = strs[i];
                elemIndex = i;
            }
        }

        List<String> mylist = new ArrayList<>();
        mylist.addAll(Arrays.asList(strs));

        mylist.remove(elemIndex);

        char[] acc = new char[minString.length()];
        String str = minString;
        for (int i = 0; i < mylist.size(); i++) {
            String check = mylist.get(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == check.charAt(j)) {
                    acc[j] = str.charAt(j);
                }
                else{
                    acc[j] = ' ';
                }
            }

            if (acc[0] == ' '){
                return "";
            }
            else{
                str = " ";
                for(int k = 0; k < acc.length; k++){
                    if(acc[k] != ' '){
                        str += acc[k];
                    }
                }
                str = str.substring(1);
            }
        }

        return str;
    }
}

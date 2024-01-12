public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        int sLength =string.length();
        String newWord = "";
        for (int i = 0 ; i < sLength ; i++){
            char currentChar = string.charAt(i);
            if (currentChar == 'a' ||currentChar ==  'e' ||currentChar ==  'i' ||currentChar ==  'o' ||currentChar ==  'u'){
                newWord += (char)(currentChar - 32);
            }
            else if (currentChar == 32){
                newWord += currentChar;
            }
            else if (currentChar >= 'A' && currentChar <= 'Z' && (currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U')) {
                newWord += (char)(currentChar + 32);
            }
            else {
                newWord += currentChar;
            }
        }
        return newWord;
    }

    public static String camelCase (String string) {
        String res = "";

        for (int i = 0; i < string.length() ; i++){
            while (string.charAt(i) == ' '){
                i++;
                if (res != ""){
                  if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                    res += (char)(string.charAt(i) - 32);
                    i++;
                  }
                  else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                    res += string.charAt(i);
                    i++;
                  }
                }
            }
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                res += (char)(string.charAt(i) + 32);
            }
            else {
                res += string.charAt(i);
            }
        }
                return res;
    }


    public static int[] allIndexOf (String string, char chr) {
        int [] arr = new int [string.length()];
        int size = 0;
        for (int i = 0; i < string.length() ; i++){
            if ((char)string.charAt(i) == chr){
                arr [size] = i;
                size++;
            }
        }
        int [] res = new int [size];
        for (int k = 0; k < size; k++){
            res [k] = arr [k];
        }
        return res;
    }
}

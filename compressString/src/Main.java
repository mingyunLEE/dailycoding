public class Main {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output);
    }

    private static String compressString(String str) {
        if (str.length()==0) return "";
        char before = str.charAt(0);
        String result = "";
        int count = 1;
        str = str + ' ';
        for (int i = 1; i < str.length(); i++) {
            if (before == str.charAt(i)){
                count++;
            }else{
                if (count >= 3){
                    result = result + count + before;
                }else {
                    for (int j = 0; j < count; j++) {
                        result = result + before;

                    }
                }
                before = str.charAt(i);
                count = 1;
            }

        }
        return result;
    }
}
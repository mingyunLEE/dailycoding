public class Main {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("nzopdelepd", 11);
        System.out.println(output);
    }

    private static String decryptCaesarCipher(String str, int secret) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                result += str.charAt(i);
            }else {
                int asis = alpha.indexOf(str.charAt(i));
                int tobe = (asis - secret + alpha.length()) % alpha.length();
                result = result + alpha.charAt(tobe);
            }
        }

        return result;
    }
}
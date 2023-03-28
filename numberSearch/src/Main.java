public class Main {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output);

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output);

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output);
    }

    private static int numberSearch(String str) {
        if(str.length() < 1) return 0;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 58 && str.charAt(i)> 47){
                temp += str.charAt(i) -'0';
                count++;
            }
        }
        str = str.replace(" ","");
        int len = str.length()-count;
        double result = Math.round(temp*10/len);
        result /= 10;
        result = Math.round(result);
        return (int) result;

    }
}
public class Main {
    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output);
    }

    public static long power(int base, int exponent){
        if(exponent == 0) return 1;
        int half = exponent /2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1) return (base * result) % 9496249;
        else return  result;

    }
}
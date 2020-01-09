public class Main {

    public static void main(String[] args) {

        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!?";
        String input = "TEXT?";
        StringBuilder output = new StringBuilder();
        char c;
        int n;
        int offset = 1;

        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            n = (alpha.indexOf(c) + offset) % alpha.length();
            output.append(alpha.charAt(n));
        }
        System.out.println(output);


    }
}

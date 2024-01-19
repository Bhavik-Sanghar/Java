public class Rev {

    public static String Fun(String s){
        StringBuilder rev = new StringBuilder();
        int n = s.length()-1;
        while (n >= 0) {
            rev.append(s.charAt(n));
            n--;
        }
        return rev.toString();
    }

    public static String Fun2(String s) {
        if (s.isEmpty()) {
            return "";
        } else {
            return Fun(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(Fun(s));

        System.out.println(Fun2(s));
    }
}

public class A009 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        A009 sol = new A009();
        System.out.println(sol.solution("1234")); // true
        System.out.println(sol.solution("a234")); // false
        System.out.println(sol.solution("12345")); // false
        System.out.println(sol.solution("123456")); // true
    }
}

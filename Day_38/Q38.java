class Solution {
    public String counter(String s) {
        int Counter = 1;
        String Toreturn = "";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                Counter++;
            } else {
                Toreturn += Integer.toString(Counter) + s.charAt(i);
                Counter = 1;
            }
            if (s.charAt(i) != s.charAt(i + 1) && i == s.length() - 2) {
                Toreturn = Toreturn + Integer.toString(Counter) + s.charAt(i + 1);
            }

        }
        if (Counter != 1) {
            Toreturn += Integer.toString(Counter) + s.charAt(s.length() - 1);
        }
        System.out.println(Toreturn);
        return Toreturn;
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String s = "11";
        for (int i = 0; i < n - 2; i++) {
            s = counter(s);
        }
        return s;
    }
}
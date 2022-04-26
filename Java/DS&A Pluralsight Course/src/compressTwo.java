public class compressTwo {
    public static void main(String[] args) {
        char[] JavaCharArray = {'a', 'a', 'b', 'b', 'c'};
        System.out.println(compress(JavaCharArray));
    }

    public static int compress(char[] chars) {
        int len = 0; // also a pointer to modify array in-place
        for (int i = 0; i < chars.length; ) {
            chars[len] = chars[i];
            int j = i + 1;

            while (j < chars.length && chars[j] == chars[i])
                j++;

            if (j - i > 1) { // need compression
                String freq = j - i + "";
                for (char c : freq.toCharArray())
                    chars[++len] = c;
            }
            len++;
            i = j;
        }
        return len;
    }
}
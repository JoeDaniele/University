class StringCompression {


    public static void main(String[] args) {

        char[] a = {'a', 'a', 'a', 'b', 'b'};
        int n = a.length;

        compression(a, n);
    }

    static void compression(char[] a, int n) {

        int result = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && a[i] == a[i + 1]) {
                count++;
                i++;
            }

            if (count == 1) {
                result++;
            } else {
                result = result + 2;
            }
        }

        System.out.println(result);
    }
}
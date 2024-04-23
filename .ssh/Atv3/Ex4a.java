/**
 * Ex4a
 */
public class Ex4a {

    public static void main(String[] args) {
        int calc = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                calc += i;
            }
        }
        System.out.println(calc);
    }
}
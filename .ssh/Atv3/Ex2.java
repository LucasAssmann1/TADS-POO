public class Ex2 {
public static void main(String[] args) {
    int fib_tot, fib_1=1, fib_2=0;
    
    System.out.println(0);
    System.out.println(1);

    for (int i = 2; i < 31; i++) {
        fib_tot = fib_1 + fib_2;
        fib_2 = fib_1;
        fib_1 = fib_tot;
        System.out.println(fib_tot);   
    }
}
}

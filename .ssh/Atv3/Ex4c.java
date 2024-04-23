public class Ex4c {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            System.out.print(i + "\t"); 

            if (i % 5 == 0) {
                System.out.println();
            }
            
            i++;
        }
    }
}

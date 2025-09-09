package lab1;

public class Multiples {
    static void main(String[] args) {
        int count = multiples(10, 3, 5);
        System.out.println(count);
    }

    static int multiples(int n, int a, int b ) {
        int i = 1;
        int count = 0;
        while (i < n){
            if (i%a == 0 || i%b == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}

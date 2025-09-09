package lab1;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(multiples(1,2,3));
    }

    public static int multiples(int n, int a, int b) {
        int i = n;
        int count = 0;
        for (int j = 1; j < i; j++) {
            if (j % a == 0 && j % b == 0) {
                count++;
            } else if (j % a == 0) {
                count++;
            } else if (j % b == 0) {
                count++;
            }
        }
        return count;
    }
}

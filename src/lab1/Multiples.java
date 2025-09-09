package lab1;

public class Multiples {
    public static void main(String[] args) {
        int i = 10;
        int count = 0;
        for (int j = 1; j < i; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                count++;
            } else if (j % 3 == 0) {

                count++;
            } else if (j % 5 == 0) {

                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.*;

class HourGlassPattern {
    static void pattern(int rows) {
        int i, j, k;
        for (i = 1; i <= rows; i++) {
            for (k = 1; k <i; k++)
                System.out.print(" ");
            for (j = rows*2-1; j >=2*i-1 ; j--)
                System.out.print("*");
            System.out.println();
        }
        for (i = rows-1 ; i >= 1; i--) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (j = rows*2-1; j >=2*i-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        pattern(rows);

    }
}
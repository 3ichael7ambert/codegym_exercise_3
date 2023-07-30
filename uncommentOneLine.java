package Java.codegym_exercise_3;

/* uncomment one line so that 2 and 12 get printed out */
public class uncommentOneLine {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}

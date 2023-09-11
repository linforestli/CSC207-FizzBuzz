public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int num = 100;
        while (num > 0) {
            boolean divisibleBy2 = num % 2 == 0;
            if (divisibleBy2) {
                num = num / 2;
                step ++;
            } else {
                num --;
                step ++;
            }
        }
        System.out.println(step);
    }
}

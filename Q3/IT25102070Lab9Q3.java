public class IT25102070Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sum1 = add(part1, part2);
        int result1 = square(sum1);

        int sum2a = add(4, 7);
        int sum2b = add(8, 3);
        int square1 = square(sum2a);
        int square2 = square(sum2b);
        int result2 = add(square1, square2);

        System.out.println(
            "Result of (3 * 4 + 5 * 7)^2 : " + result1
        );

        System.out.println(
            "Result of (4 + 7)^2 + (8 + 3)^2 : " + result2
        );
    }
}
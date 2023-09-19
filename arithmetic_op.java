public class arithmetic_op {
    public static void main(String[] args) {
        // Basic arithmetic operators include Addition, Sub, Multiply, Division , Power(exp)
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        a++;b--;
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // gives 0 as it is a integer division
        System.out.println(Math.pow(2,3)); // a power b
        float f = (float)a/b;
        System.out.println(f);
    }
}

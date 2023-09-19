import java.util.*;        // To use Scanner Class we need to import java.util package
public class scannerclass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        boolean y = input.nextBoolean();
        float z = input.nextFloat();
        double d = input.nextDouble();
        String s = input.nextLine();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);
        System.out.println(s);


    }
}

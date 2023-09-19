// IMAGES PROVIDED
public class TypeCasting {
    public static void main(String[] args){
/*
Type casting, also known as type conversion,is the process of
changing the data type of variable in Java.

1) Widening type casting refers to the conversion of a lower data type into a higher one.
It is also known as implicit type casting or casting down.
It happens on its own. It is secure since there is no possibility of data loss.
 */
        System.out.println("Implicit TypeCasting:");
    int i = 10;
        System.out.println("Real Value = "+ i);
    long l = i; // Automatic Casting from int to long
        System.out.println("int to long casted value = "+ l);
    double d = i; // Automatic casting from int to double
        System.out.println("int to double casted value = "+d);

    // The Double datatype is larger than long,int . So smaller data type automatically
    // cast into larger datatype


/*
2) Narrowing Type Casting in Java refers to the conversion of a larger data type into a lower one.
It is also known as explicit type casting or casting up. It does not happen on its own.
 */
        System.out.println("Explicit TypeCasting:");
    double f = 78.514;
        System.out.println("Double value variable = "+f);
    int a = (int)f;
        System.out.println("Double to int variable = "+a);
    float n = (float)f;
        System.out.println("Double to float variable = "+n);
    }
}

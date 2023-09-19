public class Arrays {
    public static void main(String[] args) {
        /*
        -> Arrays in Java are non-primitive data types that store elements of a similar data type
        in the memory.
        -> Arrays in Java can store both primitive and non-primitive types of data in it.

        -> Arrays in Java can hold primitive data types (Integer, Character, Float, etc.) and non-primitive
        data types(Object). The values of primitive data types are stored in a memory location,whereas
        in the case of objects, it's stored in heap memory.

        -> Remember Array are different from ArrayList in Java. Arrays can store both primitive data types
        (like int, char) and objects, while ArrayLists can only store objects and use generics for type-safety.

        -> In Java, arrays are fixed in size, meaning once they are created, you cannot change their size,
        whereas ArrayLists are dynamic, allowing elements to be added or removed after initialization.
         */

        int[] array1 = new int[5];  // Method-1 to create int array
        int array2[] = new int[5];  // Method-2 to create int array

        array1[0] = 1; // one way to initialize array variables after declaring

        int[] array3 = {1,2,3,4,65};

        int[] a;
        a = new int[100];       // -> This is also possible in Array declaration

        System.out.println(array1[0]);
        System.out.println(array3.length); // use length to return the length of an array
        System.out.println(array3);  // Normally we can't print whole array in Java

    }
}

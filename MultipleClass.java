class Example1{
    int x = 5;
    String y = "hello";
    public void printX(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class MultipleClass {
    public static void main(String[] args) {
        Example1 a = new Example1();
        a.x = 10;
        a.printX();
    }
}

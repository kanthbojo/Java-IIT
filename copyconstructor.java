/*-> Copy Constructor is used to create a new object from existing object with same
  values of the existing objects

  -> changes made on the existing object don't affect the new copy
  */

class Student{
    int roll;
    String name;
    public Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
    public Student(Student student){    // This is a Copy Constructor
        this.roll = student.roll;
        this.name = student.name;
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student(9,"Sanjay");
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s1.name);
        s2.name = "Kanth";
        System.out.println(s1.name);
        System.out.println(s2.name);  // Change of value in object s2 does not affect value in s1
    }
}

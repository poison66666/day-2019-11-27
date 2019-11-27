/*
import java.util.ArrayList;

public class Test9 {
    public int[] multiply(int[] A) {
       if(A == null){
           return null;
       }
       int length = A.length;
       int[] B = new int[length];
       B[0] = 1;
       for(int i = 1;i <length;i++){
           B[i] = B[i-1]*A[i-1];
       }
       int temp = 1;
       for(int j = length-2;j >=0;j--){
           temp*=A[j+1];
           B[j]*=temp;
       }
       return B;
    }
}*/
class Person {
    String name = "No name";
    //public Person(){}
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
        super("sss");
        empID = id;
    }
}
public class Test9 {
    public static void main(String args[]) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}

package oops_Practice;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5,4);
        num1.print();

       ComplexNumber num2 = new ComplexNumber(4,2);
       num2.print();

//        num1.add(num2); // 7 i7
//        num1.print();

       num1.sub(num2);
       num1.print();

    }
}

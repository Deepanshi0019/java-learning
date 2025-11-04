import polymorphism.Avengers;
import polymorphism.Calculator;
import polymorphism.IronMan;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        IronMan i = new IronMan();
        Avengers a = new IronMan();
        a.fight();

    }
}





//// polymorphism
//public class Main {
//    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        System.out.println(cal.add(1,2,3));
//        System.out.println(cal.add(1,2));
//    }
//}


//import Encapsulation.Player;
//public class Main{
//    public static void main(String[] args) {
//       Player a1 = new Player();
//       a1.setAccount(124154);
//       System.out.println(a1.getAccount());
//
//       Player b = new Player();
//       b.setBalance(10000000);
//        System.out.println(b.getBalance());
//
//    }
//}






//import Inheritance_oops.*;
//
//
//public class Main{
//    public static void main(String[] args) {
//        Animal c1 = new Animal();
//        elepahant c2 = new elepahant();
//
//        c2.legs = 4;
//        System.out.println(c2.legs);
//        c2.eyes = 2;
//        System.out.println(c2.eyes);
//
//        c1.mouth = 1000;
//        System.out.println(c1.mouth);
//    }
//}
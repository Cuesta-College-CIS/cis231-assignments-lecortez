import java.util.Random;

public class ThreeRandomValues {
   public static void main(String[] args) {
      Random randGen = new Random();
      int num1;
      int num2;
      int num3;

      num1 = randGen.nextInt(101);
      num2 = randGen.nextInt(101);
      num3 = randGen.nextInt(101);

      System.out.print(" The generated random number are: ");
      System.out.print(num1 + " ");
      System.out.print(num2 + " ");
      System.out.println(num3 + " ");

      if ((num1 > num2) && (num1 > num3)) {
          System.out.println("The greatest number: " + num1);
      }
      if ((num2 > num1) && (num2 > num3)) {
        System.out.println("The greatest number: " + num2);
      }
      if ((num3 > num2) && (num3 > num1)) {
        System.out.println("The greatest number: " + num3);
    }
 }   
}

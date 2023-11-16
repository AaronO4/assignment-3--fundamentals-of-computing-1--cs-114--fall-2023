import java.util.Scanner;

public class RunMatrix {
public static int size;

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the size of your matrix:");
  final int size = scan.nextInt();
  System.out.println("Your matrix is " + size + " x " + size);
  scan.close();

      Matrix.flipMatrix();
      Matrix.printMatrix();
      Matrix.populateMatrix();
  }
}


  

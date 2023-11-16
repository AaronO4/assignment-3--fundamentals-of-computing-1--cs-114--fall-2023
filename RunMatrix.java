import java.util.Scanner;

public class RunMatrix {
public int value = 1;

  public static void main(String[] args) {

  final String RED = "\033[31m";
  final String RESET = "\033[0m";
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the size of your matrix:");
  final int size = scan.nextInt();
  System.out.println("Your matrix is " + size + " x " + size);
  scan.close();

    printMatrix();
    populateMatrix();
    flipMatrix();

  }
}


  

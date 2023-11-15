import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

  int value = 1;
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the size of your matrix:");
  int size = scan.nextInt();
  System.out.println("Your matrix is " + size + " x " + size);
  scan.close();

int[][] table = new int[size][size];

System.out.println("Printing matrix with default values:");
  for(int row = 0; row < table.length; row++){
      for(int col = 0; col < table[row].length; col++) {
          System.out.print(table[row][col] + "\t");
      }
  System.out.println();
  }

System.out.println("Populating matrix... matrix populated.");
System.out.println("Printing matrix:");

// loads values into the table

  for(int row = 0; row < table.length; row++){ // prints array
      for(int col = 0; col < table[row].length; col++) {
      table[row][col] = value++;
          System.out.print(table[row][col] + "\t");
      }

  System.out.println();
  }

System.out.println("Flipping matrix... matrix flipped.");
System.out.println("Printing flipped matrix:");

// int x = table[row].length;
// int y = table[col].length;
// int temp;
// temp = x;
// x = y;
// y = temp;

// size-1 = table[row].length+table[col].length;
//flipped version has to go here


  for(int row = 0; row < table.length; row++){ // prints array
      for(int col = 0; col < table[row].length; col++) {
          System.out.print(table[row][col] + "\t");
      }
  System.out.println();
  }

  }
}
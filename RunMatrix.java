import java.util.Scanner;

public class RunMatrix {

  private static void swap(int row1, int col1, int row2, int col2){
    int[][] table = new int[row1][col1];

    int hold = table[row1][col1];
    table[row1][col1] = table[row2][col2];
    table[row2][col2] = hold;
  }

  public static void main(String[] args) {

  int value = 1;
  final String RED = "\033[31m";
  final String RESET = "\033[0m";
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

// size-1 = table[row].length+table[col].length;
//flipped version has to go here

  for(int row = 0; row < table.length / 2; row++){ // prints array
      for(int col = 0; col < table[row].length; col++) {
          if(row + col != size - 1){
            swap(row, col, size - row, size - col);
          }
      }
        System.out.println();
    }
}
}

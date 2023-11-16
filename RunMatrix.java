import java.util.Scanner;

public class RunMatrix {

  private static void swap(int x1, int y1, int x2, int y2){
    int[][] table = new int[x1][y1];

    int hold = table[x1][y1];
    table[x1][y1] = table[x2][y2];
    table[x2][y2] = hold;
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

int[][] matrix = new int[size][size];
  }

public void printMatrix(){
System.out.println("Printing matrix with default values:");
  for(int row = 0; row < matrix.length; row++){
      for(int col = 0; col < matrix[row].length; col++) {
          System.out.print(matrix[row][col] + "\t");
      }
  System.out.println();
  }
}

// loads values into the table
public void populateMatrix(){
  System.out.println("Populating matrix... matrix populated.");
  System.out.println("Printing matrix:");

  for(int row = 0; row < matrix.length; row++){ // prints array
      for(int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = value++;
        System.out.print(matrix[row][col] + "\t");
      }

  System.out.println();
  }
}

//flipped version has to go here
public void flipMatrix(){
  System.out.println("Flipping matrix... matrix flipped.");
  System.out.println("Printing flipped matrix:");

  for(int row = 0; row < matrix.length / 2; row++){ // prints array
      for(int col = 0; col < matrix[row].length; col++) {
          if(row + col != size - 1){
            swap(row, col, size - row, size - col);
          }
      }
        System.out.println();
    }
    }
}

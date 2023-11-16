public class Matrix {

    public static int size; // declares array size and matrix to allow methods to function
    public static int[][] matrix = new int[size][size];

public static void printMatrix(){
    System.out.println("Printing matrix with default values:"); //prints unpopulated array
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
        System.out.println();
    }
}

// loads values into the table
public static void populateMatrix(){
    int value = 1; // necessary for the matrix values to print properly
  
    System.out.println("Populating matrix... matrix populated.");
    System.out.println("Printing matrix:");
  
    for(int row = 0; row < size; row++){ // prints populated array
        for(int col = 0; col < size; col++) {
          matrix[row][col] = value++;
          System.out.print(matrix[row][col] + "\t");
        }
    System.out.println();
    }
  }

  private static void swap(int x1, int y1, int x2, int y2){ //this method allows the later swap to work,
    int[][] table = new int[x1][y1];                        //cycles variables in later function
  
    int hold = table[x1][y1];
    table[x1][y1] = table[x2][y2];
    table[x2][y2] = hold;
  }

public static void flipMatrix(){ //flipped version of the matrix
    int value = 1; // again, necessary for the matrix values to print properly

    System.out.println("Flipping matrix... matrix flipped.");
    System.out.println("Printing flipped matrix:");

    for(int row = 0; row < size / 2; row++){ // prints final array
      for(int col = 0; col < size; col++) {
        matrix[row][col] = value++; //populates final array 
          if(row + col != size - 1){ //checks which numbers need to be flipped
            swap(row, col, size - row - 1, size - col - 1); //-1s cause the function to not flip diagonals
          }
        System.out.print(matrix[row][col] + "\t");
      }
        System.out.println();
    }
}
}

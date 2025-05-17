package Assignment1;
public class HQ1{
    
    public static double[][] addMatrix(double[][] a, double[][] b) {
        // Get the dimensions of the matrices
        int rows = a.length;
        int cols = a[0].length;

        // Ensure that both matrices have the same dimensions
        if (b.length != rows || b[0].length != cols) {
            System.out.println("Matrices dimensions must match!");
            return null; // Return null if dimensions don't match
        }

        // Initialize a result matrix to store the sum
        double[][] result = new double[rows][cols];

        // Add corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // Return the resulting matrix
        return result;
    }

    public static void main(String args[]) {
        // Example matrices a and b
        double[][] a = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        double[][] b = {
            {6.0, 5.0, 4.0},
            {3.0, 2.0, 1.0},
            {6.0, 8.9, 5.9}
        };

        // Call the addMatrix method and store the result
        double[][] result = addMatrix(a, b);

        // If the result is not null, print the result
        if (result != null) {
            System.out.println("Resulting Matrix:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

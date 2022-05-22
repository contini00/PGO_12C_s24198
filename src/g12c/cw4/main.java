package g12c.cw4;

public class main {


    public static void main(String[] args) {

        Matrix.setUpMatrix(3, 3);
        Matrix.dodajWiersz(new int[]{1, 2, 3});
        Matrix.dodajWiersz(new int[]{4, 5, 6});
        Matrix.dodajWiersz(new int[]{7, 8, 9});
        Matrix matrixA = Matrix.stworz();
        System.out.println("Matrix A:");
        matrixA.print();

        Matrix.setUpMatrix(3, 3);
        Matrix.dodajWiersz(new int[]{9, 8, 7});
        Matrix.dodajWiersz(new int[]{6, 5, 4});
        Matrix.dodajWiersz(new int[]{3, 2, 1});
        Matrix matrixB = Matrix.stworz();
        System.out.println("Matrix B:");
        matrixB.print();

        matrixA.add(matrixB);
        System.out.println("Matrix A after adding B");
        matrixA.print();

        matrixA.subtract(matrixB);
        System.out.println("Matrix A after subtracting B");
        matrixA.print();

        Matrix.setUpMatrix(3, 3);
        Matrix.dodajWiersz(new int[]{6, 3, 2});
        Matrix.dodajWiersz(new int[]{14, 5, 7});
        Matrix.dodajWiersz(new int[]{27, 5, 15});
        Matrix matrixC = Matrix.stworz();

        System.out.println("Matrix (A+B)-C+(A-C)");
        Matrix.add(matrixA, matrixB)
                .subtract(matrixC)
                .add(matrixA.subtract(matrixC))
                .print();
    }
}

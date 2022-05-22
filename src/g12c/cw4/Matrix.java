package g12c.cw4;

public class Matrix {

    private static int[][] temp;
    private static int nextEmpty = 0;

    private final int[][] matrix;
    private int liczbaKolumn;
    private int liczbaWierszy;


    private Matrix() {
        matrix = temp;
        liczbaKolumn = temp[0].length;
        liczbaWierszy = temp.length;
    }

    public static void setUpMatrix(int liczbaWierszy, int liczbaKolumn) {
        temp = new int[liczbaWierszy][liczbaKolumn];
    }

    public static void dodajWiersz(int[] wiersz) {
        if (wiersz.length != temp[0].length) {
            throw new RuntimeException("Liczba wierszy musi być tożsama z macierzą ");
        }
        if (nextEmpty >= temp.length) {
            throw new RuntimeException("Wszystkie wiersze musza buć wypełnione");
        }

        for (int i = 0; i < wiersz.length; i++) {
            temp[nextEmpty][i] = wiersz[i];
        }
        nextEmpty++;
    }

    public static Matrix stworz() {
        Matrix m = new Matrix();
        temp = null;
        nextEmpty = 0;
        return m;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println(" |");
        }
    }

    public Matrix add(Matrix m) {
        if (m.liczbaWierszy != this.liczbaWierszy || m.liczbaKolumn != this.liczbaKolumn) {
            throw new RuntimeException("Błędne wymiary macierzy");
        }
        for (int i = 0; i < m.liczbaKolumn; i++)
            for (int j = 0; j < m.liczbaWierszy; j++)
                this.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.liczbaWierszy != m2.liczbaWierszy || m1.liczbaKolumn != m2.liczbaKolumn) {
            throw new RuntimeException("Błędne wymiary macierzy");
        }
        Matrix tmp = m2;
        for (int i = 0; i < tmp.liczbaWierszy; i++)
            for (int j = 0; j < tmp.liczbaKolumn; j++)
                tmp.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
        return tmp;
    }

    public Matrix subtract(Matrix m) {
        if (m.liczbaWierszy != this.liczbaWierszy || m.liczbaKolumn != this.liczbaKolumn) {
            throw new RuntimeException("Błędne wymiary macierzy");
        }
        for (int i = 0; i < m.liczbaWierszy; i++)
            for (int j = 0; j < m.liczbaKolumn; j++)
                this.matrix[i][j] = this.matrix[i][j] - m.matrix[i][j];
        return this;
    }

    public Matrix substract(Matrix m1, Matrix m2){
        if(m1.liczbaWierszy != m2.liczbaWierszy || m1.liczbaKolumn != m2.liczbaKolumn){
            throw new RuntimeException("Błędne wymiary macierzy");
        }
        Matrix tmp = m2;
        for(int i = 0; i < m1.liczbaKolumn; i++)
            for(int j = 0; i < m1.liczbaKolumn; j++)
                tmp.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
        return tmp;
    }
}

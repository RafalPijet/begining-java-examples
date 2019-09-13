import java.util.*;

class Average {
    Random rand = new Random();

    double createArray(int count) {
        int table[] = new int[count];
        int sumElements = 0;
        System.out.println("Tablica " + count + "-o elementowa ma nastepujace liczby: ");
        for (int i = 0; i < count; i++) {
            table[i] = rand.nextInt(100);
            sumElements += table[i];
            System.out.print(table[i] + ", ");
        }
        System.out.println("--> suma = " + sumElements);
        return (double) sumElements / count;
    }
    double createMatrix(int count) {
        int tableMatrix[][] = new int[count][count];
        int sumElements = 0;
        System.out.println("Tablica dwuwymiarowa " + count + "x" + count + " elementow ma nastepujace liczby na przekatnej: ");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    tableMatrix[i][j] = rand.nextInt(10);
                    sumElements += tableMatrix[i][j];
                } else {
                    tableMatrix[i][j] = 0;
                }
                System.out.print(tableMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("suma elementow na przekatnej = " + sumElements);
        return (double) sumElements / count;
    }
}

class Application {
    public static void main(String[] args) {
        Average myAverage = new Average();
        double countingAverage = myAverage.createArray(20);
        System.out.println("\nSrednia wszystkich elementow tablicy = " + countingAverage);
        System.out.println();
        System.out.println("Srednia wszystkich elementow na przekatnej macierzy = " + myAverage.createMatrix(20));
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MassConvector {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter mass size: ");
        int size = scanner.nextInt();
        MassConvector massConvector = new MassConvector();
        int[]mass = massConvector.init(size);
        massConvector.descendingSort(mass);
    }

    private int[] init(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            System.out.print(i+")");
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private int[][] init(int rol, int col) {
        int[][] mass = new int[rol][col];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <mass[i].length; j++) {
            System.out.print(i+","+j+")");
            mass[i][j] = scanner.nextInt();
            }
        }
        return mass;
    }

    public MassConvector() {
    }

    public int [] descendingSort(int [] mass){
        for (int i = 0; i <mass.length ; i++) {
            for (int j = 0; j < mass.length - 1 - i; j++) {
                if (mass[j] < mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
        return mass;
    }

    public int [] sortAscending(int [] mass){
        for (int i = 0; i <mass.length ; i++) {
            for (int j = 0; j < mass.length - 1 - i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
        return mass;
    }

    public int minElement(int [] mass){
        int min = mass[0];
        for (int i = 0; i <mass.length ; i++) {
                if(mass[i]<min) {
                    min = mass[i];
                }
        }
        return min;
    }

    public int maxElement(int [] mass){
        int max = mass[0];
        for (int i = 0; i <mass.length ; i++) {
            if(mass[i]>max) {
                max = mass[i];
            }
        }
        return max;
    }

    public int max(int [][] mass){
        int max = mass[0][0];
        for (int i = 0; i <mass.length ; i++) {
            for (int j = i; j <mass[i].length; j++) {
                if(mass[i][j]>max) {
                    max = mass[i][j];
                }
            }
        }
        return max;
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập vào kích thước mảng : ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Số nhập vào lớn hơn 30 mời nhập lại");
            }
        } while (size > 30);
        double[] array = creatArray(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập điểm cho học sinh STT " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            for (int j = i; j < array.length; j++) {
                if (array[i] < 0 || array[i] > 10) {
                    System.out.print("Điểm nhập không hợp lệ mời nhập lại : ");
                    array[i] = scanner.nextInt();
                }
            }
        }
        System.out.println("Mảng điểm : " + Arrays.toString(array));
        System.out.println("Số lượng học sinh đỗ  là : " + passScore(array));
    }

    public static double[] creatArray(int size) {
        double[] array = new double[size];
        return array;
    }

    public static int passScore(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        return count;
    }
}

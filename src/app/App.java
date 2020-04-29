package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng 2 chiều: ");
        int size = scanner.nextInt();

        // Tạo ma trận vuông
        int[][] arr2c = new int[size][];
        for (int i = 0; i < size; i++) {
            arr2c[i] = new int[size];
            for (int j = 0; j < size; j++) {
                System.out.print("\nNhập giá trị cho [" + i + "][" + j + "] = ");
                arr2c[i][j] = scanner.nextInt();
            }
        }

        // tính tổng đường chéo chính.
        int total = 0;
        for(int i = 0; i < size; i++){
            total += arr2c[i][i];
        }

        System.out.println("\nTổng đường chéo chính: " + total);
    }
}

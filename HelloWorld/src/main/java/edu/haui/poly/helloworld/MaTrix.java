/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.helloworld;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class MaTrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int k = scanner.nextInt();

        // Khởi tạo hai ma trận
        int[][] a = new int[n][k];
        int[][] b = new int[n][k];

        // Nhập giá trị cho ma trận a
        System.out.println("Nhập giá trị cho ma trận a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }
          // Nhập giá trị cho ma trận b
        System.out.println("Nhập giá trị cho ma trận b: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("b[%d][%d] = ", i, j);
                b[i][j] = scanner.nextInt();
            }
        }

        // Tính tích của hai ma trận
        int[][] result = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int x = 0; x < k; x++) {
                    result[i][j] += a[i][x] * b[x][j];
                }
            }
        }
         System.out.println("Kết quả của a * b là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package edu.haui.poly.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Mang {

    static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 0;

        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Moi nhap n: ");
            n = s.nextInt();
            if (n < 0) {
                System.out.println("Xin moi nhap lai");
            }
        } while (n < 0);

        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            mang[i] = s.nextInt();
        }

        System.out.println("Mang ban dau: " + Arrays.toString(mang));

        Arrays.sort(mang);
        System.out.println("Mang sau khi sap tang: " + Arrays.toString(mang));

        int c = 0; // de so nguyen to  trong mang
        for (int i = 0; i < n; i++) {
            if (SNT(mang[i])) {
                c++;
            }
        }

        int[] mang1 = new int[c]; // khai bao mang chua so nguyen to
        int[] mang2 = new int[n - c];

        int j = 0, k = 0; // khai bao hai index cua hai mang
        for (int i = 0; i < n; i++) {
            if (SNT(mang[i])) {
                mang1[j++] = mang[i];
            } else {
                mang2[k++] = mang[i];
            }
        }

        System.out.println("Mang so nguyen to: " + Arrays.toString(mang1));
        System.out.println("Mang khong la so nguyen to: " + Arrays.toString(mang2));
    }
}

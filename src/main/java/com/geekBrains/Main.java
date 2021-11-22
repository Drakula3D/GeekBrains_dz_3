package com.geekBrains;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // заменить 0 на 1 и 1 на 0.
        System.out.println(Arrays.toString(arrInt));
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = arrInt[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arrInt));
        System.out.println();

        int[] arrMax = new int[100]; // заполнить массив от 1 ... 100.
        System.out.println(Arrays.toString(arrMax));
        for (int i = 0; i < arrMax.length; i++) {
            arrMax[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrMax));
        System.out.println();

        int[] arrMul = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // числа меньше 6 умножить на 2.
        System.out.println(Arrays.toString(arrMul));
        for (int i = 0; i < arrMul.length; i++) {
            arrMul[i] = arrMul[i] < 6 ? arrMul[i] * 2 : arrMul[i];
        }
        System.out.println(Arrays.toString(arrMul));
        System.out.println();

        int[][] arrThu = new int[5][5]; // заполнить диагональ единицами.
        for (int i = 0; i < arrThu.length; i++) {
            arrThu[i][i] = 1;
        }
        for (int i = 0; i < arrThu.length; i++) {
            for (int j = 0; j < arrThu.length; j++) {
                System.out.print(arrThu[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arrFree = new int[5][5]; // еще вариант заполнения диагонали единицами.
        for (int i = 0, j = (arrFree.length - 1); i < arrFree.length; i++, j--) {
            arrFree[i][j] = 1;
        }
        for (int i = 0; i < arrFree.length; i++) {
            for (int j = 0; j < arrFree.length; j++) {
                System.out.print(arrFree[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        array(5, 3); /*метод возвращающий одномерный массив типа int длиной len,
        каждая ячейка которого равна initialValue.*/
        System.out.println();

        int[] arrMM = new int[10]; // найти min и max элемент в массиве.
        int a = 100;
        int Max = 0;
        int Min = a;
        for (int i = 0; i < arrMM.length; i++) {
            arrMM[i] = (int) (Math.random() * a);
        }
        System.out.println(Arrays.toString(arrMM));
        for (int i = 0; i < arrMM.length; i++) {
            if (arrMM[i] < Min) {
                Min = arrMM[i];
            } else if (arrMM[i] > Max) {
                Max = arrMM[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + Min);
        System.out.println("Максимальный элемент в массиве: " + Max);
        System.out.println();

        int[] checkBalance = {1, 1, 1, 2, 1}; // возвращает true если в массиве есть место где сумма левой и правой части равны.
        System.out.println(Arrays.toString(checkBalance));
        System.out.println(compare(checkBalance));
        System.out.println();
        int[] checkBal = {2, 2, 2, 1, 2, 2, 10, 1}; // еще одна проверка.
        System.out.println(Arrays.toString(checkBal));
        System.out.println(compare(checkBal));
        System.out.println();

        int[] arrTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; /*написать метод, которому на вход задается одномерный массив
        и число n, при это метод должен сместить все элементы массива на n позиций, n смещает вправо, -n смещает влево.*/
        System.out.println(Arrays.toString(arrTest));
        shift(arrTest, 1);
        System.out.println(Arrays.toString(arrTest));
        shift(arrTest, -1);
    }

    public static void shift(int[] arr, int n) {
        if (n >= 0) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                int a = i + Math.abs(n - arr.length);
                while (a >= arr.length) {
                    a -= arr.length;
                }
                System.out.print(" " + arr[a]);
            }
            System.out.println(" ]");
        } else if (n < 0) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                int a = i - n;
                while (a >= arr.length) {
                    a -= arr.length;
                }
                System.out.print(" " + arr[a]);
            }
            System.out.println(" ]");
        } else System.out.println("введены не корректные данные");
        System.out.println();
    }

    private static boolean compare(int[] arr) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            left += arr[i];
            if (sum == left) {

                System.out.println("сумма левой части = " + left);
                System.out.println("сумма правой части = " + sum);
                return true;

            }
        }
        return false;
    }

    public static void array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

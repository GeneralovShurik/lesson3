 package com.company;

public class Main {

    public static void main(String[] args) {
       // String sign= "Lion"; //к нижнему регистру
	    // массивы
        // массив-совокупность значений одного типа
        //доступ к которым осуществляется
        // через одно имя переменной
        // индексация элементов массива начинается с 0 и заканчивается 4
        int [] temp = new int[5];//размер массива, кол во элементов, хранящихся в этом массиве
        temp[0] = 25;//1200-1203
        temp[1] = 20;//1204-1207
        temp[2] = 26;//1208..
        temp[3] = 22;
        temp[4] = 28;
        System.out.println(temp[0]);
        System.out.println(temp[4]);
        System.out.println(temp[2]);
        //.length-переменная в которой хранится количество элементов

        float avg = (float)(temp[0] + temp[2] + temp[2] + temp[3] + temp[4]) / temp.length;//temp.length; вместо 5 для определения длины массива
        System.out.println(avg);
        // inline -инициализация массивов
        float [] arr = {10.5f, 3.14f, 5.6f};
        System.out.println(arr[1]);

        // двумерный массив
        int [][] m = new int [3][6];// 3x6 в первых скобках колво строк, во вторых кол во столбцов
        m[1][4] = 52;
        m[0][2] = 100;
        System.out.println(m[0][2]);

        int [][] m2 = {{1,2},{3,4},{5,6},{7,8}};
        // здесь 4 строки и 2 столбца

        int [][] m3 = new int [2][];// 2 строки и 0 столбцов
        m3[0]= new int [10]; //  в 0 строке-10 элементов
        m3[1]= new int [5]; // в 1 строке -5 элементов

        //m3[1][5] = 45;- ощибка ! элемента с индексом 5 не существует в первой строке

        int [][][][] m4 = new int [1][2][3][4];
        //new -динамически выделяет память и возвращает ссылку на эту память
        int[] a = new int [3]; //1500
        int[] b = a;
        b[0] = 100;
        System.out.println(b[0]); //100
        System.out.println(a[0]); //100
        try {
            throw new Exception ("");
        } catch (Exception e) {

        }


    }
}

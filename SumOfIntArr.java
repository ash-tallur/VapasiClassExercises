/*Given an array of 10 integers, write a program to print the sum of all 10 integers in the given array.*/
public class SumOfIntArr {
    public static void main(String[] args) {
        int arr[] = new int[10];
        insertData(arr);
        printData(arr);
        int res = sumData(arr);
        System.out.println(res);
    }
    static void insertData(int[] array){
        int num = 15;
        for(int i=0;i<array.length;i++,num +=10){
            array[i]=num;
        }
    }

    static void printData(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    static int sumData(int[] array){
        int sum = 0;
        for(int i =0;i<array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }
}

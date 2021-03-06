package tasks.task2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        long sum = 0;
        long minNum = Long.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt();
            sum += array[i];
            minNum = (minNum > array[i]) ? array[i] : minNum;
            System.out.println(array[i] + " ");
        }
        
        System.out.println(sum);
        System.out.println(minNum);
    }
}

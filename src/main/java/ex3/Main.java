package ex3;

import java.util.Random;

public class Main {
    private static final Random random = new Random(1234);

    private static void execute(int length){
        int[] data = new int[length];

        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(data.length);
        }

        // 정렬 전
        SortSample sorter = new SortSample(data);
        System.out.println("BEFORE : " + sorter);

        // 정렬 후
        sorter.sort();
        System.out.println("AFTER : " + sorter);
        System.out.println();
    }

    public static void main(String[] args) {
        execute(10);
        execute(10);
        execute(10);
        execute(10);
        execute(10);
    }
}

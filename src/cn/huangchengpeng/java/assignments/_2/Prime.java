package cn.huangchengpeng.java.assignments._2;
public class Prime {
    public static void main(String args[]) {
        int max = 100;
        int array[] = new int[max + 1];
        for (int i = 3; i <= max / 2; i += 2) {
            if (array[i] == 1) {
                continue;
            }
            for (int j = 2; i * j <= max; j++) {
                array[i * j] = 1;
            }
        }
        for (int i = 51; i <= max; i += 2) {
            if (array[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
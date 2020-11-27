package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int rsl = Max.max(3, 5);
        System.out.println(rsl);
        rsl = Max.max(3, 5, 8);
        System.out.println(rsl);
        rsl = Max.max(3, 5, 8, 77);
        System.out.println(rsl);
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int straight) {
        return max(left, max(right, straight));
    }

    public static int max(int left, int right, int straight, int back) {
        return max(left, max(right, straight, back));
    }
}

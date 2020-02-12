package com.hillel.HWs.List;

public class Runner {
    public static void main(String[] args) {
        Integer ints[] = new Integer[]{2, 3};
        List<Integer> list = new List<Integer>(ints);
        list.addFirst(1);
        System.out.println(list);
        list.addByIndex(2, 2);
        System.out.println(list);
        list.addLast(3);
        System.out.println(list);
        list.removeByIndex(2);
        System.out.println(list);
    }
}

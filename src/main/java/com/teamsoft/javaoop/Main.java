package com.teamsoft.javaoop;

import com.teamsoft.javaoop.logic.BubbleSort;
import com.teamsoft.javaoop.logic.JavaSort;
import com.teamsoft.javaoop.logic.Sort;
import com.teamsoft.javaoop.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Sort<String> sortObj = new BubbleSort<>();
        //System.out.println("[result] " + sortObj.sort(Arrays.asList(args)));

        SortService sortObj = new SortService(new JavaSort<>());
        sortObj.doSort(Arrays.asList(args));
    }
}

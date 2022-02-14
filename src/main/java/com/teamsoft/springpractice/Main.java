package com.teamsoft.springpractice;

import com.teamsoft.springpractice.config.Config;
import com.teamsoft.springpractice.logic.JavaSort;
import com.teamsoft.springpractice.logic.Sort;
import com.teamsoft.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        //Sort<String> sort = context.getBean(Sort.class);
        //System.out.println("[result] " + sort.sort(Arrays.asList(args)));

        SortService sortService = context.getBean(SortService.class);
        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));

        //Sort<String> sortObj = new BubbleSort<>();
        //System.out.println("[result] " + sortObj.sort(Arrays.asList(args)));

        //SortService sortObj = new SortService(new JavaSort<>());
        //sortObj.doSort(Arrays.asList(args));
    }
}

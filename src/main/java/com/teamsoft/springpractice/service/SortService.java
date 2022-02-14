package com.teamsoft.springpractice.service;

import com.teamsoft.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {  //Qualifier("bubbleSort") 이름으로 Bean주입
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        //Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }
}

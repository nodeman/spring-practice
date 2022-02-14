package com.teamsoft.javaoop.service;

import com.teamsoft.javaoop.logic.BubbleSort;
import com.teamsoft.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void doSort() {
        List<String> actual = sut.doSort(List.of("3", "2", "1"));
        assertEquals(List.of("1", "2", "3"), actual);
    }
}
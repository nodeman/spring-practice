package com.teamsoft.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 리턴")
    @Test
    void testBubbleSort() throws Exception {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // when
        List<Integer> actual= bubbleSort.sort(List.of(3,2,1,5,4));

        // then
        assertEquals(List.of(1,2,3,4,5), actual);

    }
}
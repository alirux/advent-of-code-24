package com.codingful.codeadvent24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Day01Test {

	@Test
	void GIVEN_same_ordered_lists_WHEN_calculate_total_distance_THEN_distance_is_0() {
		Day01 sut = new Day01();
		
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		first.add(2);
		List<Integer> second = new ArrayList<>();
		second.add(1);
		second.add(2);
		
		int distance = sut.findTotalDistance(first, second);
		
		assertEquals(0, distance);
		
	}

	@Test
	void GIVEN_same_unordered_lists_WHEN_calculate_total_distance_THEN_distance_is_0() {
		Day01 sut = new Day01();
		
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		first.add(2);
		List<Integer> second = new ArrayList<>();
		second.add(2);
		second.add(1);
		
		int distance = sut.findTotalDistance(first, second);
		
		assertEquals(0, distance);
		
	}
	
	@Test
	void GIVEN_example_lists_WHEN_calculate_total_distance_THEN_distance_is_11() {
		Day01 sut = new Day01();
		
		
		List<Integer> first = new ArrayList<>();
		first.add(3);
		first.add(4);
		first.add(2);
		first.add(1);
		first.add(3);
		first.add(3);
		List<Integer> second = new ArrayList<>();
		second.add(4);
		second.add(3);
		second.add(5);
		second.add(3);
		second.add(9);
		second.add(3);
		
		int distance = sut.findTotalDistance(first, second);
		
		assertEquals(11, distance);
	}
	
	@Test
	void calcTotalOrderFromFile() throws Exception {
		Day01 sut = new Day01();
		
		
		int distance = sut.findTotalDistanceFromFile("day01/day01.txt");
		
		assertEquals(1222801, distance);
		
	}
}

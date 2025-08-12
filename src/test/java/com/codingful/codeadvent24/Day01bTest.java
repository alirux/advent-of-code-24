package com.codingful.codeadvent24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Day01bTest {

	@Test
	void GIVEN_same_ordered_lists_WHEN_calculate_similarity_THEN_similarity_is_3() {
		Day01b sut = new Day01b();
		
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		first.add(2);
		List<Integer> second = new ArrayList<>();
		second.add(1);
		second.add(2);
		
		long similarity = sut.findSimilarity(first, second).get();
		
		assertEquals(3, similarity);
		
	}

	@Test
	void GIVEN_same_unordered_lists_WHEN_calculate_similarity_THEN_similarity_is_3() {
		Day01b sut = new Day01b();
		
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		first.add(2);
		List<Integer> second = new ArrayList<>();
		second.add(2);
		second.add(1);
		
		long similarity = sut.findSimilarity(first, second).get();
		
		assertEquals(3, similarity);
		
	}
	
	@Test
	void GIVEN_example_lists_WHEN_calculate_similarity_THEN_similarity_is_31() {
		Day01b sut = new Day01b();
		
		
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
		
		long similarity = sut.findSimilarity(first, second).get();
		
		assertEquals(31, similarity);
	}
	
	@Test
	void calcSimilarityFromFile() throws Exception {
		Day01b sut = new Day01b();
		
		
		long similarity = sut.findSimilarityFromFile("day01/day01.txt");
		
		assertEquals(22545250, similarity);
		
	}
}

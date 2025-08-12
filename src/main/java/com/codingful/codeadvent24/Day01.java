package com.codingful.codeadvent24;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Day01 {

	public int findTotalDistanceFromFile(String file) throws URISyntaxException, IOException {
		Path path = Paths.get(getClass().getClassLoader().getResource(file).toURI());

		try (Stream<String> lines = Files.lines(path)) {
			List<Integer> first = new ArrayList<>();
			List<Integer> second = new ArrayList<>();
			
			lines.forEach(line -> {
				String[] split = line.split(" {3}");
				first.add(Integer.parseInt(split[0]));
				second.add(Integer.parseInt(split[1]));
			});
			
			return findTotalDistance(first, second);
			
		}
		
		
	}
	
	public int findTotalDistance(List<Integer> first, List<Integer> second) {
		first.sort(Comparable::compareTo);
		second.sort(Comparable::compareTo);
		
		int distance = 0;
		int i = 0;
		for (Integer f : first) {
			distance += Math.abs(f - second.get(i));
			i++;
		}
		return distance;
	}
	
}

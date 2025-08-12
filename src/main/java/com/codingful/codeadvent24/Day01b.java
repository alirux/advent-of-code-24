package com.codingful.codeadvent24;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Day01b {

	public long findSimilarityFromFile(String file) throws URISyntaxException, IOException {
		Path path = Paths.get(getClass().getClassLoader().getResource(file).toURI());

		List<Integer> first = new ArrayList<>();
		List<Integer> second = new ArrayList<>();

		loadListsFromFile(path, first, second);
		
		return findSimilarity(first, second).get();
		
	}

	private void loadListsFromFile(Path path, List<Integer> first, List<Integer> second) throws IOException {
		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(line -> {
				String[] split = line.split(" {3}");
				first.add(Integer.parseInt(split[0]));
				second.add(Integer.parseInt(split[1]));
			});
		}
	}
	
	public Optional<Long> findSimilarity(List<Integer> first, List<Integer> second) {
		return first.stream().map(f -> f * second.stream().filter(f::equals).count()).reduce((result, v) -> result + v);
	}
	
}

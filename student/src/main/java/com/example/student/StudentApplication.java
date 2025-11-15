package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	public static void findDuplicates(String input) {
		HashMap<Character, Integer> chars = new HashMap<>();
		for (Character c : input.toCharArray()) {
			chars.put(c, chars.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> i : chars.entrySet()) {
			if (i.getValue() > 1) {
				//System.out.println(i.getKey() + " appears " + i.getValue() + " times");
				System.out.print(i.getKey());
			}
		}

	}
}
package com.mini.project.lettercombination;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import com.mini.project.lettercombination.entity.KeyBoard;
import com.mini.project.lettercombination.service.ILetterService;
import com.mini.project.lettercombination.service.impl.LetterServiceImpl;

import junit.framework.TestCase;

public class MyJunitTest extends TestCase {

	public void testOne() {
		ILetterService letterService = new LetterServiceImpl();
		List<String> letters = letterService.getLetters(new int[] { 3 });
		assertArrayEquals(new String[] { "d", "e", "f" }, letters.toArray());
	}

	public void testTwo() {
		ILetterService letterService = new LetterServiceImpl();
		List<String> letters = letterService.getLetters(new int[] { 0 });
		assertArrayEquals(new String[] {}, letters.toArray());
	}

	public void testThree() {
		ILetterService letterService = new LetterServiceImpl();
		List<String> letters = letterService.getLetters(new int[] { 2, 3 });
		assertArrayEquals(new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" }, letters.toArray());
	}

	public void testFour() {
		ILetterService letterService = new LetterServiceImpl();
		List<String> letters = letterService.getLetters(new int[] { 9, 9 });
		assertArrayEquals(new String[] { "ww", "wx", "wy", "wz", "xw", "xx", "xy", "xz", "yw", "yx", "yy", "yz", "zw",
				"zx", "zy", "zz" }, letters.toArray());
	}

	public void testFive() {
		ILetterService letterService = new LetterServiceImpl();
		List<String> letters = letterService.getLetters(new int[] { 3, 99});
		assertArrayEquals(new String[] { "d", "e", "f" }, letters.toArray());
	}
}

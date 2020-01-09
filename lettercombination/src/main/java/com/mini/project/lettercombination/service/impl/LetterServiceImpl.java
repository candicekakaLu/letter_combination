package com.mini.project.lettercombination.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.mini.project.lettercombination.entity.KeyBoard;
import com.mini.project.lettercombination.service.ILetterService;

public class LetterServiceImpl implements ILetterService {

	@Override
	public List<String> getLetters(int[] args) {
		if (args.length == 0) {
			return new ArrayList<String>();
		}
		KeyBoard keyBoard = new KeyBoard();
		String str = "";
		List<String> returnList = new ArrayList<String>();
		keyBoard.findLetterCombinations(0, args, returnList, str);
		return returnList;
	}

}

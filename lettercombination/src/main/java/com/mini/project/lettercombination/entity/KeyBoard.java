package com.mini.project.lettercombination.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class KeyBoard {
    private Map<Integer,MiniKey> miniKeyMap;
    public Map<Integer, MiniKey> getMiniKeyMap() {
        return miniKeyMap;
    }
    public void setMiniKeyMap(Map<Integer, MiniKey> miniKeyMap) {
        this.miniKeyMap = miniKeyMap;
    }
    public KeyBoard(){
        MiniKey miniKey2 = new MiniKey();
        miniKey2.setPresskey(2);
        miniKey2.setLetters(new String[]{"a","b","c"});
        MiniKey miniKey3 = new MiniKey();
        miniKey3.setPresskey(3);
        miniKey3.setLetters(new String[]{"d","e","f"});
        MiniKey miniKey4 = new MiniKey();
        miniKey4.setPresskey(4);
        miniKey4.setLetters(new String[]{"s","h","i"});
        MiniKey miniKey5 = new MiniKey();
        miniKey5.setPresskey(5);
        miniKey5.setLetters(new String[]{"j","k","l"});
        MiniKey miniKey6 = new MiniKey();
        miniKey6.setPresskey(6);
        miniKey6.setLetters(new String[]{"m","n","o"});
        MiniKey miniKey7 = new MiniKey();
        miniKey7.setPresskey(7);
        miniKey7.setLetters(new String[]{"p","q","r"});
        MiniKey miniKey8 = new MiniKey();
        miniKey8.setPresskey(8);
        miniKey8.setLetters(new String[]{"t","u","v"});
        miniKey7.setLetters(new String[]{});
        MiniKey miniKey9 = new MiniKey();
        miniKey9.setPresskey(9);
        miniKey9.setLetters(new String[]{"w","x","y","z"});
        this.miniKeyMap = new HashMap<Integer, MiniKey>();
        miniKeyMap.put(2,miniKey2);
        miniKeyMap.put(3,miniKey3);
        miniKeyMap.put(4,miniKey4);
        miniKeyMap.put(5,miniKey5);
        miniKeyMap.put(6,miniKey6);
        miniKeyMap.put(7,miniKey7);
        miniKeyMap.put(8,miniKey8);
        miniKeyMap.put(9,miniKey9);

    }

    public void findLetterCombinations(int index, int[] args, List<String> list, String str) {

		if (index >= args.length) {
			if( StringUtils.isNotBlank(str)) {
				list.add(str);
			}
			return;
		}
		MiniKey miniKey = this.miniKeyMap.get(args[index]);
		if( miniKey == null) {
			findLetterCombinations(index + 1, args, list, str);
		}else {
			String[] strings = miniKey.getLetters();
			if (strings == null) {
				return;
			}
			for (int j = 0; j < strings.length; j++) {
				str += strings[j];
				findLetterCombinations(index + 1, args, list, str);
				if (str.length() != 0) {
					str = str.substring(0, str.length() - 1);
				}
			}
		}
		

	}
}

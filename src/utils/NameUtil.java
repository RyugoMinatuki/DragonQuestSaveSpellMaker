package utils;

import java.util.Arrays;
import java.util.List;

public class NameUtil {
	CodeUtil codeUtil;
	
	private String[] nameDict = { "０", "１", "２", "３", "４", "５", "６", "７", "８", "９", "あ", "い", "う", "え", "お", "か", "き",
			"く", "け", "こ", "さ", "し", "す", "せ", "そ", "た", "ち", "つ", "て", "と", "な", "に", "ぬ", "ね", "の", "は", "ひ", "ふ",
			"へ", "ほ", "ま", "み", "む", "め", "も", "や", "ゆ", "よ", "ら", "り", "る", "れ", "ろ", "わ", "を", "ん", "っ", "ゃ", "ゅ",
			"ょ", "゛", "゜", "ー", "　" };
	
	String[] nameCode;
	
	public String[] nameToCode(String name) {
		nameCode = new String[4];
		List<String> nameList = Arrays.asList(nameDict);
		char[] c = name.toCharArray();
		
		if(name.length() != 4) {
			System.err.println("なまえ　は４文字です。");
		} else {
			for (int i = 0; i < 4; i++) {
				nameCode[i] = codeUtil.numTo6Bit(nameList.indexOf(String.valueOf(c[i])));
			}
		}
		
		return nameCode;
	}
}

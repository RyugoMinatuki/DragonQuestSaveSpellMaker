package utils;

public class CodeUtil {

	public String numTo6Bit(int num) {
		String code = Integer.toBinaryString(num);

		return (code.length() < 6) ? "%6s".formatted(code).replace(" ", "0") : code.substring(code.length() - 6);
	}
}

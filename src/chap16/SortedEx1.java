package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ");
		System.out.println("±âº» Á¤·Ä");
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("±âº»ÀÇ ¿ª¼ø Á¤·Ä");
		list.stream().sorted(Comparator.reverseOrder())
		                      .forEach(s->System.out.println(s));
	}
}

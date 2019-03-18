package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Collection °´Ã¼ÀÇ ±âÁ¸ ¹æ½Ä°ú Stream ¹æ½Ä ºñ±³
 */
public class StreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ");
		System.out.println("±âÁ¸ ¹æ½Ä : Iterator °´Ã¼ »ç¿ë");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("Stream ¹æ½Ä ");
		Stream<String> st = list.stream();
		st.forEach(name->System.out.print(name + " "));
		System.out.println();
	}
}

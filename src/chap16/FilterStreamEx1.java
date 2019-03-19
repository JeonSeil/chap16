package chap16;

import java.util.Arrays;
import java.util.List;

//½ºÆ®¸²ÀÇ Filter ¿¹Á¦
public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","È«±æµ¿","ÀÓ²©Á¤","È«±æµ¿");
		//distinct() : Áßº¹Á¦°Å.
		list.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		
		list.stream().filter(s->s.startsWith("È«"))
		             .forEach(s->System.out.println(s));
		System.out.println();
		list.stream().distinct().filter(s->s.startsWith("È«"))
        .forEach(s->System.out.println(s));
	}
}

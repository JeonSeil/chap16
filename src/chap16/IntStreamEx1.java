package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * IntStream 예제
 */
public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성하기");
		IntStream is1 = Arrays.stream(arr);
		is1.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.of 메서드를 이용하여 IntStream 생성하기");
		IntStream is2 = IntStream.of(arr);
		is2.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.range(1,5) 메서드를 이용하여 IntStream 생성하기");
		IntStream is3 = IntStream.range(1,5);
		is3.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.rangeClosed(1,5) 메서드를 이용하여 IntStream 생성하기");
		IntStream is4 = IntStream.rangeClosed(1,5);
		is4.forEach(s->System.out.print(s+" "));
		System.out.println();		
	}
}

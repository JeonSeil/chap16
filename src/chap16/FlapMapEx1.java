package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * flatMapXXX 예제 : 새로운 스트림으로 생성함.
 */
public class FlapMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList
				        ("자바8 버전에","추가된 스트림을","열심히 공부하자");
//		list1.stream().flatMap(data->Arrays.stream(data.split(" ")))
//		.forEach(w->System.out.println(w));
		list1.stream().flatMap(data-> { //열심히 공부하자
			                 String[] s = data.split(" ");//열심히,공부하자
			                 Stream<String> st = Arrays.stream(s);
			                 return st; //자바8,버전에 ,추가된,스트림을,열심히,공부하자
	                }).forEach(w->System.out.println(w));
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		list2.stream().flatMapToInt(data-> {
			String[] arr = data.split(",");
			int[] intArr = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				intArr[i]=Integer.parseInt(arr[i]);
			}
			return Arrays.stream(intArr); //IntStream 타입 리턴
		}).forEach(n->System.out.println(n));
	}
}

package test0318;

import java.util.Arrays;
import java.util.List;

/* Stream 을 이용하여 배열의 합,갯수, 평균 구하기 */
public class Test1 {
	public static void main(String[] args) {
		  List<Integer> list =   Arrays.asList(5,3,2,1,4);
		  System.out.println
		          ("합계 :"+list.stream().mapToInt(Integer::intValue).sum());
		  System.out.println("평균 :"+list.stream()
		              .mapToInt(Integer::intValue).average().getAsDouble());
		  System.out.println("갯수 :"+list.stream().count());
	}
}

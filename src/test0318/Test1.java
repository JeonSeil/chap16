package test0318;

import java.util.Arrays;
import java.util.List;

/* Stream �� �̿��Ͽ� �迭�� ��,����, ��� ���ϱ� */
public class Test1 {
	public static void main(String[] args) {
		  List<Integer> list =   Arrays.asList(5,3,2,1,4);
		  System.out.println
		          ("�հ� :"+list.stream().mapToInt(Integer::intValue).sum());
		  System.out.println("��� :"+list.stream()
		              .mapToInt(Integer::intValue).average().getAsDouble());
		  System.out.println("���� :"+list.stream().count());
	}
}

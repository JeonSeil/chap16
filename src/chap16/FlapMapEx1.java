package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * flatMapXXX ���� : ���ο� ��Ʈ������ ������.
 */
public class FlapMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList
				        ("�ڹ�8 ������","�߰��� ��Ʈ����","������ ��������");
//		list1.stream().flatMap(data->Arrays.stream(data.split(" ")))
//		.forEach(w->System.out.println(w));
		list1.stream().flatMap(data-> { //������ ��������
			                 String[] s = data.split(" ");//������,��������
			                 Stream<String> st = Arrays.stream(s);
			                 return st; //�ڹ�8,������ ,�߰���,��Ʈ����,������,��������
	                }).forEach(w->System.out.println(w));
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		list2.stream().flatMapToInt(data-> {
			String[] arr = data.split(",");
			int[] intArr = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				intArr[i]=Integer.parseInt(arr[i]);
			}
			return Arrays.stream(intArr); //IntStream Ÿ�� ����
		}).forEach(n->System.out.println(n));
	}
}

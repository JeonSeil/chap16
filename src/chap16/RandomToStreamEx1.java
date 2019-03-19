package chap16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
 * ������ ��Ʈ��ȭ �ϱ� : RandomŬ���� �̿�
 */
public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int �� ���� ��Ʈ�� : Random().ints");
		IntStream is = new Random().ints(3); //������ ���� 3�� 
		is.forEach(s->System.out.print(s + " "));
		System.out.println();
		is = new Random().ints(10,0,3); //0���� 2������ ������ ���� 10��
		is.forEach(s->System.out.print(s + " "));
		System.out.println();
		//1 ���� 45������ ���� 6�� ����
		is = new Random().ints(6,1,46); 
		is.forEach(s->System.out.print(s + " "));
		System.out.println("\nlong �� ���� ��Ʈ�� : Random().longs");
		// long�� ���� 3�� �����ϴ� ��Ʈ��.
		LongStream ls = new Random().longs(3); //������ ���� 3�� 
		ls.forEach(s->System.out.print(s + " "));
		System.out.println();
		ls = new Random().longs(3,0,10); //0���� 9������ long�� ���� 3�� 
		ls.forEach(s->System.out.print(s + " "));
		System.out.println();
		//char�� ���� : IntStream ���
		is = new Random().ints(10,'A','Z'+1);
		is.forEach(s->System.out.print((char)s + " "));
		System.out.println();
		is = "Stream�� �����.".chars();
		is.forEach(s->System.out.print((char)s + " "));
		System.out.println();
		//double �� ��Ʈ��  
		System.out.println("\ndouble �� ���� ��Ʈ�� : Random().doubles");
		DoubleStream ds = new Random().doubles(3);
		ds.forEach(s->System.out.print(s + " "));
		System.out.println();		
	}
}

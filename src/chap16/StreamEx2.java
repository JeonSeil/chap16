package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int eng;
	private int math;
	Student(String name, int eng,int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {		return name;	}
	public int getEng() {		return eng;	}
	public int getMath() {		return math;	}
	@Override
	public String toString() {
		return "name=" + name + ", eng=" + eng + ", math=" + math;
	}	
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿",60,70),new Student("���",65,55),
				new Student("�̸���",80,75),new Student("�Ӳ���",85,65));
		/*
		 * list.stream() : list ��ü ���� ��ҵ��� Stream ��ü�� ����
		 * st.forEach(Consumer) : ��ҵ��� ��ȸ�ϱ�. ó��. ���ιݺ���.
		 */
		Stream<Student> st = list.stream();
		st.forEach(s-> { 
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum / 2.0;
			System.out.printf(", ����=%-5d, ���=%.2f\n",sum,avg);
		});
		System.out.println("������������:" 
		                   + list.stream().mapToInt(Student::getMath).sum());
		System.out.println("������������:" 
		                   + list.stream().mapToInt(Student::getEng).sum());
		System.out.println("���������л���:" + list.stream().count());
		System.out.println("���������л���:"  + list.stream().count());
		System.out.println("�����������:" 
           + list.stream().mapToInt(Student::getMath).average().getAsDouble());
		System.out.println("�����������:" 
           + list.stream().mapToInt(Student::getEng).average().getAsDouble());
	}
}

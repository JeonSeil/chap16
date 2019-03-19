package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student3 implements Comparable<Student3>{
	private String studno;
	private String name;
	private int grade;
	Student3(String studno, String name, int grade) {
		this.studno = studno;
	    this.name = name;
	    this.grade = grade;
	}
	@Override
	public String toString() {
		return "studno=" + studno + ", name=" + name + ", grade=" + grade;
	}
	public String getStudno() {	return studno;	}
	public String getName() {	return name;	}
	public int getGrade() {	return grade;	}
	@Override
	public int compareTo(Student3 s) {
		return studno.compareTo(s.getStudno());
	}
}
public class SortedEx2 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(
				new Student3("1234","ȫ�浿",1),
				new Student3("2345","���",2),
				new Student3("3456","�̸���",3),
				new Student3("4567","�Ӳ���",4)
		);
		//�й������� ���ĵǵ��� ���α׷� �ۼ��ϱ�
		System.out.println("***** �й������� ���� ******");
		list.stream().sorted().forEach(s->System.out.println(s));
		//�й��� �������� ���ĵǵ��� ���α׷� �ۼ��ϱ�
		System.out.println("***** �й� �������� ���� ******");
		list.stream().sorted(Comparator.reverseOrder())
		             .forEach(s->System.out.println(s));
		//�̸������� ���ĵǵ��� ���α׷� �ۼ��ϱ�
		System.out.println("***** �̸� ������ ���� ******");
//		list.stream().sorted(new Comparator<Student3>() {
//			@Override
//			public int compare(Student3 o1, Student3 o2) {
//				return o1.getName().compareTo(o2.getName());
//			}}).forEach(s->System.out.println(s));
		list.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName()))
		.forEach(s->System.out.println(s));
	}
}

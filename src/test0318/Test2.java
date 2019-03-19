package test0318;

/*
������ ����� �������� ���α׷� �����ϱ�
[���]
���� ��� ����:32.5
���� ��� ����:26.0
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class Person {
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {	return name;	}
	public String getGender() {	return gender;	}
	public int getAge() {		return age;	}
}
public class Test2 {
	private static List<Person> list = Arrays.asList(
			new Person("ȫ�浿", "����", 40), 
			new Person("������", "����", 30),
			new Person("�̸���", "����", 25), 
			new Person("�����", "����", 22));
	public static void main(String[] args) {
	  System.out.println("���� ��� ����:" + avg(t->t.getGender().equals("����")));
	  System.out.println("���� ��� ����:" + avg(t->t.getGender().equals("����")));
	 }
	public static double avg(Predicate<Person> op) {
		int sum=0,count=0;
		for(Person p : list) {
			if(op.test(p)) {
				sum += p.getAge();
				count++;
			}
		}
		return (double)sum/count;
	}
}

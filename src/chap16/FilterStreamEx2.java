package chap16;

import java.util.Arrays;
import java.util.List;

class Person {
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}	
}
public class FilterStreamEx2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				 new Person("ȫ�浿","����",35),
				 new Person("������","����",16),
				 new Person("�̸���","����",17),
				 new Person("�����","����",20));
		//���� ������ ���
		double ageAvg = list.stream()
				       .filter(p->p.getGender().equals("����"))
				       .mapToInt(Person::getAge).average().getAsDouble();
		System.out.println("���� ���� ���:" + ageAvg);
		System.out.println("���� ���� ���:" + list.stream()
		                           .filter(p->p.getGender().equals("����"))
                           .mapToInt(p->p.getAge()).average().getAsDouble());
		//���̰� 20�̻��� ����� �̸��� ���̸� ����ϱ� 
		list.stream().filter(p->p.getAge()>=20).
			forEach(s->System.out.println(s.getName()+" "+s.getAge()));
		//������ �ձ��ϱ�
		System.out.println("������:"
		          + list.stream().mapToInt(p->p.getAge()).sum());
		//�̸� ����ϱ�
		list.stream().forEach(s->System.out.println(s.getName()));
		list.stream().map(Person::getName).forEach(s->System.out.println(s));
		
	}
}

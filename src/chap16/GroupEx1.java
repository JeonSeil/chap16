package chap16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Student4 {
	public enum Gender {MALE,FEMALE};
	public enum City {SEOUL,PUSAN};
	private String name;
	private int score;
	private Gender gender;
	private City city;
	public Student4 (String name, int score,Gender gender, City city) {
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}
	public Student4 (String name, int score,Gender gender) {
		this(name,score,gender, City.SEOUL);
	}
	public String getName() {		return name;	}
	public int getScore() {		return score;	}
	public Gender getGender() {		return gender;	}
	public City getCity() {		return city;	}
}
public class GroupEx1 {
	public static void main(String[] args) {
		List<Student4> list = Arrays.asList(
		new Student4("ȫ�浿",90,Student4.Gender.MALE,Student4.City.PUSAN),
		new Student4("�̸���",80,Student4.Gender.MALE),
		new Student4("������",95,Student4.Gender.FEMALE),
		new Student4("�����",85,Student4.Gender.FEMALE,Student4.City.PUSAN)
		);
		Map<Student4.Gender,Double> map1 = list.stream()
				.collect(Collectors.groupingBy(
						Student4::getGender,
						Collectors.averagingDouble(Student4::getScore)
				));
		System.out.println(map1);
		System.out.println("���л� ���:" + map1.get(Student4.Gender.MALE));
		System.out.println("���л� ���:" + map1.get(Student4.Gender.FEMALE));
		//���л��鸸 List ��ü�� �����ϱ�
		List<Student4> list2 = list.stream()
				.filter(s->s.getGender()==Student4.Gender.MALE)
				.collect(Collectors.toList());
		
		for(Student4 s : list2)
		    System.out.println(s.getName() + ","+s.getScore());

		//���л��鸸 Set ��ü�� �����ϱ�
		Set<Student4> set1 = list.stream()
			.filter(s->s.getGender()==Student4.Gender.FEMALE)
			.collect(Collectors.toCollection(()->new HashSet<Student4>()));
		for(Student4 s : set1)
		    System.out.println(s.getName() + ","+s.getScore());
	}
}

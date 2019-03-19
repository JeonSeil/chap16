package test0318;

/*
다음의 결과나 나오도록 프로그램 수정하기
[결과]
남자 평균 나이:32.5
여자 평균 나이:26.0
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
			new Person("홍길동", "남자", 40), 
			new Person("성춘향", "여자", 30),
			new Person("이몽룡", "남자", 25), 
			new Person("향단이", "여자", 22));
	public static void main(String[] args) {
	  System.out.println("남자 평균 나이:" + avg(t->t.getGender().equals("남자")));
	  System.out.println("여자 평균 나이:" + avg(t->t.getGender().equals("여자")));
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

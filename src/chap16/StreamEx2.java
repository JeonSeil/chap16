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
				new Student("홍길동",60,70),new Student("김삿갓",65,55),
				new Student("이몽룡",80,75),new Student("임꺽정",85,65));
		/*
		 * list.stream() : list 객체 내의 요소들을 Stream 객체로 변경
		 * st.forEach(Consumer) : 요소들을 조회하기. 처리. 내부반복자.
		 */
		Stream<Student> st = list.stream();
		st.forEach(s-> { 
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum / 2.0;
			System.out.printf(", 총점=%-5d, 평균=%.2f\n",sum,avg);
		});
		System.out.println("수학점수총점:" 
		                   + list.stream().mapToInt(Student::getMath).sum());
		System.out.println("영어점수총점:" 
		                   + list.stream().mapToInt(Student::getEng).sum());
		System.out.println("수학응시학생수:" + list.stream().count());
		System.out.println("영어응시학생수:"  + list.stream().count());
		System.out.println("수학점수평균:" 
           + list.stream().mapToInt(Student::getMath).average().getAsDouble());
		System.out.println("영어점수평균:" 
           + list.stream().mapToInt(Student::getEng).average().getAsDouble());
	}
}

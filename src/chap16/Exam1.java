package chap16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

class Employee {
	private String name;  //이름
	private String work;  //업무
	private String position; //직급
	private int age;     //나이
	public Employee(String name, String work, String position, int age) {
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}
	public String getName() {		return name;	}
	public String getWork() {		return work;	}
	public String getPosition() {		return position;	}
	public int getAge() {		return age;	}
	@Override
	public String toString() {
		return "name=" + name + ", work=" + work + 
			 ", position=" + position + ", age=" + age;
	}
}
public class Exam1 {
	public static void main(String[] args) throws IOException {
		//1. emp.txt 파일을 읽어서, st 객체에 저장
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		Stream<String> f = br.lines();
		Stream<Employee> st = br.lines().map(data->{
			//data = 홍길동,개발자,사원,25
			String[] emp = data.split(",");
			Employee e = new Employee
					 (emp[0],emp[1],emp[2],Integer.parseInt(emp[3]));
			return e;
		});
		st.forEach(s->System.out.println(s));
		//2. 사원들이 속한 직급 정보 출력하기
		System.out.println("사원들이 속한 직급 정보 :");
		new BufferedReader(new FileReader("emp.txt")).lines()
		    .map(data->data.split(",")[2]).distinct()
		    .forEach(s->System.out.println(s));
	}
}

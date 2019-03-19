package chap16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

class Employee {
	private String name;  //�̸�
	private String work;  //����
	private String position; //����
	private int age;     //����
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
		//1. emp.txt ������ �о, st ��ü�� ����
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		Stream<String> f = br.lines();
		Stream<Employee> st = br.lines().map(data->{
			//data = ȫ�浿,������,���,25
			String[] emp = data.split(",");
			Employee e = new Employee
					 (emp[0],emp[1],emp[2],Integer.parseInt(emp[3]));
			return e;
		});
		st.forEach(s->System.out.println(s));
		//2. ������� ���� ���� ���� ����ϱ�
		System.out.println("������� ���� ���� ���� :");
		new BufferedReader(new FileReader("emp.txt")).lines()
		    .map(data->data.split(",")[2]).distinct()
		    .forEach(s->System.out.println(s));
	}
}

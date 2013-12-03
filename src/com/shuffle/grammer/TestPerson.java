package com.shuffle.grammer;

/**
 * @ClassName: TestPerson
 * @Description: 继承和权限控制
 * @version : 1.0
 * @date 2013-8-16 下午1:59:33
 * @author sunzhongyi szy1944@gmail.com
 */
public class TestPerson {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("John");
		student.setAge(18);
		student.setSchool("SCH");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getSchool());
	}

}

class Person{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Student extends Person{
	private String school;

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
}

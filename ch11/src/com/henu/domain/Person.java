package com.henu.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	//��������
	private int id;
	//�����������ԣ���Ӧ�ڱ��е���
	private String name;
	private int age;
	private String major;
	//�������ԣ�һ���Ӧ�ڱ��е����
	//private List courses = new ArrayList();
	//private String[] courses;
	//private Map courses = new HashMap();
	private Set courses = new HashSet();
	/**
	 * �޲ι��췽��
	 */
	public Person()
	{}
	/**
	 * ��ʼ��ȫ�����ԵĹ��췽��
	 * @param id
	 * @param name
	 * @param age
	 * @param major
	 * @param courses
	 */
	public Person(int id, String name, int age, String major, Set courses) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.major = major;
		this.courses = courses;
	}
	//setter��getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public Map getCourses() {
		return courses;
	}
	public void setCourses(Map courses) {
		this.courses = courses;
	}
	*/
	public Set getCourses() {
		return courses;
	}
	public void setCourses(Set courses) {
		this.courses = courses;
	}

	/*public List getCourses() {
		return courses;
	}
	public void setCourses(List courses) {
		this.courses = courses;
	}*/
}

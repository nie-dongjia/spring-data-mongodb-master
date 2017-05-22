package org.djn.test;

import java.util.ArrayList;
import java.util.List;

public class LikeSearchDemo {
	//定义员工类
	public class Employee {
	private String name;
	private int age;
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	}

	public List list=new ArrayList();

	//增加员工
	public List addList(String name,int age){
	Employee employee1 = new Employee();
	employee1.setName(name);
	employee1.setAge(age);
	list.add(employee1);
	return list;
	}

	//显示所有员工
	public void ShowList(){
	for(int i=0;i<list.size();i++){
	System.out.println(((Employee)(list.get(i))).getName()+" "+((Employee)(list.get(i))).getAge());
	}
	}

	//模糊查询
	public List likeString(String likename){
	for(int i=0;i<list.size();i++){
	if(((Employee)(list.get(i))).getName().indexOf(likename)<=-1)
	list.remove(i);
	}
	return list;

	}

	public static void main(String arg[]){
	LikeSearchDemo ll=new LikeSearchDemo();
	ll.addList("wuxiao",13);
	ll.addList("wangwang",11);
	ll.addList("wanghua",12);
	ll.addList("xiaowang",13);
	ll.addList("xiaoxiao",13);

	ll.likeString("wang");
	ll.ShowList();


	}

}

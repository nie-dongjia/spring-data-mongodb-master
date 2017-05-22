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
		System.out.println(((Employee)(list.get(i))).getName().indexOf(likename));
	if(((Employee)(list.get(i))).getName().indexOf(likename)<=-1)
	list.remove(i);
	}
	return list;

	}

	public static void main(String arg[]){
	LikeSearchDemo ll=new LikeSearchDemo();
	ll.addList("张三",13);
	ll.addList("张三22",11);
	ll.addList("张三3333",12);
	ll.addList("xiaowang",13);
	ll.addList("xiaoxiao",13);

	ll.likeString("wang");
	ll.ShowList();


	}
/************************************************************
 *
 * public List search(String name,List list){
   List results = new ArrayList();
   Pattern pattern = Pattern.compile(name);
   for(int i=0; i < list.size(); i++){
      Matcher matcher = pattern.matcher(((Employee)list.get(i)).getName());
      if(matcher.matches()){
         results.add(list.get(i));
      }
   }
   return results;
}

上面那个是大小写敏感的，如果要求大小写不敏感，改成：
Pattern pattern = Pattern.compile(name,Pattern.CASE_INSENSITIVE);

并且上面那个是精确查询，如果要模糊匹配，matcher.find()即可以进行模糊匹配
public List search(String name,List list){
   List results = new ArrayList();
   Pattern pattern = Pattern.compile(name);
   for(int i=0; i < list.size(); i++){
      Matcher matcher = pattern.matcher(((Employee)list.get(i)).getName());
      if(matcher.find()){
         results.add(list.get(i));
      }
   }
   return results;
}

 ************************************************************/
}

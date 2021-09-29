package com.programs;

public class InstanceVariable extends ChildInstance {
	int rollno;
	int marks;
	int x=10;
	InstanceVariable(String name,int age,int rollno,int marks){
		super(name,age);
		this.marks=marks;
		this.rollno=rollno;
		
	}
	@Override
	public String toString() {
		return " rollno=" + rollno + ","
				+ " marks=" + marks + ","
						+ "  name=" + name + ","
								+ " age="
				+ age ;
	}

	public static void main(String[] args) {
		
		int x=12;
		InstanceVariable iv=new InstanceVariable("ranjith", 23, 23, 100);
		iv.x=40;
		System.out.println(iv.x);
		System.out.println(iv);
		System.out.println(x);
	}

}


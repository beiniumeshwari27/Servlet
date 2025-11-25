package com.codegnan.beans;

public class Employee {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	private String eemail;
	private String emobile;
	
	public Employee() {
		super();
	}
	public Employee(int eno, String ename, float esal, String eaddr, String eemail, String emobile) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.eemail = eemail;
		this.emobile = emobile;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEmobile() {
		return emobile;
	}
	public void setEmobile(String emobile) {
		this.emobile =emobile;
	}
	
}

package info.inet;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private Integer empno;
	private String ename;

	public Employee(Integer eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}

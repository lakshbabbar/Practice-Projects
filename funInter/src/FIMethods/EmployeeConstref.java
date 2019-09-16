package FIMethods;

public class EmployeeConstref {

	private int empno;
	private String empname;
	
	public EmployeeConstref(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}
	
	public EmployeeConstref() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public EmployeeConstref(int empno) {
		this.empno = empno;
	}
	public EmployeeConstref(String empname) {
		this.empname = empname;
	}
	
	
}

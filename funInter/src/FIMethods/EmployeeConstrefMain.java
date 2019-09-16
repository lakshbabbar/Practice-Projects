package FIMethods;

public class EmployeeConstrefMain {

	public static void main(String[] args) {
		EmployeeConstrefInter employeeinter = EmployeeConstref::new;
		EmployeeConstref emp = employeeinter.getEmployee(20, "HCL");
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEmpname());
		
		EmployeeConstrefInternum employeeinternum = EmployeeConstref::new;
		EmployeeConstref emp1 = employeeinternum.insideinternum(400);
		System.out.println(emp1.getEmpno());
		
		EmployeeConstrefIntername employeeintername = EmployeeConstref::new;
		EmployeeConstref emp2 = employeeintername.insideintername("Laksh");
		emp1.setEmpname(emp2.getEmpname());
		System.out.println(emp1.getEmpname());
	}
}

package hcl.com.departmentshow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDepartmentSearch {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d = (DataQueryDao)ctx.getBean("myDao");
		d.searchDepartment(58);
	}
}

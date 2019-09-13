package com.hcl.hibdept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentInsert {

	public static void main(String[] args) {
		Department dept = new Department();
		dept.setDeptno(43);
		dept.setDname("Cosmology");
		dept.setLoc("Cambridge");
		dept.setHead("Stephen Hawking.");
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(dept);
		t.commit();
		System.out.println("Record Inserted");
	}
}

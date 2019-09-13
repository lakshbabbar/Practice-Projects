package com.hcl.hib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class InsertMain {

	public static void main(String[] args) {
		Employ e = new Employ();
		e.setEmpno(66);
		e.setName("bhanu");
		e.setDept("eee");
		e.setDesig("prog");
		e.setBasic(76856);
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		System.err.println("Record Inserted...");
	}
}

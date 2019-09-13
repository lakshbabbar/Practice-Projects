package com.hcl.EmployCRUDHib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EmployCRUD {

	public List<Employ> showEmploy(){
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> lstEmploy = q.list();
		return lstEmploy;
	}
	
	public Employ searchEmploy(int empno){
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q=s.createQuery("from Employ WHERE Empno = " + empno);
		List<Employ> lstEmploy = q.list();
		Employ employ = null;
		if(lstEmploy.size()!=0){
			employ = lstEmploy.get(0);
		} 
		return employ;
	}
	
	public String insertEmploy(Employ employ){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employ);
		t.commit();
		return "Record Inserted...";
	}
	
	public String updateEmploy(Employ employ){
		Employ res=searchEmploy(employ.getEmpno());
		res.setName(employ.getName());
		res.setDept(employ.getDept());
		res.setDesig(employ.getDesig());
		res.setBasic(employ.getBasic());
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(res);
		t.commit();
		return "Record Updated...";
	}
	
	public String deleteEmploy(int empno){
		Employ res=searchEmploy(empno);
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(res);
		t.commit();
		return "Record Deleted...";
	}
	
}

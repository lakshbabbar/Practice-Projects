package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;
import com.jwt.model.Student;
@Repository
public class ExamDAOImpl implements ExamDAO{
	

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addExam(Exam exam) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam);
		double avg=(double)sessionFactory.getCurrentSession().createQuery("select avg(marks) from Exam where studentid="+exam.getStudentid()).list().get(0);
		Student st=(Student)sessionFactory.getCurrentSession().createQuery("from Student where id="+exam.getStudentid()).list().get(0);
		st.setFinalScore((float)avg);
		sessionFactory.getCurrentSession().update(st);

	}

	@Override
	public Exam updateExam(Exam exam) {
		sessionFactory.getCurrentSession().update(exam);
		return exam;
	}

	@Override
	public void deleteExam(int examid) {
		Exam exam = (Exam) sessionFactory.getCurrentSession().load(
				Exam.class, examid);
		double avg;
		if (null != exam) {
			int studentid=exam.getStudentid();
			this.sessionFactory.getCurrentSession().delete(exam);
			if(sessionFactory.getCurrentSession().createQuery("from Exam where studentid="+studentid).list().size()>0){
			avg=(double)sessionFactory.getCurrentSession().createQuery("select avg(marks) from Exam where studentid="+studentid).list().get(0);
			} else {
				avg=0;
			}
			Student st=(Student)sessionFactory.getCurrentSession().createQuery("from Student where id="+studentid).list().get(0);
			st.setFinalScore((float)avg);
			sessionFactory.getCurrentSession().update(st);
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Exam> getAllExams(int studentid) {

		return sessionFactory.getCurrentSession().createQuery("from Exam where studentid = " + studentid)
				.list();
	}


	public Exam getExam(int examid) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, examid);
	
	}
}

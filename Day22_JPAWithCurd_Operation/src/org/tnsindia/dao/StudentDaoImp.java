package org.tnsindia.dao;

import java.beans.Statement;

import javax.persistence.EntityManager;

import com.tns.entities.Student;

import javassist.compiler.ast.Stmnt;

public abstract class StudentDaoImp implements StudentDao
{
	private EntityManager entityManager;
	

	public StudentDaoImp() 
	{
		entityManager=JPAUtil.getEntityManager();
		
	}

	@Override
	public void addStudent(Statement student) {
		entityManager.persist(student);
		
	}

	@Override
	public Student getStudentById(int ID) {
		org.tnsindia.dao.Student student =entityManager.find(Student.class,ID);
		return student;
		
	}

	@Override
	public void updateStudent(StudentDao student) {
		entityManager.merge(student);
		
	}

	@Override
	public void removeStudent(Stmnt student) {
		entityManager.remove(student);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	

}
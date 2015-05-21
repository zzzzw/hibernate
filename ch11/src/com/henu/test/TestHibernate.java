package com.henu.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.henu.domain.Person;
public class TestHibernate {
	public static void main(String args[])
	{
		//ʵ����һ��Configuration����
		Configuration cfg = new Configuration();
		/*Configuration�������Hibernate�����ļ���������һ���Ự����SessionFactory*/
		SessionFactory sf = cfg.configure().buildSessionFactory();
		//�ɻỰ������һ���Ự
		Session session = sf.openSession();
		//�ɻỰ����һ���������
		Transaction tx = session.beginTransaction();
		//ʵ����һ��Person����
		Person tom = new Person();
		tom.setName("Tom");
		tom.setAge(29);
		tom.setMajor("Computer Science");
		//�־û�Person����
		session.save(tom);
		tx.commit();
		session.close();	
}
}

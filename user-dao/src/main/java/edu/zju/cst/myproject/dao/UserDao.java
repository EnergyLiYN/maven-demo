package edu.zju.cst.myproject.dao;

import org.hibernate.Session;

import edu.zju.cst.myproject.model.User;
import edu.zju.cst.myproject.util.HibernateUtil;

public class UserDao implements IUserDao {

	public void add(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = HibernateUtil.openSession();

			session.beginTransaction();

			session.save(user);

			session.getTransaction().commit();
		} catch (Exception e) {
			// handle the exception
			throw new RuntimeException(e);
		} finally {
			HibernateUtil.close(session);

		}
	}

	public User getUserByName(String userName) {
		// TODO Auto-generated method stub
		Session session = null;
		User user = null;
		try {
			session = HibernateUtil.openSession();
			user = (User) session.createQuery("from User where Name = ?")
					.setParameter(0, userName).uniqueResult();

		} catch (Exception e) {
			// handle the exception
			throw new RuntimeException(e);
		} finally {
			HibernateUtil.close(session);
		}
		return user;
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = HibernateUtil.openSession();

			session.beginTransaction();

			session.delete(user);

			session.getTransaction().commit();
		} catch (Exception e) {
			// handle the exception
			throw new RuntimeException(e);
		} finally {
			HibernateUtil.close(session);

		}
	}

}

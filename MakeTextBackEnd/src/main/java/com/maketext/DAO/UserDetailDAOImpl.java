package com.maketext.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.maketext.model.Forum;
import com.maketext.model.UserDetail;

public class UserDetailDAOImpl implements UserDetailDAO {
@Autowired
SessionFactory sessionFactory;

	public boolean registerUser(UserDetail userDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(userDetail);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println("Exception Arised..........:"+e);
		return false;
		}
	
	}

	public boolean checkCredential(UserDetail userDetail) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query = session.createQuery("from UserDetail where loginnname=:loginname and password=:password ");
			query.setParameter("loginname",userDetail.getLoginname());
			query.setParameter("password",userDetail.getPassword());
			UserDetail userDetail1=(UserDetail)query.list().get(0);
			if(userDetail1==null)
			{
				return false;
			}
			else
			{
				return true;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	public UserDetail getUser(String loginName) {
		// TODO Auto-generated method stub
		try
		{
		Session session=sessionFactory.openSession();
		UserDetail userDetail=(UserDetail)session.get(UserDetail.class,loginName);
		return userDetail;
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public boolean updateUser(UserDetail userDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(userDetail);
		System.out.println("BEFORE INSERT/UPDATE " + userDetail.getLoginname());
		//if id==0, insert query
		//if id exits in the table, update query
	//INsert into product values (?,.....)
		System.out.println("AFTER INSERT/UPDATE " +  userDetail.getLoginname());
		return true;
		}
		catch(Exception e) {
			System.out.println("Exception Arised:"+e);
			
		}

		return false;
	}

}

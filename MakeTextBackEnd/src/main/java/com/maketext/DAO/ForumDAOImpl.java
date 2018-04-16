package com.maketext.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.maketext.model.Blog;

import com.maketext.model.Forum;
import com.maketext.model.ForumComment;

public class ForumDAOImpl implements ForumDAO {
@Autowired
private SessionFactory sessionFactory;
	public boolean addForum(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(forum);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println("Exception Arised..........:"+e);
		return false;
		}
		
	}

	public boolean updateForum(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(forum);
		System.out.println("BEFORE INSERT/UPDATE " + forum.getForumId());
		//if id==0, insert query
		//if id exits in the table, update query
	//INsert into product values (?,.....)
		System.out.println("AFTER INSERT/UPDATE " + forum.getForumId());
		return true;
		}
		catch(Exception e) {
			System.out.println("Exception Arised:"+e);
			
		}

		return false;
	}

	public boolean deleteForum(int forumId) {
		// TODO Auto-generated method stub
		
		try
		{
			Forum forum=(Forum) sessionFactory.getCurrentSession().get(Forum.class,forumId);
			sessionFactory.getCurrentSession().delete(forum);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	public List<Forum> listForums(String username) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Forum where loginname=:username");
			query.setParameter("username",username);
			List<Forum> listForums=query.list();
			return listForums;
		}
		catch(Exception e)
		{
			return null;
		}
					
	}

	public boolean approvedForum(Forum forum) {
		// TODO Auto-generated method stub
		
		try
		{
			forum.setStatus("A");
			sessionFactory.getCurrentSession().update(forum);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean rejectedForum(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
			forum.setStatus("NA");
			sessionFactory.getCurrentSession().update(forum);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public Forum getForum(int forumId) {
		// TODO Auto-generated method stub

		try
		{
		Session session=sessionFactory.openSession();
		Forum forum=(Forum)session.get(Forum.class,forumId);
		return forum;
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public List<Forum> listAllForums() {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Forum ");
			
			List<Blog> listForums=query.list();
			return listAllForums();
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

	public boolean incrementLike(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
			int likes=forum.getLikes();
			likes++;
			forum.setLikes(likes);
			sessionFactory.getCurrentSession().update(forum);
			return true;
		}
	catch(Exception e)
		{
		return false;
		}
	}

	public boolean addforumComment(ForumComment forumComment) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(forumComment);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println("Exception Arised..........:"+e);
		return false;
		}
	}

	public boolean deleteForumComment(ForumComment forumComment) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(forumComment);
			//Product product1=(Product)session.get(Product.class,product.getProductId());
			
			return true;
			}
			catch(Exception e) {
				System.out.println("Exception Arised:"+e);
			return false;
			}
	}

	public ForumComment getForumComment(int commentId) {
		// TODO Auto-generated method stub
		try
		{
		Session session=sessionFactory.openSession();
		ForumComment forumComment=(ForumComment)session.get(ForumComment.class,commentId);
		return forumComment;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

	public List<ForumComment> listForumComments(int ForumId) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from ForumComment");
			
			List<ForumComment> listForumComments=query.list();
			return listForumComments(0);
		}
		catch(Exception e)
		{
			return null;
		}
	}

}
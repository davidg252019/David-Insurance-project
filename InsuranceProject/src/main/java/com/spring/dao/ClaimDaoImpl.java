package com.spring.dao;

import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Claim;

@Repository
public class ClaimDaoImpl implements ClaimDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int addClaim(Claim c) 
	{
		int success=0;
		try {
			Session session=sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			/*Query q = session.createQuery("claim_id_seq.nextval");
			int i = q.executeUpdate();
			System.out.println(i);
			c.setId(i);*/
			success=(Integer)session.save(c);
			tx.commit();
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return success;

	}

	public List<Claim> getClaims() {
		// TODO Auto-generated method stub
		return null;
	}

}

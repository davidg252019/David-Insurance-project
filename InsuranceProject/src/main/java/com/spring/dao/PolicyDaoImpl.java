package com.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Policy;

@Repository
public class PolicyDaoImpl implements PolicyDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int addPolicy(Policy p) {
		int success=0;
		try {
			Session session=sessionFactory.openSession();
			
			success=(Integer)session.save(p);
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return success;
	}

	public List<Policy> getPolicies() {
		List<Policy> policies;
		Session session=sessionFactory.openSession();
		Query<Policy> theQuery =  session.createQuery("from Policy", Policy.class);
		policies = theQuery.getResultList();
		session.close();
		return policies;
	}

	public Policy getPolicy(int id) {
		Policy policy;
		Session session=sessionFactory.openSession();
		Query<Policy> theQuery =  session.createQuery("from Policy where id =" + id, Policy.class);
		policy= theQuery.getSingleResult();
		session.close();
		return policy;
	}

	public Policy getPolicy(String policyNum) {
		Policy policy;
		Session session=sessionFactory.openSession();
		Query<Policy> theQuery =  session.createQuery("from Policy where policyNum =" + policyNum, Policy.class);
		policy= theQuery.getSingleResult();
		session.close();
		return policy;
	}

}

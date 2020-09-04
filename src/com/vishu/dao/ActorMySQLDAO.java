package com.vishu.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vishu.controllers.Actor;

@Repository
public class ActorMySQLDAO implements ActorDAO {
	
	@Autowired
	SessionFactory factory;

	@Override
	public String saveActor(Actor bean) {
		Session s =factory.openSession();
		s.beginTransaction();
	    s.save(bean);
	    s.getTransaction().commit();
		s.close();
		return "actorsave.success";
	}

	@Override
	public String deleteActor(Long sl) {
		Session s =factory.openSession();
		s.beginTransaction();
		Actor a = s.get(Actor.class, sl);
	    s.delete(a);
	    s.getTransaction().commit();;
		s.close();
		return "actordelete.success";
	}

	@Override
	public String updateActor(Actor bean) {
		System.out.println(bean);
		Session s =factory.openSession();
		s.beginTransaction();
	    s.update(bean);
	    s.getTransaction().commit();;
		s.close();
		return "actorupdate.success";
	}

	@Override
	public Actor getActor(Long sl) {
		Session s =factory.openSession();
		s.beginTransaction();
	    Actor a= s.get(Actor.class,sl);
	    System.out.println(a);
	    s.getTransaction().commit();;
		s.close();
		return a;
	}

	@Override
	public List<Actor> getAllActors() {
		Session s =factory.openSession();
		s.beginTransaction();
	    List<Actor> actors = s.createQuery("from Actor order by uname").getResultList();
	    s.getTransaction().commit();;
		s.close();
		return actors;
	}

	@Override
	public List<Actor> getActors(String fname) {
		Session s =factory.openSession();
		s.beginTransaction();
		Query q = s.createQuery("from Actor where fname = :fn");
		q.setParameter("fn", fname);
		List<Actor> actors= q.getResultList();
	    s.getTransaction().commit();;
		s.close();
		return actors;
		
	}

}

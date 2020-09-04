package com.vishu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishu.controllers.Actor;
import com.vishu.dao.ActorDAO;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	ActorDAO dao;
	
	
	@Override
	public String createActor(Actor bean) {
		
		return dao.saveActor(bean);
	}

	@Override
	public String deleteActor(Long sl) {
		
		return dao.deleteActor(sl);
	}

	@Override
	public String updateActor(Actor bean) {
		
		return dao.updateActor(bean);
	}

	@Override
	public Actor getActor(Long sl) {
		
		return dao.getActor(sl);
	}

	@Override
	public List<Actor> listActors() {
		
		return dao.getAllActors();
	}

	@Override
	public List<Actor> listActorsByCharName(String fname) {
		
		return dao.getActors(fname);
	}

}

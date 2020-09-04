package com.vishu.dao;

import java.util.List;

import com.vishu.controllers.Actor;

public interface ActorDAO {

	public String saveActor(Actor bean);
	public String deleteActor(Long sl);
	public String updateActor(Actor bean);
	public Actor getActor(Long sl);
	public List<Actor> getAllActors();
	public List<Actor> getActors(String fname);
	
}

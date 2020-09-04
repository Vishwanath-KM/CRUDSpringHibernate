package com.vishu.services;

import java.util.List;

import com.vishu.controllers.Actor;

public interface ActorService
{

	public String createActor(Actor bean);
	public String deleteActor(Long sl);
	public String updateActor(Actor bean);
	public Actor getActor(Long sl);
	public List<Actor> listActors();
	public List<Actor> listActorsByCharName(String fname);
	
}

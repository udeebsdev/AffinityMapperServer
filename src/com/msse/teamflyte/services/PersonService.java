package com.msse.teamflyte.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.msse.teamflyte.affinitymapper.models.Location;
import com.msse.teamflyte.affinitymapper.models.Person;

public class PersonService {

	private EntityManager entityManager;
	
	PersonService (EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	public List<Person> getUsersWithSimilarInterst(List<Location> nearByLocationsOfUsers){
		List<String> nearByUserIds = getUserIdFromLocations(nearByLocationsOfUsers);
		
	}
	
	public List<String> getUserIdFromLocations(List<Location> nearByLocationsOfUsers){
		List<String> userIds = new ArrayList<String>();
		
		for(Location eachLocation : nearByLocationsOfUsers){
			userIds.add(eachLocation.getEmail());
		}
		
		return userIds;
	}
}

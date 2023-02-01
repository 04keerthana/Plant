package com.cg.onlineplantnursery.plant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursery.plant.entity.Plant;

@Repository

public interface IPlantRepository extends JpaRepositoryImplementation<Plant,Integer>{

	

	
	


}

package com.cg.onlineplantnursery.plant.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.cg.onlineplantnursery.exception.PlantIdNotFoundException;
import com.cg.onlineplantnursery.plant.entity.Plant;


@Service

public interface IPlantService {
	
	Plant addPlant(Plant plant)throws PlantIdNotFoundException;

	Plant updatePlant(int plantId)throws PlantIdNotFoundException;

	Plant deletePlant(Plant plant)throws PlantIdNotFoundException;

	Plant viewPlant(int plantId)throws PlantIdNotFoundException;

	List<Plant> viewPlant(String commonName)throws PlantIdNotFoundException;

	List<Plant> viewAllPlants()throws PlantIdNotFoundException;

	List<Plant> viewAllPlants(String typeOfPlant)throws PlantIdNotFoundException;

}

package com.cg.trainee.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.trainee.entities.Trainee;
import com.cg.trainee.exceptions.TraineeException;


@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	public void insertTrainee(Trainee trainee) throws TraineeException {
		System.out.println("in dao");
		manager.persist(trainee);
	}


	@Override
	public void deleteTrainee(int traineeID) throws TraineeException {
		System.out.println(traineeID);
		Trainee trainee = manager.find(Trainee.class, traineeID);
		manager.remove(trainee);
	}


	@Override
	public Trainee getTrainee(int traineeID) throws TraineeException {
		return manager.find(Trainee.class, traineeID);
	}


	@Override
	public List<Trainee> getAllTrainees() throws TraineeException {
		String strQry = "SELECT t FROM Trainee t";
		TypedQuery<Trainee> qry = manager.createQuery(strQry, Trainee.class);  
		List<Trainee> traineeList = qry.getResultList();
		return traineeList;
	}


	@Override
	public void modifyTrainee(int traineeID, String traineeName, String traineeDomain, String traineeLocation) throws TraineeException {
		Trainee trainee = manager.find(Trainee.class, traineeID);
		trainee.setTraineeName(traineeName);
		trainee.setTraineeLocation(traineeLocation);
		trainee.setTraineeDomain(traineeDomain);
	}

}

package com.cg.trainee.services;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.trainee.daos.TraineeDao;
import com.cg.trainee.entities.Trainee;
import com.cg.trainee.exceptions.TraineeException;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Resource
	private TraineeDao dao;
	
	
	@Override
	public void insertTrainee(Trainee trainee) throws TraineeException {
		dao.insertTrainee(trainee);
	}


	@Override
	public void deleteTrainee(int traineeID) throws TraineeException {
		dao.deleteTrainee(traineeID);
	}


	@Override
	public Trainee getTrainee(int traineeID) throws TraineeException {
		return dao.getTrainee(traineeID);
	}


	@Override
	public List<Trainee> getAllTrainees() throws TraineeException {
		return dao.getAllTrainees();
	}


	@Override
	public void modifyTrainee(int traineeID, String traineeName, String traineeDomain, String traineeLocation) throws TraineeException {
		dao.modifyTrainee(traineeID, traineeName, traineeDomain, traineeLocation);
	}

}

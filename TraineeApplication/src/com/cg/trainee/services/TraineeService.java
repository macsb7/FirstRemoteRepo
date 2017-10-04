package com.cg.trainee.services;

import java.util.List;

import com.cg.trainee.entities.Trainee;
import com.cg.trainee.exceptions.TraineeException;

public interface TraineeService {

	void insertTrainee(Trainee trainee) throws TraineeException;
	void deleteTrainee(int traineeID) throws TraineeException;
	Trainee getTrainee(int traineeID) throws TraineeException;
	List<Trainee> getAllTrainees() throws TraineeException;
	void modifyTrainee(int traineeID, String traineeName, String traineeDomain, String traineeLocation) throws TraineeException;
}

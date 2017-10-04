package com.cg.trainee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEE")

public class Trainee implements Serializable  {
	private int traineeID;
	private String traineeName;
	private String traineeDomain;
	private String traineeLocation;
	
	
	
	
	public Trainee() {
		super();
	}
		
	public Trainee(int traineeID, String traineeName, String traineeDomain,
			String traineeLocation) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	
	@Id
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	
	@Column(name="TRAINEENAME")
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	@Column(name="TRAINEEDOMAIN")
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	
	@Column(name="TRAINEELOCATION")
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	@Override
	public String toString() {
		return "Trainee [traineeID=" + traineeID + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}
	
	
	
	
}

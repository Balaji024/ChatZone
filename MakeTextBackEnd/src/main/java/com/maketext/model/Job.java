package com.maketext.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job {
	@Id
	String jobId;
	String jobDesignation;
	String company;
	int salary;
	String location;
	String jobDesc;

}

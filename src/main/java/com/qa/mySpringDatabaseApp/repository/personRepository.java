package com.qa.mySpringDatabaseApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.mySpringDatabaseApp.model.mySpringBootDataModel;

@Repository
public interface personRepository extends JpaRepository<mySpringBootDataModel, Long> {
	

}

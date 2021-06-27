package com.upgrad.upstac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.upgrad.upstac.entity.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {

	@Query("Select d.userName from Demo d where id=:id")
	String getData(int id);

}

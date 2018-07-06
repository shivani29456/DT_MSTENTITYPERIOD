package com.ril.donation.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ril.donation.modal.EntityPeriod;



public interface EntityPeriodRepository extends JpaRepository<EntityPeriod, Integer> {
	
	@Transactional
	public void deleteByEntityIdIn(List<Integer> entityIds);


}

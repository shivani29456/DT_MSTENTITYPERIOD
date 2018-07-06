package com.ril.donation.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ril.donation.modal.EntityPeriod;
import com.ril.donation.repository.EntityPeriodRepository;
import com.ril.donation.util.DeleteEntityPeriod;
import com.ril.donation.util.EntityPeriodUtil;

@RestController
public class EntityPeriodController
{
	@Autowired
	EntityPeriodRepository entityPeriodRepository;
	
	
	@RequestMapping(value="viewEntityPeriodMasters" ,method=RequestMethod.GET)
	   public ResponseEntity<Object> viewEntityPeriodMasters() {
		HashMap<String,Object> responseObject=new HashMap<String,Object>();
		List<EntityPeriod > list=entityPeriodRepository.findAll();
		responseObject.put("data", list);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	   }
	
	@RequestMapping(value="viewByIdEntityPeriodMaster" ,method=RequestMethod.POST)
	 public ResponseEntity<Object> viewEntityPeriodMaster(@Valid @RequestBody EntityPeriodUtil entityPeriodUtil) {
		HashMap<String,Object> responseObject=new HashMap<>();
		java.util.Optional<EntityPeriod> cmp=entityPeriodRepository.findById(entityPeriodUtil.getId());
		responseObject.put("data", cmp);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);

		
	   }	
	
	@RequestMapping(value="saveEntityPeriodMaster" ,method=RequestMethod.POST)
	public ResponseEntity<Object> saveEntityPeriodMaster(@Valid @RequestBody EntityPeriod entitycmp)
	{
		HashMap<String,Object> responseObject=new HashMap<>();
		entityPeriodRepository.save(entitycmp);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);

		
	}

	@RequestMapping(value="deleteEntityPeriodMaster" ,method=RequestMethod.POST)
    public ResponseEntity<Object> deleteCompanyMaster(  @Valid @RequestBody EntityPeriodUtil entityPeriodUtil) {
		HashMap<String,Object> responseObject=new HashMap<>();
		entityPeriodRepository.deleteById(entityPeriodUtil.getId());
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
	
	@RequestMapping(value="deleteEntityCompServerMasters" ,method=RequestMethod.POST)
    public ResponseEntity<Object> deleteCompanyMasters(  @Valid @RequestBody DeleteEntityPeriod deleteEntityPeriod) {
		HashMap<String,Object> responseObject=new HashMap<>();
		entityPeriodRepository.deleteByEntityIdIn(deleteEntityPeriod.getEntityPeriodIds());
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
	
	
	

}

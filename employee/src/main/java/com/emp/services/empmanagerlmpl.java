package com.emp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.emp;

@Service
public class empmanagerlmpl implements empmanager{
	@Autowired
	com.emp.dao.empDAO em;
	public List<emp> getallemp(){
		// TODO Auto-generated method stub
		return em.getallemp();
		
}
}
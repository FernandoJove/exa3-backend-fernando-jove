package com.examen.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Dao.RolDao;
import com.examen.Entity.Rol;
import com.examen.Service.RolService;
@Service
public class RolServiceImp implements RolService{

	@Autowired
	private RolDao rd;
	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		
		
		return rd.readAll();
	}

}

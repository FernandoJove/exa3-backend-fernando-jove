package com.examen.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Dao.AccesosDao;
import com.examen.Service.AccesosService;


@Service
public class AccesosServiceImp implements AccesosService{
	@Autowired
	private AccesosDao accesosDao;

	@Override
	public List<Map<String, Object>> read(int iduser) {
		// TODO Auto-generated method stub
		return accesosDao.read(iduser);
	}
}

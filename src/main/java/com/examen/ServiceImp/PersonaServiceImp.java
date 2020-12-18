package com.examen.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Dao.PersonaDao;
import com.examen.Entity.Persona;
import com.examen.Service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService{
	@Autowired
	private PersonaDao personaDao;
	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}
}

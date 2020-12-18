package com.examen.Service;

import java.util.List;
import java.util.Map;

import com.examen.Entity.Rol;

public interface RolService {
	
	int create(Rol rol);
	int update(Rol rol);
	int delete(Rol rol);
	List<Map<String,Object>>readAll();
}

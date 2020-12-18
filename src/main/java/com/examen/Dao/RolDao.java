package com.examen.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import com.examen.Entity.Rol;

public interface RolDao {
	int create(Rol rol);
	int update(Rol rol);
	int delete(Rol rol);
	List<Map<String,Object>>readAll();
	List<GrantedAuthority> buscarRolUser(int iduser);
}

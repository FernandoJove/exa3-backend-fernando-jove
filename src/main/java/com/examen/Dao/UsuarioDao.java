package com.examen.Dao;

import java.util.List;
import java.util.Map;

import com.examen.Entity.Usuario;


public interface UsuarioDao {
	Usuario read(int id);
	Usuario read(String nomuser);
	
	Usuario validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
}

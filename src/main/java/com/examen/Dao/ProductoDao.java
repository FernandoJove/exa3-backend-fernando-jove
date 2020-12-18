package com.examen.Dao;

import java.util.List;
import java.util.Map;

import com.examen.Entity.Producto;

public interface ProductoDao {
	
	List<Map<String, Object>>  readAll();
	List<Map<String, Object>>  read(String nomprod);
	int update(Producto producto);
}

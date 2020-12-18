package com.examen.Service;

import java.util.List;
import java.util.Map;

import com.examen.Entity.Producto;

public interface ProductoService {
	List<Map<String, Object>>  readAll();
	int update(Producto producto);
	List<Map<String, Object>>  read(String nomprod);
}

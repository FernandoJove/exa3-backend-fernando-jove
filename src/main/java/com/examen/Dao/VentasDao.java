package com.examen.Dao;

import java.util.List;
import java.util.Map;

public interface VentasDao {
	List<Map<String,Object>> readAll();
	List<Map<String,Object>> read(int id);
}

package com.examen.Dao;

import java.util.List;
import java.util.Map;

public interface AccesosDao {
	
	List<Map<String, Object>> read(int id);
}

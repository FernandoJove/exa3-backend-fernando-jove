package com.examen.Service;

import java.util.List;
import java.util.Map;

public interface VentasService {
	List<Map<String,Object>> readAll();
	List<Map<String,Object>> read(int id);
}

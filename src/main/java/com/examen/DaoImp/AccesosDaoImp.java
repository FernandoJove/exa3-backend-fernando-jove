package com.examen.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.Dao.AccesosDao;
@Repository
public class AccesosDaoImp implements AccesosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> read(int id) {
		String SQL ="select a.nomacceso, a.url, a.icono from acceso a " + 
				"INNER JOIN roles_acceso rc ON a.idacceso = rc.idacceso " + 
				"INNER JOIN roles r ON rc.idrol = r.idrol " + 
				"INNER JOIN usuarios_roles uc ON r.idrol = uc.idrol " + 
				"INNER JOIN usuarios u ON uc.idusuario = u.idusuario " + 
				"WHERE u.idusuario=?";
		return jdbcTemplate.queryForList(SQL,new Object[] {id});

	}

}

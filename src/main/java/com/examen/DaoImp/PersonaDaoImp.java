package com.examen.DaoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.Dao.PersonaDao;
import com.examen.Entity.Persona;
@Repository
public class PersonaDaoImp implements PersonaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from personas where idpersona=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Persona>(Persona.class));

	}

}

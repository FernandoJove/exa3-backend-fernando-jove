package com.examen.DaoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.examen.Dao.RolDao;
import com.examen.Entity.Rol;


@Component
public class RolDaoImp implements RolDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public List<GrantedAuthority> buscarRolUser(int iduser) {
		List<GrantedAuthority> autores = new ArrayList<GrantedAuthority>();
		String SQL = "SELECT r.idrol, r.nombre FROM usuarios u " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario=ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol " + 
				"WHERE u.idusuario = ?";
		List<Rol> roles = jdbcTemplate.query(SQL, new Object[]{iduser}, new BeanPropertyRowMapper<Rol>(Rol.class));		
		for(int i=0;i<roles.size();i++) {		
			autores.add(new SimpleGrantedAuthority(roles.get(i).getNombre()));
		}
		return autores;
	}

	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		String SQL="insert into roles(nombre) values (?)";
		return jdbcTemplate.update(SQL, rol);
	}

	@Override
	public int update(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="select * from roles";
		return jdbcTemplate.queryForList(SQL);
	}

}

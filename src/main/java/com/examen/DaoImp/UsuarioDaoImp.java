package com.examen.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.Dao.UsuarioDao;
import com.examen.Entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Usuario validarUsuario(String nomuser) {
		
		String SQL = "select * from usuarios where username = ? ";
		Usuario usuario = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));

		return usuario;
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.idusuario, r.idrol, p.nombres, u.username FROM persona p " + 
				"INNER JOIN usuarios u ON u.idpersona = p.idpersona " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario = ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol "+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from usuarios where idusuario=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public Usuario read(String nomuser) {
		String SQL = "SELECT *FROM usuarios WHERE username=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));

	}

}

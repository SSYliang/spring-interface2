package com.interfacetest.interfacetest2.dao.impl;

import com.interfacetest.interfacetest2.dao.UsersDao;
import com.interfacetest.interfacetest2.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    @Override
//    public void insertUsers(Users users) {
//        String sql = "insert into users(username,password) values(?,?)";
//        this.jdbcTemplate.update(sql,users.getUsername(),users.getPassword());
//    }

//    @Override
//    public void insertUsers(Users users) {
//        String sql = "select password from users where username = ?";
//        String password = jdbcTemplate.queryForObject(sql, String.class,users.getUsername());
//        System.out.println("密码为："+password);
//    }

//    @Override
//    public void insertUsers(Users users) {
//        String sql = "delete from users where username = ?";
//        jdbcTemplate.update(sql,users.getUsername());
//    }

    @Override
    public void insertUsers(Users users) {
        String sql = "update users set password = ? where username = ?";
        jdbcTemplate.update(sql,users.getPassword(),users.getUsername());
    }

//    @Override
//    public void insertUsers2(Users users) {
//        String sql = "insert into users(username,password) values(:username,:password)";
//        this.namedParameterJdbcTemplate.update(sql,new BeanPropertySqlParameterSource(users));
//    }

//    @Override
//    public void insertUsers2(Users users) {
//        String sql = "select * from users limit 1";
//        Users users1 = this.namedParameterJdbcTemplate.queryForObject(sql, new HashMap<>(), new BeanPropertyRowMapper<Users>(Users.class));
//        System.out.println("用户名为："+users1.getUsername());
//    }

//    @Override
//    public void insertUsers2(Users users) {
//        String sql = "delete from users where username = :username";
//        Map<String,Object> paramMap = new HashMap<>();
//        paramMap.put("username", users.getUsername());
//        this.namedParameterJdbcTemplate.update(sql,paramMap);
//    }

    @Override
    public void insertUsers2(Users users) {
        String sql = "update users set password = :password where username = :username";
        SqlParameterSource ps=new BeanPropertySqlParameterSource(users);
        this.namedParameterJdbcTemplate.update(sql,ps);
    }
}

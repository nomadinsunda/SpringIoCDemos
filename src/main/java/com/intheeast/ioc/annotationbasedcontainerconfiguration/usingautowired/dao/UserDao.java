package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.dao;

import javax.sql.DataSource;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class UserDao {
	
	private String name;
	private String id;
	private DataSource dataSource;

}

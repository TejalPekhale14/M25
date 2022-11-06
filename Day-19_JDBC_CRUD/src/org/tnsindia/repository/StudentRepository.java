package org.tnsindia.repository;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.tnsindia.entities.Student;

public interface StudentRepository {
	
	public abstract int create(String query,Student student);
	public abstract int update(String query,Student student);
	public abstract int delete(String query);
	public abstract ResultSet retrieve(String query);
	Statement createstatement();
	PreparedStatement createPrepareStatement(String query);
}

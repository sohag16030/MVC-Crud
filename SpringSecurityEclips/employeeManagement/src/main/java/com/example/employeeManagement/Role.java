package com.example.employeeManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="role_store")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long role_id;
	private String role;
	

}

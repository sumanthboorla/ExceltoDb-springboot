/**
 * Copyrights belongs to sumanth
 */
package com.sbTech.ExceltoDB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Developed suman on 10 Feb 2026 
 */
@Entity
@Table(name = "etodb")
@Data
public class EtoDbEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private double employeeSalary;
}

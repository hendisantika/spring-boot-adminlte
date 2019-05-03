package com.hendisantika.adminlte.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Aung Myat Hein
 */

@Entity
@Table(name = "MasterSetUp")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MasterCode implements Serializable {


	private static final long serialVersionUID = -7765610806273678054L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@NotEmpty
	private String code;
	
	@NotEmpty(message="Type should not be empty.")
	private String type;
	private Long parentID;
	private String parentName;
	
	@NotEmpty(message="Name should not be empty.")
	private String name;
	private String description;
	private Boolean isDelete = false;
	
	@Embedded
	private AbstractTimestampEntity abstractTimestampEntity = new AbstractTimestampEntity();
	

	
	
	
}

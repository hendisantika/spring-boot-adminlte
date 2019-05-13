package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.hendisantika.adminlte.enums.RolesEnum;
import com.hendisantika.adminlte.common.Constant;

/**
 * Created by Aung Myat Hein
 */

@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = -5817777030429987937L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull(message = Constant.MSG_ROLE_NAME_EMPTY)
	@NotEmpty(message = Constant.MSG_ROLE_NAME_EMPTY)
	@Column(unique = true)
	private String roleName;

	private String namePrefix;

	@Size(max = Constant.DESCRIPTION_MAX_SIZE, message = Constant.MSG_DESCRIPTION_MAX_SIZE)
	private String description;

	private String taskAccessFunctionalities;

	

	public Role() {

	}
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private Set<UserRole> userRoles = new HashSet<>();

	
	
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	public Role(long id) {
		super();
		this.id = id;
	}

	public Role(long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	public Role(long id, String roleName, String description) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.description = description;
	}

	public Role(RolesEnum rolesEnum) {
		this.id = rolesEnum.getId();
		this.roleName = rolesEnum.getRoleName();
		this.description = rolesEnum.getRoleDescription();
		this.namePrefix = rolesEnum.getRoleNamePrefix();
		this.taskAccessFunctionalities = rolesEnum.getRoleAccessFunctionalties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTaskAccessFunctionalities() {
		return taskAccessFunctionalities;
	}

	public void setTaskAccessFunctionalities(String taskAccessFunctionalities) {
		this.taskAccessFunctionalities = taskAccessFunctionalities;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", namePrefix=" + namePrefix + ", description="
				+ description + ", taskAccessFunctionalities=" + taskAccessFunctionalities + "]";
	}

	

}

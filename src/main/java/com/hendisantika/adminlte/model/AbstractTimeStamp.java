package com.hendisantika.adminlte.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class AbstractTimeStamp implements Serializable {

	private static final long serialVersionUID = 5085156002610334435L;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", updatable = false)
    private Date created = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false)
    private Date updated = new Date();
    
	private long createdUser;
    private long updatedUser;  

    @PrePersist
    protected void onCreate() {
     created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
    updated = new Date();
    }

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public long getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(long createdUser) {
		this.createdUser = createdUser;
	}

	public long getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(long updatedUser) {
		this.updatedUser = updatedUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + (int) (createdUser ^ (createdUser >>> 32));
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + (int) (updatedUser ^ (updatedUser >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractTimeStamp other = (AbstractTimeStamp) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (createdUser != other.createdUser)
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (updatedUser != other.updatedUser)
			return false;
		return true;
	}

    
}
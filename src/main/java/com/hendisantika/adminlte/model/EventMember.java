package com.hendisantika.adminlte.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "eventmember")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"eventRole"})
public class EventMember implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user = new User();
	
	@ManyToOne
	@JoinColumn(name="eventRole")
	private EventRoleSetUp eventRole = new EventRoleSetUp();
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;
	
	@ManyToOne
	@JoinColumn(name="event_outlet_id")
	private EventOutlet event_outlet;

	
	
	@Embedded
	private AbstractTimeStamp timeStamp = new AbstractTimeStamp();
	
	@Version
	@Column(name = "version")
	private long version;
}

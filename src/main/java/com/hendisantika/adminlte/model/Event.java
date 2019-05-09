package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "event")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"managerList","ticketList","outletList"})
public class Event implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String location;
	private Date startDate;

	@OneToMany
	private List<EventMember> managerList = new ArrayList<EventMember>();
	@OneToMany
	private List<EventTicket> ticketList = new ArrayList<EventTicket>();
	@OneToMany
	private List<EventOutlet> outletList = new ArrayList<EventOutlet>();

	@Embedded
	private AbstractTimeStamp timeStamp = new AbstractTimeStamp();

	@Version
	@Column(name = "version")
	private long version;
}

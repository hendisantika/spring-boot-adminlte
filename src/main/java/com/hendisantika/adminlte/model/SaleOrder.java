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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "saleorder")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"outlet","user","event"})
public class SaleOrder implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date orderDate;
	@ManyToOne
	private Event event = new Event();
	@ManyToOne
	private EventOutlet outlet = new EventOutlet();
	@ManyToOne
	private EventMember user = new EventMember();
	@OneToOne
	private Customer customer = new Customer();
	
	@OneToMany
	private List<SaleItem> items = new ArrayList<SaleItem>();
	
	
	@Embedded
	private AbstractTimeStamp timeStamp = new AbstractTimeStamp();
	
	@Version
	@Column(name = "version")
	private long version;
}

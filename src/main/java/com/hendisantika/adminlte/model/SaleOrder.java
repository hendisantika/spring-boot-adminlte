package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@JoinColumn(name="event_id")
	private Event event = new Event();
	@ManyToOne
	@JoinColumn(name="outlet_id")
	private EventOutlet outlet = new EventOutlet();
	@ManyToOne
	@JoinColumn(name="user_id")
	private EventMember user = new EventMember();
	@OneToOne
	private Customer customer = new Customer();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="saleorder")
	private List<SaleItem> items = new ArrayList<SaleItem>();
	
	
	@Embedded
	private AbstractTimeStamp timeStamp = new AbstractTimeStamp();
	
	@Version
	@Column(name = "version")
	private long version;
}

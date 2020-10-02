package com.xworkz.nation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="NATION_TABLE")
public class NationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="N_ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int nid;
	
	@Column(name="NATION_NAME")
	private String name;
	
	@Column(name="NATION_CAPITAL")
	private String capital;
	
	@Column(name="NO_OF_STATES")
	private int noOfStates;

	public NationDTO() {
	}

	public NationDTO(String name, String capital, int noOfStates) {
		super();
		this.name = name;
		this.capital = capital;
		this.noOfStates = noOfStates;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NationDTO [nid=" + nid + ", name=" + name + ", capital=" + capital + ", noOfStates=" + noOfStates + "]";
	}

}

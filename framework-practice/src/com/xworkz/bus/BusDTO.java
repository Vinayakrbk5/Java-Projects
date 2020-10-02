package com.xworkz.bus;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@Entity
@Table(name = "BUS_TABLE")
@NamedNativeQueries({@NamedNativeQuery(name="fetchBusNameAndCountByCapacity",
query="select BUS_NAME,count(BUS_NAME) over(order by BUS_NAME) as row_num from BUS_TABLE where BUS_CAPACITY=:qty")})
public class BusDTO implements Serializable {

	@Id
	@Column(name = "B_ID")
	@GenericGenerator(name = "Xworkz", strategy = "increment")
	@GeneratedValue(generator = "Xworkz")
	private Integer busId;
	@Column(name = "BUS_NAME")
	private String busName;
	@Column(name = "BUS_COLOR")
	private String busColor;
	@Column(name = "BUS_CAPACITY")
	private Integer busCapacity;

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusColor() {
		return busColor;
	}

	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}

	public Integer getBusCapacity() {
		return busCapacity;
	}

	public void setBusCapacity(Integer busCapacity) {
		this.busCapacity = busCapacity;
	}

	public BusDTO() {
	}

	@Override
	public String toString() {
		return "BusDTO [busId=" + busId + ", busName=" + busName + ", busColor=" + busColor + ", busCapacity="
				+ busCapacity + "]";
	}

}

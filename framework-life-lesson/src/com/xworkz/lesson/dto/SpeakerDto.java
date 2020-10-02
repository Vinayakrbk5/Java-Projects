package com.xworkz.lesson.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name="speaker_table")
public class SpeakerDto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name="SPEAKER_TYPE")
	private String type;
	@Column (name="USED_IN")
	private String usedin;
	@Column(name="USED_FOR")
	private String usedfor;
	@Id
	@Column(name="S_ID")
	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue(generator="auto")
	private int sid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public SpeakerDto() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsedin() {
		return usedin;
	}

	public void setUsedin(String usedin) {
		this.usedin = usedin;
	}

	public String getUsedfor() {
		return usedfor;
	}

	public void setUsedfor(String usedfor) {
		this.usedfor = usedfor;
	}

}

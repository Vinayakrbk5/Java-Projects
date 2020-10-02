package com.xworkz.lesson.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "cable_table")
public class CableDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CABLE_TYPE")
	private String type;
	@Column(name = "USED_FOR")
	private String usedfor;
	@Column(name = "CONTENT")
	private String content;
	@Id

	@GenericGenerator(name = "auto", strategy = "com.xworkz.genarator.CableIdGenarator")
	@GeneratedValue(generator = "auto")
//	@GeneratedValue(strategy=GenerationType.TABLE,generator="native")
//	@GenericGenerator(name="native",strategy="native")
////	parameters= {
////			@Parameter(name=CustomGenerator.INCREMENT_PARAM,value="50"),
////			@Parameter(name=CustomGenerator.VALUE_PREFIX_PARAMETER,value="Xworkz"),
////			@Parameter(name=CustomGenerator.NUMBER_FORMAT_PARAMETER,value="%05d")})
//	@Column(name="id",updatable=false,nullable=false)
	@Column(name = "id")
	private String cid;

	public CableDto() {
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsedfor() {
		return usedfor;
	}

	public void setUsedfor(String usedfor) {
		this.usedfor = usedfor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "CableDto [type=" + type + ", usedfor=" + usedfor + ", content=" + content + ", cid=" + cid + "]";
	}

}

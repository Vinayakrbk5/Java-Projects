package HashSetEx;

public class Trainee {
	private Integer traineeid;
	private String name;
	private String batch;
	public Trainee(Integer traineeid, String name, String batch) {
		super();
		this.traineeid = traineeid;
		this.name = name;
		this.batch = batch;
	}
	public Integer getTraineeid() {
		return traineeid;
	}
	public void setTraineeid(Integer traineeid) {
		this.traineeid = traineeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Trainee [traineeid=" + traineeid + ", name=" + name + ", batch=" + batch + "]";
	}
	
@Override
public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(!(obj instanceof Trainee))
		return false;
	if(obj==this)
		return true;
	    return this.traineeid.equals(((Trainee)obj).traineeid);
}
public int hashCode() {

	return traineeid;
}
}

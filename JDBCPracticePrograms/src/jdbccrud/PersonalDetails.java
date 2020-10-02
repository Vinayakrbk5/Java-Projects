package jdbccrud;

public interface PersonalDetails {
	
	public void displayAllRecords();
	public void updateTable(int id,String name,String city);
	public void insertRecord(int id,String name,String city);
	public void deleteRecord(int id);
	public void displaySelectedRecord(int id);

	

}
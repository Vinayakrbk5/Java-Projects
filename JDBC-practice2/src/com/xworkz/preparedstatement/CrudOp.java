package com.xworkz.preparedstatement;

import java.util.List;

public interface CrudOp {

public void createTable();
public void dropTable();
public void inertRecord(int id,String name,int age);
public void truncateTable();
public void updateNameById(String name,int id);
public void insertAll(List<Student> list);
public void deleteByAge(int age);

}

package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Position> positionList = new ArrayList<Position>();
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public HashMap<ExpenseType, Double> getEmployeeExpense() {
		HashMap<ExpenseType, Double> expenseMap = new HashMap<ExpenseType, Double>();
		
		for(Position position: positionList) {
			expenseMap = position.calculateExpenseForEmployee();
		}
		
		return expenseMap;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Position> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}
}

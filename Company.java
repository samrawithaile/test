package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Company {
	List<Department> departmentList = new ArrayList<Department>();
	
	public void addDepartment(Department department) {
		departmentList.add(department);
	}
	
	public HashMap<ExpenseType, Double> calculateExpenseForCompany() {
		HashMap<ExpenseType, Double> companyExpenseMap = new HashMap<ExpenseType, Double>();
		
		for(Department department: departmentList) {
			HashMap<ExpenseType, Double> departmentExpenseMap = department.calculateExpenseForDepartment();
			
			Iterator<Entry<ExpenseType, Double>> itr = departmentExpenseMap.entrySet().iterator();
			
			while(itr.hasNext()) {
				Entry<ExpenseType, Double> nextValue = itr.next();
				
//				System.out.println("Company ========" + nextValue.getValue());
				if(departmentExpenseMap.containsKey(nextValue.getKey())) {
					double amountForKey = nextValue.getValue();
					companyExpenseMap.put(nextValue.getKey(), nextValue.getValue() + amountForKey);
				}else {
					companyExpenseMap.put(nextValue.getKey(), nextValue.getValue());
				}
				
			}
		}
		
		return companyExpenseMap;
	}
	
	public ExpenseType getTopExpenseType() {
		HashMap<ExpenseType, Double> companyExpenseMap = calculateExpenseForCompany();
		
		Iterator<Entry<ExpenseType, Double>> itr = companyExpenseMap.entrySet().iterator();
		
		ExpenseType expenseType = null;
		double maxAmount = 0.0;
		
		while(itr.hasNext()) {
			Entry<ExpenseType, Double> nextValue = itr.next();
			System.out.println(nextValue.getValue());
			
			if(maxAmount < nextValue.getValue()) {
				maxAmount = nextValue.getValue();
				expenseType = nextValue.getKey();
			}
		}
		
		return expenseType;
	}
}

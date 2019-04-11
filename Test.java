package expense_claim.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		assertEquals(edu.mum.mpp.expenses.ItemCatagory.FOOD, edu.mum.mpp.expenses.ForTest.getTopExpense());
	}

}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Promotions p1;
	private Promotions p2;
	
	public ArrayList<Promotions> PromotionList;
	
	public C206_CaseStudyTest() {
		super();
	}
	

	@Before
	public void setUp() throws Exception {
		
		//set up data for promo
		p1 = new Promotions("Burger Promo", 10, "10/2/2020");
		p2 = new Promotions("Drinks Promo", 5, "10/2/2020");
		
		PromotionList= new ArrayList<Promotions>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@Test
	public void addPromotionsTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid promotions arraylist to add to", PromotionList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addPromotions(PromotionList, p1);
		assertEquals("Check that Promotion arraylist size is 1", 1, PromotionList.size());
		assertSame("Check that Promotion is added", p1, PromotionList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPromotions(PromotionList, p2);
		assertEquals("Check that Camcorder arraylist size is 2", 2, PromotionList.size());
		assertSame("Check that Camcorder is added", p2, PromotionList.get(1));
	}
	
	@Test
	public void retrieveAllPromotionsTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", PromotionList);
		
		//test if the list of Promotions retrieved from the C206 CASE STUDY is empty - boundary
		String allPromotion= C206_CaseStudy.retrieveAllPromotion(PromotionList);
		String testOutput = "";
		assertEquals("Check that ViewAllPromotion", testOutput, allPromotion);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addPromotions(PromotionList, p1);
		C206_CaseStudy.addPromotions(PromotionList, p2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, PromotionList.size());
		
		//test if the expected output string same as the list of Promotions retrieved from the C206 CASE STUDY
		allPromotion = C206_CaseStudy.retrieveAllPromotion(PromotionList);
		testOutput = String.format("%-10s %-30s %-10s\n","Burger Promo", 5, "10/2/2020");
		testOutput = String.format("%-10s %-30s %-10s\n","Drink Promo", 5, "11/2/2020");
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, allPromotion);
		
	}
	@Test
	public void deletePromotionsTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", PromotionList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 0 after deleting - normal
		C206_CaseStudy.deletePromotions(PromotionList);
		C206_CaseStudy.deletePromotions(PromotionList);
		assertEquals("Test that Camcorder arraylist size is 2", 0, PromotionList.size());
		
		
	}

}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Account customer1;
	private Account customer2;
	private Account stallStaff1;
	private Account stallStaff2;
	private Account canteenAdmin1;
	private Account canteenAdmin2;
	
	private String c="Customer";
	private String s="Stall Staff";
	private String ca="Canteen Admin";
	
	private ArrayList <Account> accountList;
	

	private Promotions p1;
	private Promotions p2;
	
	public ArrayList<Promotions> PromotionList;
	
	public C206_CaseStudyTest()
	{
		super();
	}


	@Before
	public void setUp() throws Exception {

		customer1=new Account("Liu","mk201920",c);
		customer2=new Account("Chua","C1u6",c);
		stallStaff1=new Account("Kwan yew Huat","KyH",s);
		stallStaff2=new Account("Wee Swee Keat","WSKSG225",s);
		canteenAdmin1=new Account("Koh Liam Cheng","$1n9ap0r3",ca);
		canteenAdmin2=new Account("Lee Ching Chiong","Kua1a 1umpur",ca);
		
		accountList= new ArrayList<Account>();

		
		//set up data for promo
		p1 = new Promotions("Burger Promo", 10, "10/2/2020");
		p2 = new Promotions("Drinks Promo", 5, "10/2/2020");
		
		PromotionList= new ArrayList<Promotions>();

	}

	@After
	public void addAccountTest()
	{
		assertNotNull("Test there is a valid account list to add to",accountList);
		
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 1?",1,accountList.size());
		assertSame("Test of account is added as the 1st item of the list",customer1,accountList.get(0));
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 2?",2,accountList.size());
		assertSame("Test of account is added as the 2nd item of the list",customer2,accountList.get(1));
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 3?",3,accountList.size());
		assertSame("Test of account is added as the 3rd item of the list",stallStaff1,accountList.get(2));
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 4?",4,accountList.size());
		assertSame("Test of account is added as the 4th item of the list",stallStaff2,accountList.get(3));
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 5?",2,accountList.size());
		assertSame("Test of account is added as the 5th item of the list",canteenAdmin1,accountList.get(4));
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 6?",2,accountList.size());
		assertSame("Test of account is added as the 1st item of the list",canteenAdmin2,accountList.get(5));
	}
	@After
	public void displayAccountTest()
	{
		assertNotNull("Test if account list is not null",accountList);
		String testing="";
		testing=String.format("%s %12s % 12s", "Liu","mk201920",c);
		testing=String.format("%s %12s % 12s", "Chua","C1u6",c);
		testing=String.format("%s %12s % 12s", "Kwan yew Huat","KyH",s);
		testing=String.format("%s %12s % 12s", "Wee Swee Keat","WSKSG225",s);
		testing=String.format("%s %12s % 12s", "Koh Liam Cheng","$1n9ap0r3",ca);
		testing=String.format("%s %12s % 12s", "Lee Ching Chiong","Kua1a 1umpur",ca);
		
		assertEquals("Test that the format is equals to the string",accountList,testing);
		
	}
	@After
	public void deleteAccountTest()
	{
		assertNotNull("Ensure that the account list is not null",accountList);
		C206_CaseStudy.deleteAccount(accountList);
		C206_CaseStudy.deleteAccount(accountList);
		C206_CaseStudy.deleteAccount(accountList);
		C206_CaseStudy.deleteAccount(accountList);
		C206_CaseStudy.deleteAccount(accountList);
		C206_CaseStudy.deleteAccount(accountList);
		assertEquals("Ensure that account list is 0",0,accountList.size());
	}
	@After
	public void tearDown() throws Exception {
		customer1=null;
		customer2=null;
		stallStaff1=null;
		stallStaff2=null;
		canteenAdmin1=null;
		canteenAdmin2=null;
		
		accountList=null;
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

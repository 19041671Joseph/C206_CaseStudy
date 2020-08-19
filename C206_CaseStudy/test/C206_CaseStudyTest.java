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
	}

	@After
	public void addAccountTest()
	{
		assertNotNull("Test there is a valid account list to add to",accountList);
		
		C206_CaseStudy.addAccount(accountList);
		assertEquals("Test if arrayList size is 1?",1,accountList.size());
		assertSame("Test of account is added as the 1st item of the list",customer1,accountList.get(0));
		C206_CaseStudy.addAccount(accountList);
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

}

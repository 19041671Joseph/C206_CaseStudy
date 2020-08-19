import java.util.ArrayList;
public class C206_CaseStudy {
	private static String c="Customer";
	private static String s="Stall Staff";
	private static String ca="Canteen Admin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Account> accountList=new ArrayList<>();

ArrayList<Promotions> PromotionList = new ArrayList<Promotions>();

	}

	
	public static void addAccount(ArrayList<Account> aList)
	{
		String username=Helper.readString("Enter new username >");
		String password=Helper.readString("Enter password >");
		String userRole=Helper.readString("Enter the user role > ");
		if (userRole.equalsIgnoreCase(c))
		{
		aList.add(new Account(username,password,userRole));
		System.out.println("New user role has been added!");
		}
		else if (userRole.equalsIgnoreCase(s))
		{
			aList.add(new Account(username,password,userRole));
			System.out.println("New user role has been added!");
		}
		else if (userRole.equalsIgnoreCase(ca))
		{
			aList.add(new Account(username,password,userRole));
			System.out.println("New user role has been added!");
		}
		else
		{
			System.out.println("User role is unidentified");
		}
		
	}
	public static void deleteAccount(ArrayList<Account> aList)
	{
		viewAllAccount(aList);
		String username=Helper.readString("Enter account to delete");
		boolean notFound=true;
		for (int i=0;i<aList.size();i++)
		{
			if (username.equalsIgnoreCase(aList.get(i).getUsername()))
			{
				aList.remove(i);
				System.out.println("User successfully removed");
				notFound=false;
				break;
			}
		}
		if (notFound==true)
		{
			System.out.println("User cannot be found");
		}
	}
	public static void viewAllAccount(ArrayList<Account> aList)
	{
		String display=String.format("%s %10s %10s", "Username","Password","Role");
		for (Account a:aList)
		{
			display+=a.toString();
		}
		System.out.println(display);
	}
	
	public static void viewAllPromotions(ArrayList<Promotions> PromotionList) {
		String output = String.format("%-10s %-30s %-10s\n", "Name", "Price",
				"Date");
		 output += retrieveAllPromotion(PromotionList);	
		System.out.println(output);
	}
	
	public static String retrieveAllPromotion(ArrayList<Promotions> PromotionList) {
		String output = "";

		for (int i = 0; i < PromotionList.size(); i++) {

			output += String.format("%-10s %-30s %-10s\n", PromotionList.get(i).getName(),
					PromotionList.get(i).getPrice(), PromotionList.get(i).getDate());			
		}
		return output;
	}
	public static void deletePromotions(ArrayList<Promotions> PromotionList) {
		
		String name = Helper.readString("Enter promotion name to remove > ");
		boolean isRemoved = false;
		
		for (int i = 0; i < PromotionList.size(); i++) {
			if(name.equalsIgnoreCase(PromotionList.get(i).getName()))
				isRemoved = true;
		}

		if (isRemoved == true) {
			System.out.println(name + " removed!");
		} else {
			System.out.println(name + " could not be found!");
		
		
	}
	}
	public static Promotions inputPromotion() {
		String name = Helper.readString("Enter name of promotion > ");
		int price = Helper.readInt("Enter price > ");
		String date = Helper.readString("Enter date > ");
		

		Promotions promo1= new Promotions(name, price, date);
		return promo1;
		
	}
public static void addPromotions(ArrayList<Promotions> PromotionList, Promotions promo1) {
		
		PromotionList.add(promo1);
		System.out.println("Promotion Added");
	}
	
}

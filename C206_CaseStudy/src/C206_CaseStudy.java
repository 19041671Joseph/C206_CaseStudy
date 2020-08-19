import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Account> accountList=new ArrayList<>();
ArrayList<Promotions> PromotionList = new ArrayList<Promotions>();
	}

	
	public void addAccount(ArrayList<Account> aList)
	{
		String username=Helper.readString("Enter new username >");
		String password=Helper.readString("Enter password >");
		String userRole=Helper.readString("Enter the user role > ");
		aList.add(new Account(username,password,userRole));
	}
	public void deleteAccount(ArrayList<Account> aList)
	{
		viewAllAccount(aList);
		String username=Helper.readString("Enter account to delete");
		for (int i=0;i<aList.size();i++)
		{
			if (username.equalsIgnoreCase(aList.get(i).getUsername()))
			{
				aList.remove(i);
				System.out.println("User successfully removed");
			}
		}
	}
	public void viewAllAccount(ArrayList<Account> aList)
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

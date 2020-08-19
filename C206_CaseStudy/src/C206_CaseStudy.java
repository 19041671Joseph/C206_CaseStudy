import java.util.ArrayList;
public class C206_CaseStudy {
	private static String c="Customer";
	private static String s="Stall Staff";
	private static String ca="Canteen Admin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Account> accountList=new ArrayList<>();

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
	public void deleteAccount(ArrayList<Account> aList)
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
	public void viewAllAccount(ArrayList<Account> aList)
	{
		String display=String.format("%s %10s %10s", "Username","Password","Role");
		for (Account a:aList)
		{
			display+=a.toString();
		}
		System.out.println(display);
	}
}

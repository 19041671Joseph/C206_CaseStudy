import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Account> accountList=new ArrayList<>();
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
}

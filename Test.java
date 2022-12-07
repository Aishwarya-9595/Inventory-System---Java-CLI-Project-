import java.util.Scanner;
import java.sql.*;
class Bank
{
	private String accno;
	private String name;
	public Long balance;
	
	Scanner KB=new Scanner(System.in);
	
	//method to open an account to buy product
	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=KB.next();
		System.out.print("Enter Name: ");
		name=KB.next();
		System.out.print("Enter Balance: ");
		balance=KB.nextLong();
	}

	//method to display account details of customer
	void showAccount()
	{ 
		System.out.println(accno+","+name+","+balance);
	}

	//method to pay amount of money
	void deposit()
	{
		long amt;
		System.out.println("Enter Amount of product that you buy : ");
		amt=KB.nextLong();
		balance=balance+amt;
	}
	
	//method to search an account number of customer
	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}

public class Test 
{

	public static void main(String[] args) 
   {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sys123");
			System.out.println(".................................WELCOME...........................\n\n --------   You are entered in Inventory Management System  --------");
			
			Scanner KB=new Scanner(System.in);
			
			Statement stmt=conn.createStatement();

			int ch,a,b;
			ResultSet rs=null;
			here:System.out.println("\nMain Menu\n1.Owner\n2.Customer\n3.Exit");
			System.out.println("\nUr Choice Please : ");
			b=KB.nextInt();   
			switch(b)
			{
			case 1 :
					do
					{
				            System.out.println("\nMain Menu\n1.Display All Products\n2.Delete Product\n3.Insert Product\n4.Exit");
				            System.out.println("\nUr Choice Please :");
				            ch=KB.nextInt();
				            switch(ch)
				            { 
				            case 1:
				            	String retrive="Select * from tbl_Product";
				            	rs=stmt.executeQuery(retrive);
				            	System.out.println("Prod_ID      Prod_Name           /  Price     /       Quantity");
				            	while(rs.next()) {
				            		String Id=rs.getString("Id");
				            		String Name=rs.getString("Name");
				            		String Price=rs.getString("Price");
				            		String Qty=rs.getString("Qty");
				            		System.out.println(Id+"\t"+Name+"\t\t\t"+Price+"\t\t"+Qty);
				            	}
				            	break;
				    //-------------------------------------------------------------------------------        	
				            case 2 :
				            	System.out.println("Enter Product id to delete :");
				            	a=KB.nextInt(); 
				            	if(a==1) {
				             	String q="delete from tbl_Product where Id='1'";
				             	stmt.executeUpdate(q);
				            	}
				            	else if(a==2)
				            	{
				            		String q="delete from tbl_Product where Id='2'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==3)
				            	{
				            		String q="delete from tbl_Product where Id='3'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==4)
				            	{
				            		String q="delete from tbl_Product where Id='4'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==5)
				            	{
				            		String q="delete from tbl_Product where Id='5'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==6)
				            	{
				            		String q="delete from tbl_Product where Id='6'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==7)
				            	{
				            		String q="delete from tbl_Product where Id='7'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==8)
				            	{
				            		String q="delete from tbl_Product where Id='8'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==9)
				            	{
				            		String q="delete from tbl_Product where Id='9'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==10)
				            	{
				            		String q="delete from tbl_Product where Id='10'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==18)
				            	{
				            		String q="delete from tbl_Product where Id='18'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==19)
				            	{
				            		String q="delete from tbl_Product where Id='19'";
					             	stmt.executeUpdate(q);
				            	}
				            	else if(a==20)
				            	{
				            		String q="delete from tbl_Product where Id='20'";
					             	stmt.executeUpdate(q);
				            	}
				            	else
				            		System.out.println("Wrong input......");
				            	System.out.println("Deleted.....");
				            	break;
				            case 3 :
				            	System.out.println("How many products you want to insert / max is 3 : ");
				            	int c=KB.nextInt();
				            	if(c==1)
				            	{
				            	String q="Insert into tbl_Product(Id,Name,Price,Qty)" + "values(18,'Redmi Note 6',12000,10)";
				            	stmt.executeUpdate(q);
				            	System.out.println("Inserted.....");
				            	}
				            	else if(c==2)
				            	{
				            		String q="Insert into tbl_Product(Id,Name,Price,Qty)" + "values(18,'Redmi Note 6',12000,10)";
					            	stmt.executeUpdate(q);
					            	String qr="Insert into tbl_Product(Id,Name,Price,Qty)" + "values(19,'Samsung 6',20000,10)";
					            	stmt.executeUpdate(qr);
					            	System.out.println("Inserted.....");
				            	}
				            	else if(c==3)
				            	{
				            		String q="Insert into tbl_Product(Id,Name,Price,Qty)" + "values(18,'Redmi Note 6',12000,10)";
					            	stmt.executeUpdate(q);
					            	String qry="Insert into tbl_Product(Id,N2ame,Price,Qty)" + "values(19,'Samsung 6',20000,10)";
					            	stmt.executeUpdate(qry);
					            	String qq="Insert into tbl_Product(Id,Name,Price,Qty)" + "values(20,'One Plus',36000,5)";
					            	stmt.executeUpdate(qq);
					            	System.out.println("Inserted.....");
				            	}
				            	else
				            	{
				            		System.out.println("Wrong input.....");
				            	}
				            	break;
				   //----------------------------------------------------------------------------------------
				            case 4:
				            	System.out.println("Back ....");
				            }
				
						}
						while(ch!=5);
					 break;
					 
			    case 2 :
			    	System.out.print("\nHow Many Customer U Want to Input : ");
					int n=KB.nextInt();
					Bank  C[]=new Bank[n];
					for(int i=0;i<C.length;i++)
					{   
						C[i]=new Bank();
						C[i].openAccount();
					}
					
					int ch1;
					do
					{
						System.out.println("\nMain Menu\n1.Display All\n2.Search By Account\n3.Pay Amount \n4.Exit");
						System.out.println("Ur Choice :");
						ch1=KB.nextInt();
						switch(ch1)
						{ 
							case 1:
								for(int i=0;i<C.length;i++)
								{
									C[i].showAccount();
								}
								break;

							case 2:
								System.out.print("Enter Account No U Want to Search...: ");
								String acn=KB.next();
								boolean found=false;
								for(int i=0;i<C.length;i++)
								{  
									found=C[i].search(acn);
									if(found)
									{
										break;
									}
								}
								if(!found)
								{
									System.out.println("Search Failed..Account Not Exist..");
								}
								break;

							case 3:
								System.out.print("Enter Account no to pay bill :  ");
								acn=KB.next();
								found=false;
								for(int i=0;i<C.length;i++)
								{  
									found=C[i].search(acn);
									if(found)
									{
										C[i].deposit();
										break;
									}
								}
								if(!found)
								{
									System.out.println("Search Failed..Account Not Exist..");
								}
								break;

							case 4:
								System.out.println("Good Bye..");
								break;
						}
					}
					while(ch1!=5);
				   break;
			        case 3 :
	            	System.out.println("Good Bye..");
	            
			}
			
			//String q="Create Table tbl_Product (Id number(20) primary key , Name varchar(20) not null ,Price number(30), Qty number)";
			//String q="Insert into tbl_Product(Id,Name,Price,Qty)" + "values(17,'Realme 6',13900,10)";
			
			//String q="Update product set pQty='12' where pQty='3'";
			//String q="delete from product where pId='4'";
			
			
			//stmt.executeUpdate(q);
			
			//System.out.println("Table created in database.............");
			//System.out.println("Data inserted successfully in database.............");
			//System.out.println("Data updated successfully in database.............");
			//c
			//System.out.println("Data retrived successfully in database.............");
			
		    /*String retrive="Select * from tbl_Product";
			rs=stmt.executeQuery(retrive);
			System.out.println("Prod_ID      Prod_Name           /  Price     /       Quantity");
			while(rs.next()) {
				String Id=rs.getString("Id");
				String Name=rs.getString("Name");
				String Price=rs.getString("Price");
				String Qty=rs.getString("Qty");
				System.out.println(Id+"\t"+Name+"\t\t\t"+Price+"\t\t"+Qty);
			} */
			
			conn.close();
		    }
	        catch(Exception e) {
        	System.out.println(e);
            }
    }

	private static void delay(int i) {
		// TODO Auto-generated method stub
		
	}

}


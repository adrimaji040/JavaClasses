import java.util.ArrayList;
import beans.Client;
import beans.ClientTax;
import java.util.Scanner;

public class MainApplication
{
  public static void main(String[] args)
  {

	  
   ArrayList<ClientTax> ClTaxList = new ArrayList<ClientTax>();
   ArrayList<Client> clientList = new ArrayList<Client>();
   Scanner sc = new Scanner(System.in);
   Client c1;
   int count;

   if(args.length != 2)
   {
   System.out.printf("usage java %s number yourname","MainApplication.java");
   System.exit(1);
   }

   count = Integer.parseInt(args[0]);
   System.out.printf("Hi %s , I'll create %d Clients.", args[1], count);

   for  (int i = 1; i <= count; i++)
   {
    System.out.println("Type Id, fullName, payment");
    int var_id = sc.nextInt();
    sc.nextLine();

    String var_fullName = sc.nextLine();
    double var_payment = sc.nextDouble();


    //Intantiate Cliente to Asign values
    c1 = new Client(var_id, var_fullName, var_payment);

    //Add each Client to clientList
    clientList.add(c1);
   }

   //print clientList
   for(Client cl : clientList)
   {
    System.out.printf("%d, %s, %6.2f %n", cl.getId(), cl.getFullName(), cl.getPayment());

   }

   //send clientsList to Utiltaxes class
   ClTaxList = UtilTaxes.ClientTaxList(clientList);

   //Read and Print ClientTaxList
   for(ClientTax ct : ClTaxList)
   {
    System.out.printf("Id: %d PayDate: %S  TaxValue:%6.2f", ct.getId(), ct.getPayDate(), ct.getTaxValue());	   

   }

  }
}

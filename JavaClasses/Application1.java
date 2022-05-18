import java.util.ArrayList;
import java.util.Scanner;
import beans.Client;
import beans.ClientTaxes;


public class Application1
{

  public static void main(String[] args)
  {

    ArrayList<ClientTaxes> taxClientList = new ArrayList<ClientTaxes>(); 
    ArrayList<Client> clientList = new ArrayList<Client>();
    Scanner sc = new Scanner(System.in);
    Client c1;
    
    int count;

    if (args.length != 2)
    {
     System.out.printf("Usage java %s 3 yourname", "Applicaion1 ");
     System.exit(1);
    }
    count = Integer.parseInt(args[0]);
    System.out.printf("Hello %s, I'll create %d Clientes \n", args[1], count);
   
    for(int i = 1; i <= count; i++)
    {
     System.out.println("Type Client Id, FullName, Payment: ");
     int var_id = sc.nextInt();
     sc.nextLine();

     String var_fullName = sc.nextLine();
     

     double var_payment = sc.nextDouble();
    
     c1 = new Client(var_id,var_fullName,var_payment);
     clientList.add(c1);
    }
    
    //Print clientList
    System.out.println("Client List");
    for(int j = 0; j < clientList.size(); j++)
    {
     System.out.printf("%d %s %3.2f %n", clientList.get(j).getId(), clientList.get(j).getFullName(), clientList.get(j).getPayment());
    }

    //pass clientList to Util.method
    taxClientList  = Util.taxCalculator(clientList);

    //print Taxes

    System.out.println("*********************************");
    System.out.println("Taxes");

    for(ClientTaxes ct : taxClientList)
    {
     System.out.printf("id: %d, PaymentDate: %s, Payment: %6.2f, taxValue %6.2f  %n", ct.getClientId(),  ct.getPaymentDate(), ct.getPayment(), ct.getTaxValue());

    }



  }

}


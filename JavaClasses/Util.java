import beans.ClientTaxes;
import java.util.ArrayList;
import beans.Client;


public class Util
{
 public static ArrayList<ClientTaxes> taxCalculator(ArrayList<Client> clientList)
 {

  ArrayList<ClientTaxes> taxClientList = new ArrayList<ClientTaxes>();

  if (clientList.size() > 0)
  {
   ClientTaxes cliTax;

   for(int i = 0; i < clientList.size(); i++)
   {
    //Instantiate a new ClientTaxes Object
    cliTax = new ClientTaxes();

    //Assign Known Object values
     cliTax.setClientId(clientList.get(i).getId());
     cliTax.setPayment(clientList.get(i).getPayment());
     cliTax.setPaymentDate("2022/05/11");
        
     cliTax.setTaxValue(taxCalValue(clientList.get(i).getPayment()));

     taxClientList.add(cliTax);
	     
   }
	  

  }else
  {
   System.out.println("clientList is empty......");
  }
  return taxClientList;
 }



  public static double taxCalValue(double v_payment)
  {

    if (v_payment > 0 && v_payment <= 1000)
    {
     return v_payment * 0.10;  
   
    }else if (v_payment > 1000 && v_payment <= 10000)
    {
     return v_payment * 0.15;
    }else if (v_payment > 10000)
    {
     return v_payment * 0.20;	    
    }
     return 0;
    }
  }
    


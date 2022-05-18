import java.util.ArrayList;
import beans.Client;
import beans.ClientTax;


public class UtilTaxes
{

 //method create ArrayList of the class ClientTax
 public static ArrayList<ClientTax> ClientTaxList (ArrayList<Client> clientList)
 {
  
   ArrayList<ClientTax> ClientTaxCalcula = new ArrayList<ClientTax>();

   if (clientList.size() > 0 )
   {	   
     ClientTax Ctx;
    
     for (Client ct : clientList)
     {
	 Ctx = new ClientTax();
	 Ctx.setId(ct.getId());
	 Ctx.setPayDate("2022/05/19");
	 Ctx.setTaxValue(TaxCalculation(ct.getPayment()));
	 ClientTaxCalcula.add(Ctx);
     }

     }else{
     System.out.println("clientList is empty......");	     
     }
     return ClientTaxCalcula; 
   }
 


     //Method Calculate taxes

     public static double TaxCalculation (double var_payment)
     {
       if (var_payment > 0 && var_payment <= 100)
       {
         return var_payment * 0.10;
       } else if (var_payment > 100 && var_payment <= 200)
       {
          return var_payment * 0.15;
       }else if (var_payment > 200)
       {
         return var_payment * 0.20;
       }
       return 0;
     }
  
 }
 


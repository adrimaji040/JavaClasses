package beans;

public class ClientTaxes
{
   int  clientId;
   String paymentDate;
   double payment;
   double taxValue;

   public  ClientTaxes()
   {
   }

   public ClientTaxes(int clientId, String paymentDate, double payment, double taxValue)
   {

    this.clientId = clientId;
    this.paymentDate = paymentDate;
    this.payment = payment;
    this.taxValue = taxValue;

   }

   //sets

   public void setClientId(int clientId)
   {
    this.clientId = clientId;	   
   }

   public void setPaymentDate(String paymentDate)
   {
    this.paymentDate = paymentDate;	   
   }

   public void setPayment(double payment)
   {
     this.payment = payment;	   
   }

   public void setTaxValue(double taxValue)
   {
    this.taxValue = taxValue;	   
   }

   //gets
   public int getClientId()
   {
    return this.clientId;	   
   }

   public String getPaymentDate()
   {
    return this.paymentDate;	   
   }

   public double getPayment()
   {
    return this.payment;	   
   }

   public double getTaxValue()
   {
    return taxValue;	   
   }
}



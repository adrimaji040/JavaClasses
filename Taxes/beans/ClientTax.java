package beans;

public class ClientTax
{ int id;
  String payDate;
  double taxValue;


  public ClientTax(){}

  public ClientTax(int id, String PayDate, double taxValue)
  {
   this.id = id;
   this.payDate = PayDate;
   this.taxValue = taxValue; 
  }

  //sets

  public void setId(int id)
  {
   this.id = id;	  
  }

  public void setPayDate(String PayDate)
  {
   this.payDate = PayDate;	  
  }

  public void setTaxValue(double taxValue)
  {
   this.taxValue = taxValue;	  
  }

  //gets
  public int getId()
  {
  return this.id; 	  
  }

  public String getPayDate()
  {
   return this.payDate;	  
  }

  public double getTaxValue()
  {
   return this.taxValue;	  
  }

}


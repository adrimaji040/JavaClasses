package beans;

public class Client
{

  int id;
  String fullName;
  double payment;


  public Client()
  {
  }

  public Client(int Id, String fullName, double payment)
  {
    this.id = Id;
    this.fullName = fullName;
    this.payment = payment;
  }

  public void setId(int id)
  {
   this.id = id;	  
  }

  public void setFullName(String fullName)
  {
   this.fullName = fullName;
  }

  public void setPayment(double payment)
  {
   this.payment = payment;
  }


  public int getId()
  {
   return this.id;
  }


  public String getFullName()
  {
   return this.fullName;	  
  }

  public double getPayment()
  {
   return this.payment;

  }
}


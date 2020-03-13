package cognizant;

class Emp
{
	int number; 
	private String name, designation, address; 
	private long phone_number;
	
	public int getNumber()
	{
		return number;
	}
	public String getName()
	{
		return name;
	}
	public String getDesignation()
	{
		return designation;
	}
	public String getAddress()
	{
		return address;
	}
	public long getPhone()
	{
		return phone_number;
	}
	
	
	
	
	public void setNumber(int number)
	{
		this.number=number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setPhone(int phone_number)
	{
		this.phone_number=phone_number;
	}
}

class Salary extends Emp
{
	private float basic_pay, da, hra,gross_pay, pf, income_tax ,net_pay;
	
	float Calculate()
	{
		da=0.30*basic_pay;
		hra=12.5*basic_pay;
		pf=0.12*basic_pay;
		gross_pay=basic_pay+da+hra;
		net_pay=gross_pay+pf
		
	}

	public float getBasic_pay() {
		return basic_pay;
	}

	public void setBasic_pay(float basic_pay) {
		this.basic_pay = basic_pay;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public float getGross_pay() {
		return gross_pay;
	}

	public void setGross_pay(float gross_pay) {
		this.gross_pay = gross_pay;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public float getIncome_tax() {
		return income_tax;
	}

	public void setIncome_tax(float income_tax) {
		this.income_tax = income_tax;
	}

	public float getNet_pay() {
		return net_pay;
	}

	public void setNet_pay(float net_pay) {
		this.net_pay = net_pay;
	}
	
}






public class New {
	public static void main (String[] args)
	{
		Emp e=new Emp();
		e.setNumber(5);
		e.setName("Harshita");
		e.setDesignation("xyz");
		e.setAddress("Bajarng nagar");
		e.setPhone(483039484);
		int number=e.getNumber();
		System.out.println(number);
		String designation=e.getDesignation();
		System.out.println(designation);
		String address=e.getName();
		System.out.println(address);
		long phone_number=e.getPhone();
		System.out.println(number);
		
		
		Salary s=new Salary();
		s.setBasic_pay(50000);
		s.setDa(500);
		s.setHra(100);
		s.setGross_pay(60000);
		s.setPf(596);
		s.setIncome_tax(4830);
		s.Net_pay(48);
		int number=e.getNumber();
		System.out.println(number);
		String designation=e.getDesignation();
		System.out.println(designation);
		String address=e.getName();
		System.out.println(address);
		long phone_number=e.getPhone();
		System.out.println(number);
		
	}

}

package week1.day5_Data_Encapsulation_and_Static_Keyword.display_item_types;

public class itemtype {
    private String name;
		private Double costPerDay;
		private Double deposit;
	
	public void setName(String name){
		this.name = name;
	}
	public void setCostPerDay(Double costPerDay){
		this.costPerDay = costPerDay;
	}
	
	public void setDeposit(Double deposit){
		this.deposit = deposit;
	}
	public String getName(){
		return name;
	}
	public Double getCostPerDay(){
		return costPerDay;
	}

	public Double getDeposit(){
		return deposit;
	}
	
	
	
	public void display(){

		System.out.println("Item type details");
		System.out.println("Name : "+getName());
		System.out.println("CostPerDay : "+ String.format("%.2f",getCostPerDay()));
		System.out.println("Deposit : "+String.format("%.2f",getDeposit()));

	
	
	}
}

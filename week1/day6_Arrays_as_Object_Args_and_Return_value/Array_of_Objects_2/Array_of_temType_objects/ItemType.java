package week1.day6_Arrays_as_Object_Args_and_Return_value.Array_of_Objects_2.Array_of_temType_objects;

public class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType() {}

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
}

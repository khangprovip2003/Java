package dto;

public class Colony extends Organization {
    private String place;

    public Colony() {
        super();
        this.place="";
    }
    public Colony(String size, String place) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void communicateByTool(){
        System.out.println("the colony communicate by sound");
    }
    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring ");
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "the colony size is " + getSize() +
                ",the value size is " + this.place;
    }
}
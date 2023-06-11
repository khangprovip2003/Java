package dto;

public class BeeColony extends Colony implements Role  {
    private String type;

    public BeeColony() {
        super();
        this.type = "";
    }

    public BeeColony(int size, String place, String type) {
        super(String.valueOf(size), place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony's type is " + this.type +
                ", size is about " + getSize()  + ", and the place is "
                + getPlace();
    }
    @Override
    public void creatWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
}

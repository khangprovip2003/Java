
//}public class Brick {
//	protected String place;
//	protected int price;
//	public Brick() {
//		super();
//	}
//	public Brick(String place, int price) {
//		super();
//		this.place = place;
//		this.price = price;
//	}
//	public String getPlace() {
//		return place;
//	}
//	public void setPlace(String place) {
//		this.place = place;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return place + ", " +price;
//	}
//	
//

public class Brick{
    private String place;
    private int price ;
    public Brick(String place, int price) {
        this.place = place;
        this.price = price;
    }
    public Brick() {
    }

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return   this.place + "," + this.price ;
    }
    
    
    
}
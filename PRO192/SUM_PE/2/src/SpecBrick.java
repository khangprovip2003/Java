//
//public class SpecBrick extends Brick {
//	protected int color;
//
//	public SpecBrick() {
//		super();
//	}
//
//	public SpecBrick(String place, int price,int color) {
//		super(place, price);
//		this.color = color;
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString()+", "+color;
//	}
//	public void setData() {
//		super.setPlace(place.substring(0,2)+"BCA"+place.substring(2));
//	}
//	public int getValue() {
//		if (color>7) return price +9;
//		else {
//			return price + 6;
//		}
//	}
//}

// my self
public class SpecBrick extends Brick{
    private int color;

    public SpecBrick() {
    }

    public SpecBrick( String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    public void setData(){
        setPlace(getPlace().substring(0, 2) +"BCA"+ getPlace().substring(2,getPlace().length()));
    }
    public int getValue(){
        if(this.color > 7){
            return this.getPrice() + 9;
        }
        return getPrice() +6;
    }

    @Override
    public String toString() {
        return super.toString()+"," + this.color ;
    }
    
    
}

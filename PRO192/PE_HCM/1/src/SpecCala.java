/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khang
 */
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + color ;
    }
    public void setData(){
        setOwner(getOwner().substring(0, 1).toUpperCase() + getOwner().substring(1).toLowerCase());
    }
    public int getValue(){
        if (this.color % 2 == 0) {
            return getPrice() + 1;
        }
        return getPrice() * 2;
    }
}

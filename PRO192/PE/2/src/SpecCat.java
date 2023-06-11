/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khang
 */
public class SpecCat extends Cat{
    private int nose;

    public SpecCat() {
    }
    public SpecCat( String area, int leg, int nose) {
        super(area, leg);
        this.nose = nose;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.nose ;
    }
    public void setData(){
       setArea(getArea().subSequence(0,getArea().length() -  1) + "BC"+ getArea().substring(getArea().length() - 1  ));
    }
    public int getValue(){
        if(getArea().substring(1, 2).contains("X") == true){
            return this.nose + 9;
        } 
        return this.nose + 6;
    }
    
}

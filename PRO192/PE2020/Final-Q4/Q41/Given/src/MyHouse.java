/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class MyHouse implements House {

    public int price;
    public String address;

    public MyHouse(int price, String address) {
        this.price = price;
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public double getPricetoUSD() {
        double b = ((double) getPrice() / 23000);
        return b;

    }

    @Override
    public String getCode() {
    int str = getAddress().length()
        if(getAddress().matches("\\d+")){
            return getAddress().substring(0, 3);
        }
           return getAddress().substring(str - 3, str );
    }

}


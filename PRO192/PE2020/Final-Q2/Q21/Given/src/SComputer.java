

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class SComputer extends Computer {

    public String series;

    public SComputer(String series) {
        this.series = series;
    }

    public SComputer(String series, String name, String color, double price) {
        super(name, color, price);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public double getSalePrice() {
        boolean result = getSeries().endsWith("A");
        if (result) {
            return getPrice() - (0.05 * getPrice());
        } else {
            return getPrice() - (0.01 * getPrice());
        }
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return super.name + "\t" + super.color + "\t" + super.price + "\t" + this.series;
    }

}

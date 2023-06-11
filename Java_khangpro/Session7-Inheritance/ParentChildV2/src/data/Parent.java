package data;

public class Parent {
    protected String assetOne; // ngôi nhà của Cha va Con
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne='" + assetOne + '\'' + ", assetTwo='" + assetTwo + '\'' + '}';
    }
    public void showProfile(){
        System.out.println("PARENT > asset1: " + assetOne + "; asset2: " + assetTwo);
    }


}

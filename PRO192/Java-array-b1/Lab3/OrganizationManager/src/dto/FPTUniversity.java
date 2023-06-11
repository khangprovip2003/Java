package dto;

public class FPTUniversity extends University implements Role {
        private String address;

    public FPTUniversity() {
        super();
        this.address = "";
    }
    public FPTUniversity(int size, String name, String address) {
        super(String.valueOf(size), name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

@Override
    public String toString() {
        return "FPTU has four campuses in Hanoi, HCM, DaNang, CanTho, and QuyNhon ";
    }
    @Override
    public void creatWorker(){
        System.out.println("FPTU provides human resources");
    }
    public void sayHi(){
        System.out.println("hi");
    }
}
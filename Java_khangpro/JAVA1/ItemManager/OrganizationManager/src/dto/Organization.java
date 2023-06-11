package dto;

public abstract class Organization {
    private int size;

    public Organization() {
        this.size = 0;
    }

    public Organization(String size) {
        this.size = Integer.parseInt(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public abstract void communicateByTool();

    @Override
    public String toString() {
        return "The organization size is " + this.size;
    }
}

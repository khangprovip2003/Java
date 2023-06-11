package data;

// là khái niệm chung cho mọi loại hình nào đó: V,TR,TG,HBH,...
public abstract  class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;

        // cạnh a,b,c radius bk, rất vô duyên
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner='" + owner + '\'' + ", color='" + color + '\'' + ", borderColor='" + borderColor + '\'' + '}';
    }

    //Hình nói chung sẽ có S,P, vấn đề là tính thế nào?
    // không thể nói cụ thể lúc này
    // S P là 1 khái niệm đề cập đặc tính và hành vi của hình học nói chung
    // nó là chung chung , không cụ thể
    // Cụ thể để mỗi hình TR , V , CM , HBH sẽ lo
    // nói về ý tưởng -> abstract
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();




}

package studentmanager;

public class Student {
    private String code;
    private String name;
    private int mark;

    public Student() {}

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return code + ", " + name.toUpperCase() + ", " + mark;
    }
}

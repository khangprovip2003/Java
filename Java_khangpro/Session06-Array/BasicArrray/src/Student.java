public class Student {
    private String id ;
    public String name ;
    private double yob;
    private double gpa ;

    public Student(String id, String name, double yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYob() {
        return yob;
    }

    public void setYob(double yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", yob=" + yob + ", gpa=" + gpa + '}';
    }
    public void showProfile (){
        System.out.printf("|%-8s|%-25s|%4.1f|%4.1f|\n",id,name,yob,gpa);
    }

}

import java.util.Arrays;

public class Student {
private int id;
private String name;
private String gender;
private double []diem;
private static int nextId = 1;

    public Student( String name, String gender, double[] diem) {
        this.id = nextId;
        this.name = name;
        this.gender = gender;
        this.diem = diem;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", diem=" + Arrays.toString(diem) +
                '}';
    }

    public double getTinhDiemTB() {
        double sum = 0;
        for (double d : diem) {
            sum += d;
        }
        return sum/3;
    }



}
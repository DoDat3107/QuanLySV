import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentManager {
    private Student[] listStudent;
    private int size;

    public StudentManager() {
        size = 0;
        this.listStudent = new Student[100];
    }


    public ArrayList<Student> getStudentsByName(String name) {
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if(listStudent[i].getName().contains(name.toLowerCase())) {
                students.add(listStudent[i]);
            }
        }
        return students;
    }

    public double getDiemTBclas() {
        double sumDTB = 0;
        for (int i = 0; i < size; i++) {
            sumDTB = sumDTB + listStudent[i].getTinhDiemTB();
        }
        return sumDTB / size;
    }

    public double getMaxDTB() {
        double MaxDTB = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            if (this.listStudent[i].getTinhDiemTB() > MaxDTB) {
                MaxDTB = this.listStudent[i].getTinhDiemTB();
            }
        }
        return MaxDTB;
    }

    public void add(Student student) {
        this.listStudent[size] = student;
        size++;
    }

    public Student FindStudentById(int id) {
        for (Student student : listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public int FindByid(int id) {
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void Delete(int id) {
        int index = FindByid(id);
        for (int i = index; i < size; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        size--;
    }

    public void edit(int id, Student newStudent) {
        int index = FindByid(id);
        this.listStudent[index] = newStudent;
    }


    public Student[] getStudents() {
        return this.listStudent;
    }

    public int getSize() {
        return this.size;
    }

}
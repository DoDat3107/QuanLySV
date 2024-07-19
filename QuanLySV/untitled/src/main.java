public class main {
    public static void main(String[] args) {
        //add
        StudentManager clas = new StudentManager();
        double []diem = {7,6,9};
        double []diem1 = {8,7,9};
        double []diem2 = {9,8,9};

        Student SV1 = new Student("dat","nam",diem);
        Student SV2 = new Student("nguyen","nu",diem1);
        Student SV3 = new Student("nguyen","nu",diem2);
        clas.add(SV3);
        clas.add(SV1);
        clas.add(SV2);
        System.out.println("Danh sach sinh vien : ");
        for(int i = 0; i < clas.getSize(); i++){
            System.out.println(clas.getStudents()[i]);
        }

        System.out.println("Sinh vien can tim : ");
        //timkiem
        System.out.println(clas.FindStudentById(1));
        //xoa
        clas.Delete(2);
        System.out.println("Danh sach sinh vien sau xoa la : ");
        for(int i = 0; i < clas.getSize(); i++){
            System.out.println(clas.getStudents()[i]);
        }

        // sua
        double []diem4 = {9,8,9};
        Student SV4 = new Student("hung","nam",diem4);
        System.out.println("Danh sach sinh vien sau sua la : ");
        for(int i = 0; i < clas.getSize(); i++){
            System.out.println(clas.getStudents()[i]);
        }
        clas.edit(3,SV4);

        // tong diem tb cua lop
        System.out.println("diem trung binh cua lop la : "+ clas.getDiemTBclas());
        // diem trung binh cao nhat
        System.out.println("diem trung binh cao nhat la : "+ clas.getMaxDTB());
        //tim kiem theo ten gan dung
        System.out.println("danh sach sinh vien co chu h:");
        for (Student student1 : clas.getStudentsByName("h")) {
            System.out.println(student1);
        }



    }



}

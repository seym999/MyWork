package homework;

public class Runner {
    public static void main(String[] args) {

        Teacher myTeacher = new Teacher();
        System.out.println("myTeacher isim= " + myTeacher.isim);
        System.out.println("myTeacher soyIsim = " + myTeacher.soyIsim);
        System.out.println("myTeacher yas = " + myTeacher.yas);
        System.out.println("myTeacher brans = " + myTeacher.brans);
        myTeacher.teach1();
        myTeacher.teach2();


    }
}

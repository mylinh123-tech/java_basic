package StaticJava;

public class Student {

        int rollno;
        String name;
        static String college = "Bưu Chính Viễn Thông";


        static void change() {
            // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
            college = "Đại Học Công Nghệ";
        }


        Student ( int r, String n) {
            rollno = r;
            name = n;
        }


        void display() {
            System.out.println(rollno + " - " + name + " - " + college);
        }


        public static void main(String args[]) {
            Student.change();
            Student s1 = new Student(111, "Thông");
            Student s2 = new Student(222, "Minh");
            Student s3 = new Student(333, "Anh");

            s1.display();
            s2.display();
            s3.display();
        }
    }



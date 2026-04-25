package Variable;

public class LocalVariable {
    public String subject = "Automation testing"; //Instance variable
    public static int age = 23; // static variable

    public void Get_info(){
        String name ="My Linh"; // Local variabe chi su dung trong ham vd: Get_info
        System.out.println(name +" is learning " + subject);

    }

    public static void main(String[] args) {
        System.out.println(age); // goi truc tiep bien static
        System.out.println(LocalVariable.age); // goi thong qua lop class

        LocalVariable demo_class = new LocalVariable();
        demo_class.Get_info();
        System.out.println(demo_class.subject); // goi bien instance thong qia doi tuong class
    }

}

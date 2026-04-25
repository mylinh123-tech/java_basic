package StaticJava;

public class Bien_Static {
    public String email  = "admin@example.com";
    public static String password  = "***Lian123";
    public static void main(String[] args) {
        //goi bien 0 co static
        Bien_Static object = new Bien_Static();
        System.out.println(object.email);

        //goi bien static
        System.out.println(password); //goi truc tiep
        System.out.println(Bien_Static.password); //goi qua ten Class

        //goi static cua Class khac
        System.out.println(ConfigData.browser);

    }
}

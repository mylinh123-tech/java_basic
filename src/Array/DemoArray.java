package Array;

public class DemoArray {
    public static void main(String[] args) {
        //Khai bao mang 1 chieu
        //Khai bao kieu so nguuyen
        int mangSoNguyen[]= new int[3];
        //Them gia tri vao mang
        mangSoNguyen[0] =5;
        mangSoNguyen[1] =10;
        mangSoNguyen[2] =15;
       for (int i = 0; i < mangSoNguyen.length; i++){
           System.out.println(mangSoNguyen[i]);
       }
        System.out.println("========================");
       // Vua khai bao vua khoi tao gia tri cho mang
        String String_input[] = new String[]{"Linh","Phong","Nam","My","Ly"};
        for (int i = 0; i < String_input.length; i++){
            System.out.println(String_input[i]);
        }
        System.out.println("========================");

        for (int i : mangSoNguyen){
            System.out.println(i);
        }
        System.out.println("========================");

        for (String str : String_input){
            System.out.println(str);
        }

    }
}

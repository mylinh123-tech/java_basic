package VongLapFor;

public class ForBasic {
    public static void main(String[] args) {
//        for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {
//            // Khối lệnh được thực thi
//        }

        for ( int i = 1; i <= 10; i+=2){
            System.out.print(i+" ");

        };
        System.out.println();
        // Duyet Mang hoac Arraylist de kiem tra tung phan tu trong mang
        int array_int []= new int[]{17,22,13,4,5,6,7};
        for (int i = 0; i < array_int.length; i ++){
            System.out.println(array_int[i]);

        }
    }
}

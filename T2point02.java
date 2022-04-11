public class MyClass {
    public static void main(String args[]) {
       String[][] data_mahasiswas = {
            {"Adi","Mika","Budi","Bunga"},
            {"127647","129883","120495","123489"},
            {"Teknik Informatika","Sistem Komputer","Sistem Komputer","Teknik Informatika"}
        };
        
        System.out.println(data_mahasiswas[0][0]+"\t"+data_mahasiswas[1][0]+"\t"+data_mahasiswas[2][0]);
        System.out.println(data_mahasiswas[0][1]+"\t"+data_mahasiswas[1][1]+"\t"+data_mahasiswas[2][1]);
        System.out.println(data_mahasiswas[0][2]+"\t"+data_mahasiswas[1][2]+"\t"+data_mahasiswas[2][2]);
        System.out.println(data_mahasiswas[0][3]+"\t"+data_mahasiswas[1][3]+"\t"+data_mahasiswas[2][3]);
    }
}
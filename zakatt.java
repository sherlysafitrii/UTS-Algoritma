import java.util.ArrayList;
public class zakatt {
    public static void main(String[] args) throws Exception {
        ArrayList<zakat> listZakat = new ArrayList<>();
        String nama, alamat, jenisZakat, jawaban ="";
        int jmlhberas = 0;
        double jumlhuang = 0;

        do{
            System.out.print("masukkan nama : ");
            nama = System.console().readLine();
            System.out.print("masukkan alamat: ");
            alamat = System.console().readLine();
            System.out.print("jenis zakat(fitrah/sedekah): ");
            jenisZakat = System.console().readLine();

            if(jenisZakat.equalsIgnoreCase("fitrah")){
                System.out.println("jumlah beras (kg): ");
                jmlhberas = Integer.parseInt(System.console().readLine());
            }
            else if (jenisZakat.equalsIgnoreCase("sedekah")){
                System.out.println("jumlah uang (Rp): ");
                jumlhuang = Integer.parseInt(System.console().readLine());
            }
            else{
                System.out.println("jenis zakat tidak valid!");
                continue;
            }
            zakat Zakat = new zakat(nama, alamat, jenisZakat, jmlhberas, jumlhuang);
            listZakat.add(Zakat);

            System.out.println("tambah data?(y/n)");
            jawaban = System.console().readLine();
        }
        while(jawaban.equalsIgnoreCase("y"));

        System.out.println(" data zakat");
        System.out.println("=======================================================================");
        System.out.println("No.\tNama\t\tAlamat\t\tJenis\tJumlah");
        System.out.println("=======================================================================");

        for(int i=0;i < listZakat.size();i++){
            // System.out.println(i+1 +"\t");
            // System.out.println(listZakat.get(i).nama+"\t");
            // System.out.println(listZakat.get(i).alamat+"\t"+"\t"+"\t");
            // System.out.println(listZakat.get(i).jenisZakat+"\t");

            System.out.println((i+1)+"\t"+listZakat.get(i).nama+"\t"+"\t"+listZakat.get(i).alamat+"\t"+"\t"+listZakat.get(i).jenisZakat+"\t");


            if(listZakat.get(i).jenisZakat.equalsIgnoreCase("fitrah")){
                System.out.println(listZakat.get(i).jmlhberas+"kg");
            }
            else{
                System.out.println("Rp" + listZakat.get(i).jumlhuang);
            }
        }
    }
}

class zakat {
    public String nama;
    public String alamat;
    public String jenisZakat;
    public int jmlhberas;
    public double jumlhuang;

    public zakat(String nama, String alamat, String jenisZakat, int jmlhberas, double jumlhuang){
        this.nama = nama;
        this.alamat = alamat;
        this.jenisZakat = jenisZakat;
        this.jmlhberas = jmlhberas;
        this.jumlhuang = jumlhuang;

    }

}

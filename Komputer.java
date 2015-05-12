/**
 * Created by user on 5/12/2015.
 */
public class Komputer {
    protected int Prosesor;
    protected int Memori;
    protected int Storage;

    public Komputer(){
        Prosesor = 500;
        System.out.println("Kecepatan Prosesor Komputer = "+Prosesor);
    }
}
    class Notebook08 extends Komputer {
        public int Kapasitas_Baterai;
        public Notebook08(int dimas,int dwi,int sulistiyo, int sari){
            Prosesor = dimas;
            Memori = dwi;
            Storage = sulistiyo;
            Kapasitas_Baterai = sari;
        }
        public void CetakSpesifikasi(){
            System.out.println("Kecepatan Prosesor Notebook = " + Prosesor);
            System.out.println("Kapasitas Memori = " + Memori);
            System.out.println("Kapasitas Storage = " + Storage);
            System.out.println("Kapasitas Baterai = " + Kapasitas_Baterai+"\n");
        }
        public void dioverclock(int dimas){
        Prosesor = dimas;
        System.out.println("Notebook dioverclock dengan kecepatan Prosesor = " + Prosesor);
    }
}
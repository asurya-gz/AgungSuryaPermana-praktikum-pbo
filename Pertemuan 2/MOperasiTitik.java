// Nama          : Agung Surya Permana
// NIM           : 24060121140167
// tanggal      : 7 Maret 2023
// Deskripsi    : MOperasi titik, memanggil class Operasi Titik

class MOperasiTitik {
    public static void main(String args[]) {
        Titik t1 = new Titik(5.0, 3.0);
        OperasiTitik op = new OperasiTitik();
        System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        op.refleksiX(t1);
        System.out.println("Titik Setelah Refeleksi Sumbu X : Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        
        op.refleksiY(t1);
        System.out.println("Titik Setelah Refeleksi Sumbu Y : Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
    }
}
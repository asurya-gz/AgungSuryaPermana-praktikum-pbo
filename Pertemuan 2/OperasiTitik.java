// Nama          : Agung Surya Permana
// NIM           : 24060121140167
// tanggal      : 7 Maret 2023
// Deskripsi    : Kelas Operasi titik yang di dalam nya terdapat method untuk refleksi

class OperasiTitik{
    private void refleksiSumbuX(Titik titik) {
        titik.setOrdinat(-titik.getOrdinat());
    }

    private void refleksiSumbuY(Titik titik) {
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik refleksiX(Titik titik) {
        refleksiSumbuX(titik);
        return titik;
    }
    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
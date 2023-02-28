// Nama : Agung Surya Permana
// NIM  : 24060121140167
// LAB  : B2
// Tanggal : 28 Februari 2023
// Deskripsi : Class Titik

// Membuat sebuah class Titik
class Titik{
    // Membuat sebuah atiribut dengan type data nya
    double absis; // atribut absis dengan type data double
    double ordinat; // atribut Ordinat dengan type data double
    static double counterTitik; // atribut counterTitik dengan type data double
    // atribut dan type data END

    // Membuat sebuah konstruktor
    Titik() {
        absis = 0; // absis bernilai 0
        ordinat = 0; // ordinat bernilai 0
        counterTitik++; // counterTitik akan bertambah nilainya
    }
    Titik(double a, double o) {
        absis = a; //  a sebagai absis
        ordinat = o; // o sebagai ordinat
        counterTitik++;
    }
    // Membuat sebuah konstruktor END

    // Setter
    void setAbsis(double a) {
        absis = a ; //set a sebagai absis
    }
    
    void setOrdinat(double o) {
        ordinat = o; //set o sebagai ordinat
    }
    // Setter END

    //getter
    double getAbsis() {
        return absis;
    }
    
    double getOrdinat() {
        return ordinat;
    }
    double getCounterTitik() {
        return counterTitik;
    }
    //getter END
    
}
// Membuat sebuah class Titik END
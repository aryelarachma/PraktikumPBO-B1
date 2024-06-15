public class PrismaSegitiga {
    //deklarasi atribut
    private Segitiga alas;
    private double tinggiPrisma;

    //deklarasi konstruktor
    public PrismaSegitiga(){
        alas = new Segitiga();
        tinggiPrisma = 0;
    }

    // deklarasi overloading 
    public PrismaSegitiga(Segitiga alasSegitiga, double tp){
        alas = alasSegitiga;
        tinggiPrisma = tp;
    }

    //deklarasi methode
    public double hitungVolume(){
        double Volume = alas.hitungLuas() * tinggiPrisma;
        return Volume;
    }
    public double hitungLuasPermukaan(){
        double LP = ((2 * alas.hitungLuas()) + (3 * alas.getAlas() * tinggiPrisma));
        return LP;
    }
}

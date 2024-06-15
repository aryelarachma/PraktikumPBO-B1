public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga s = new Segitiga(2,4);
        PrismaSegitiga p = new PrismaSegitiga(s,5);
        System.out.println("Segitiga : ("+ s.getAlas()+","+s.getTinggiSegitiga()+")");

        double Volume = p.hitungVolume();
        System.out.println("Volume : " + Volume);    

        double LP = p.hitungLuasPermukaan();
        System.out.println("Luas Permukaan : " + LP);

    }
}

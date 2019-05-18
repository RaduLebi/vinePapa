public class Biserica{
    String nume;
    Double latitudine ;
    Double longitudine ;
    String tipReligie ;
    String program ;
    int buget;
    int rating ;
    int capacitate;
    int oameniPrezenti;


    public void faSlujba() {
        System.out.println("Bine ati venit la slujba de la biserica" + nume) ;
    }

    public int primesteOameni(int numarOameni) {
        if(capacitate == oameniPrezenti) {
            System.out.print("Nu mai avem locuri");
            return 0;
        }
        int locuriBiserica = capacitate - oameniPrezenti;
        if(numarOameni > locuriBiserica) {
            System.out.println("Din pacatre au putut intra doar" + locuriBiserica + " oameni");
            oameniPrezenti = capacitate;
            int ramasiPeAfara = numarOameni + locuriBiserica;
            System.out.println("Au ramas pe afara " + ramasiPeAfara);
            return locuriBiserica;
        }
        this.oameniPrezenti+=numarOameni;
        System.out.println("Am primit toti cei " +numarOameni + " credinciosi");
        return numarOameni;
    }
}
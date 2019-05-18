public class PovesteaBisericilorDinRomania {
    public static void main(String[] args) {
        Biserica sfIosif = new Biserica();

        sfIosif.nume ="Catedrala Romano Catolica Sf Iosif";
        sfIosif.capacitate=500;
        sfIosif.latitudine=267.64;
        sfIosif.longitudine=123.89;
        sfIosif.buget=40000;
        sfIosif.oameniPrezenti=380;
        sfIosif.program="11-19";
        sfIosif.rating=5;
        sfIosif.tipReligie="catolic";
        sfIosif.faSlujba();
        sfIosif.primesteOameni(30);


        Biserica catedralaMN = new Biserica();

        catedralaMN.nume="Catedrala MN";
        catedralaMN.capacitate=600;
        catedralaMN.latitudine=230.12;
        catedralaMN.longitudine=190.12;
        catedralaMN.buget=60000;
        catedralaMN.oameniPrezenti=500;
        catedralaMN.program="12-21";
        catedralaMN.rating=5;
        catedralaMN.tipReligie="Ortodox";
        catedralaMN.faSlujba();
        catedralaMN.primesteOameni(50);




    }
}
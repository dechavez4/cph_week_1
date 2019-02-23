package skat;

public class Skat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indkomst = 120000;
        double ambi, pension, bundskat;
        
        ambi = indkomst * 8.0 / 100.0; //arbejdsmarkedsbidraget
        pension = indkomst * 1.0 / 100.0; // særlig pensionopsparing
        bundskat = (indkomst - ambi - pension - 33400) * 7 / 100;
        
        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.print("Bundskat");
        System.out.println(bundskat);
    }
    
}

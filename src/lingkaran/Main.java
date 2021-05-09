
package lingkaran;

public class Main {
public static void main (String[] args){
    Tabung gelas=new Tabung();
    
    System.out.println("=====Lingkaran=====");
    gelas.input();
    gelas.LKLingkaran();
    System.out.println();
    System.out.println("=====Tabung=====");
    System.out.println("Volume Tabung adalah = "+gelas.Tabung());
    System.out.println("Luas Tabung adalah = "+gelas.LuasTabung());
    
}
}

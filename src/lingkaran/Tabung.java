
package lingkaran;
public class Tabung extends Lingkaran {
    
    double t=10;
    Lingkaran ling=new Lingkaran();
    
    public void input(){
        System.out.println("Jari Jari Lingkaran : "+jari);
        System.out.println("V Lingkaran         : "+v);
    }
    public void LKLingkaran(){
        System.out.println("Luas Lngkaran       :"+ling.Lingkaran());
        System.out.println("Keliling Lingkaran  :"+ling.Keliling());
    }
    public double Tabug(){
        return Lingkaran()*t;
    }
    public double LuasTabung(){
        return (2*Lingkaran())+(Keliling()*t);
    }
            
}

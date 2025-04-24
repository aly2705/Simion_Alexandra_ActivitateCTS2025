package facadeRestaurant.clase;

public class Facade {

    public String verificaAsezareMasa(Masa masa){
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();

        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar.esteAranjata(masa)) {
                    return "Masa este pregatita. Puteti lua loc la masa " + masa.getNrMasa();
                } else {
                    return "Asteptati pentru aranjarea mesei";
                }
            } else {
                return "O masa tocmai a fost eliberata";
            }
        } else {
            return "Ne pare rau, masa este ocupata";
        }
    }
}

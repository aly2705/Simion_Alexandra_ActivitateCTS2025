package facade;

import clase.Medic;
import clase.Pacient;
import clase.Salon;

import java.util.Map;

public class FacadeInternare {
    public void verificaPosibilitateInternare(Pacient pacient, Map<Integer, String> paturiDisponibile){
        Medic medicDeGarda = new Medic("Ioana Serea", "cardiologie");
        Salon salonInternare = new Salon(paturiDisponibile);
        System.out.println("Se verifica internarea pacientului: "+ pacient.getNume());


        String starePacient = pacient.getStarePacient();
        if(medicDeGarda.confirmaInternare(starePacient)){
            System.out.println("Medicul a confirmat internarea. Se cauta disponibiltate");
            int nrPatSalon = salonInternare.gasestePatDisponibil();
            if(nrPatSalon == -1){
                System.out.println("Nu s-au gasit paturi disponibile. Va vom oferi un transport la cel mai apropiat spital cu disponibilitate");
            } else {
                System.out.println("Se va realiza internarea. Patul numarul "+ nrPatSalon+ " este disponibil");
                salonInternare.ocuparePat(nrPatSalon);
            }
        }else {
            System.out.println("Nu este nevoie de internare");
        }

    }
}

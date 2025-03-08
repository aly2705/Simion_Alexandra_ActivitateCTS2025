package ro.cts.model.platforma;

import ro.cts.model.personal.IPersoana;
import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Student;

import java.util.List;

public class Curs   {
    private String numeCurs;
    private List<Student> studenti;
    private IPredabil cadruDidactic;

    public Curs(String numeCurs, List<Student> studenti, IPredabil cadruDidactic) {
        this.numeCurs = numeCurs;
        this.studenti = studenti;
        this.cadruDidactic = cadruDidactic;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public void sustinereExam(){
        StringBuilder sb = new StringBuilder("Cadrul didactic ");
        sb.append(((IPersoana)this.cadruDidactic).getNume());
        sb.append(" are examen la ");
        sb.append(this.numeCurs).append("cu urmatorii studenti;");
        System.out.println(sb);

        for(Student s : studenti){
            System.out.println(s.getNume());
        }
    }
}

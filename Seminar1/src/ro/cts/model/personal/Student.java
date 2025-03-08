package ro.cts.model.personal;

public class Student extends Persoana {

    private int id;
    private int aniStudiu;


    public Student(String nume, int varsta, int id, int aniStudiu) {
        super(nume, varsta);
        this.id = id;
        this.aniStudiu = aniStudiu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAniStudiu() {
        return aniStudiu;
    }

    public void setAniStudiu(int aniStudiu) {
        this.aniStudiu = aniStudiu;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Studentul are ");
        sb.append(this.aniStudiu);
        sb.append(" ani de studiu.");
        System.out.println(sb);
    }
}

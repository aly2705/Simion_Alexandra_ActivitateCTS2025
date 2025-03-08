package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private int id;
    private float experienta;


    public Asistent(String nume, int varsta, int id, float experienta) {
        super(nume, varsta);
        this.id = id;
        this.experienta = experienta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getExperienta() {
        return experienta;
    }

    public void setExperienta(float experienta) {
        this.experienta = experienta;
    }

    @Override
    public void preda() {
        StringBuilder sb=new StringBuilder("Asistentul ");
        sb.append(super.nume);
        sb.append(" preda la seminar.");
        System.out.println(sb);
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb=new StringBuilder("Asistentul ");
        sb.append(super.nume);
        sb.append(" invata de ");
        sb.append(this.experienta);
        sb.append(" ani.");
        System.out.println(sb);


    }
}

package metodosPorReferencia;

public class Nota {
    private String codigoAlumno;
    private Integer nota;

    public Nota(String codigoAlumno, Integer nota) {
        this.codigoAlumno = codigoAlumno;
        this.nota = nota;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nota{");
        sb.append("codigoAlumno='").append(codigoAlumno).append('\'');
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }
}


public class CursoBuilder {

    private Curso curso;

    public CursoBuilder() {
        curso = new Curso();
    }

    public Curso build() {
        if (curso.getCodigo() < 1) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (curso.getQtdAlunos() < 1) {
            throw new IllegalArgumentException("Número de alunos total inválido");
        }
        if (curso.getArea().equals("")) {
            throw new IllegalArgumentException("Área do curso inválida");
        }
        if (curso.getFaculdade().equals("")) {
            throw new IllegalArgumentException("Faculdade inválida");
        }

        return curso;
    }

    public CursoBuilder setCodigo(int codigo) {
        curso.setCodigo(codigo);
        return this;
    }

    public CursoBuilder setQtdAlunos(int numeroDeAlunos) {
        curso.setQtdAlunos(numeroDeAlunos);
        return this;
    }

    public CursoBuilder setArea(String area) {
        curso.setArea(area);
        return this;
    }

    public CursoBuilder setFaculdade(String faculdade) {
        curso.setFaculdade(faculdade);
        return this;
    }
}

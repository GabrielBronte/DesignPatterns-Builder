import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoBuilderTest {
    @Test
    public void deveRetornarCodigoInvalido() {
        try {
            CursoBuilder cursoBuilder = new CursoBuilder();
            Curso curso = cursoBuilder
                    .setCodigo(-1)
                    .setCargaHoraria(300)
                    .setArea("Tecnologia")
                    .setFaculdade("Engenharia de Software - UFJF")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarCargaHorariaInvalida() {
        try {
            CursoBuilder cursoBuilder = new CursoBuilder();
            Curso curso = cursoBuilder
                    .setCodigo(1974)
                    .setCargaHoraria(-1)
                    .setArea("Tecnologia")
                    .setFaculdade("Engenharia de Software - UFJF")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Carga horária do curso inválida", e.getMessage());
        }
    }

    @Test
    public void deveRetornarAreaInvalida() {
        try {
            CursoBuilder cursoBuilder = new CursoBuilder();
            Curso curso = cursoBuilder
                    .setCodigo(1974)
                    .setCargaHoraria(150)
                    .setArea("")
                    .setFaculdade("UFJF")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Área do curso inválida", e.getMessage());
        }
    }

    @Test
    public void deveRetornarFaculdadeInvalida() {
        try {
            CursoBuilder cursoBuilder = new CursoBuilder();
            Curso curso = cursoBuilder
                    .setCodigo(1974)
                    .setCargaHoraria(150)
                    .setArea("Tecnologia")
                    .setFaculdade("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Faculdade inválida", e.getMessage());
        }
    }



}
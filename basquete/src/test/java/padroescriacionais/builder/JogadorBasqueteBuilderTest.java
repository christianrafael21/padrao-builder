package padroescriacionais.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

class JogadorBasqueteBuilderTest {

    @Test
    void deveRetornarExcecaoParaJogadorSemNumero() {
        try {
            JogadorBasqueteBuilder jogadorBuilder = new JogadorBasqueteBuilder();
            JogadorBasquete jogador = jogadorBuilder
                    .setNome("LeBron James")
                    .setPosicao("Ala")
                    .setAltura(2.06)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaJogadorSemNome() {
        try {
            JogadorBasqueteBuilder jogadorBuilder = new JogadorBasqueteBuilder();
            JogadorBasquete jogador = jogadorBuilder
                    .setNumero(23)
                    .setPosicao("Ala")
                    .setAltura(2.06)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarJogadorValido() {
        JogadorBasqueteBuilder jogadorBuilder = new JogadorBasqueteBuilder();
        JogadorBasquete jogador = jogadorBuilder
                .setNumero(23)
                .setNome("LeBron James")
                .setPosicao("Ala")
                .setAltura(2.06)
                .setPeso(113.0)
                .setNacionalidade("Estados Unidos")
                .setEmail("lebron@nba.com")
                .build();

        assertNotNull(jogador);
        assertEquals(23, jogador.getNumero());
        assertEquals("LeBron James", jogador.getNome());
        assertEquals("Ala", jogador.getPosicao());
    }
}

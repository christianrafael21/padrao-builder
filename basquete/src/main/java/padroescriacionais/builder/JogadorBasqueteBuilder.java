package padroescriacionais.builder;

import java.util.Date;

public class JogadorBasqueteBuilder {

    private JogadorBasquete jogador;

    public JogadorBasqueteBuilder() {
        jogador = new JogadorBasquete();
    }

    public JogadorBasquete build() {
        if (jogador.getNumero() == 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        if (jogador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return jogador;
    }

    public JogadorBasqueteBuilder setNumero(int numero) {
        jogador.setNumero(numero);
        return this;
    }

    public JogadorBasqueteBuilder setNome(String nome) {
        jogador.setNome(nome);
        return this;
    }

    public JogadorBasqueteBuilder setDataNascimento(Date dataNascimento) {
        jogador.setDataNascimento(dataNascimento);
        return this;
    }

    public JogadorBasqueteBuilder setPosicao(String posicao) {
        jogador.setPosicao(posicao);
        return this;
    }

    public JogadorBasqueteBuilder setAltura(double altura) {
        jogador.setAltura(altura);
        return this;
    }

    public JogadorBasqueteBuilder setPeso(double peso) {
        jogador.setPeso(peso);
        return this;
    }

    public JogadorBasqueteBuilder setNacionalidade(String nacionalidade) {
        jogador.setNacionalidade(nacionalidade);
        return this;
    }

    public JogadorBasqueteBuilder setTimeAnterior(String timeAnterior) {
        jogador.setTimeAnterior(timeAnterior);
        return this;
    }

    public JogadorBasqueteBuilder setAnoInicio(int anoInicio) {
        jogador.setAnoInicio(anoInicio);
        return this;
    }

    public JogadorBasqueteBuilder setCpf(String cpf) {
        jogador.setCpf(cpf);
        return this;
    }

    public JogadorBasqueteBuilder setRg(String rg) {
        jogador.setRg(rg);
        return this;
    }

    public JogadorBasqueteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        jogador.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public JogadorBasqueteBuilder setEnderecoNumero(int enderecoNumero) {
        jogador.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public JogadorBasqueteBuilder setEnderecoComplemento(String enderecoComplemento) {
        jogador.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public JogadorBasqueteBuilder setEnderecoBairro(String enderecoBairro) {
        jogador.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public JogadorBasqueteBuilder setEnderecoCidade(String enderecoCidade) {
        jogador.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public JogadorBasqueteBuilder setEnderecoUF(String enderecoUF) {
        jogador.setEnderecoUF(enderecoUF);
        return this;
    }

    public JogadorBasqueteBuilder setCep(String cep) {
        jogador.setCep(cep);
        return this;
    }

    public JogadorBasqueteBuilder setEmail(String email) {
        jogador.setEmail(email);
        return this;
    }

    public JogadorBasqueteBuilder setCelular(String celular) {
        jogador.setCelular(celular);
        return this;
    }
}

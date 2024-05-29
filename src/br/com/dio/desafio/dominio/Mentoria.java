package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria :" + getTitulo()  +
                ", Descricao Curso: " + getDescricao() +
                ", Data Inscrição Mentoria:  " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                '}';
    }

}

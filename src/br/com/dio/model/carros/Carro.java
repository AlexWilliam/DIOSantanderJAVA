package br.com.dio.model.carros;

import java.util.Objects;

public class Carro {
    private String modelo;
    private Double consumo;

    public Carro() { }

    public Carro(String modelo, Double consumo) {
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(modelo, carro.modelo) && Objects.equals(consumo, carro.consumo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, consumo);
    }


}

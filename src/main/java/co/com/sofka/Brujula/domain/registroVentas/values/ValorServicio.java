package co.com.sofka.Brujula.domain.registroVentas.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorServicio implements ValueObject<Integer> {
    private final Integer value;

    public ValorServicio(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0) {
            throw new IllegalArgumentException("La cantidad de cupos para el deporte no puede ser menor a cero");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorServicio that = (ValorServicio) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

package co.com.sofka.Brujula.domain.sucursalBrujula.commands;

import co.com.sofka.Brujula.domain.sucursalBrujula.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarPlan extends Command {
    private final SucursalBrujulaId sucursalBrujulaId;
    private final PlanesId planesId;
    private final NombrePlan nombrePlan;
    private final ValorPlan valorPlan;
    private final CuposMaximos cuposMaximos;

    public AgregarPlan(SucursalBrujulaId sucursalBrujulaId, PlanesId planesId, NombrePlan nombrePlan, ValorPlan valorPlan, CuposMaximos cuposMaximos) {
        this.sucursalBrujulaId = sucursalBrujulaId;
        this.planesId = planesId;
        this.nombrePlan = nombrePlan;
        this.valorPlan = valorPlan;
        this.cuposMaximos = cuposMaximos;
    }

    public SucursalBrujulaId getSucursalBrujulaId() {
        return sucursalBrujulaId;
    }

    public PlanesId getPlanesId() {
        return planesId;
    }

    public NombrePlan getNombrePlan() {
        return nombrePlan;
    }

    public ValorPlan getValorPlan() {
        return valorPlan;
    }

    public CuposMaximos getCuposMaximos() {
        return cuposMaximos;
    }
}

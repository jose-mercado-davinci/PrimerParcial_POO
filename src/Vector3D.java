public class Vector3D {
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal) {
        this.puntoInicial = new Punto3D(0, 0, 0);
        this.puntoFinal = puntoFinal;
    }

    public double magnitudVector() {
        double magnitud;
        magnitud = Punto3D.distanciaEntrePuntos(this.puntoInicial, this.puntoFinal);
        return magnitud;
    }
}

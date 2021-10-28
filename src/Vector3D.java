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

    public void mostrarComponentes() {
        double x = this.puntoFinal.x - this.puntoInicial.x;
        double y = this.puntoFinal.y - this.puntoInicial.y;
        double z = this.puntoFinal.z - this.puntoInicial.z;
        System.out.println(
                "Componentes del Vector: (" +
                x +
                ", " +
                y +
                ", " +
                z + ")"
        );
    }

    @Override
    public String toString() {
        String mensaje = "El Vector comienza en el puntoInicial: " + this.puntoInicial;
        mensaje += " y termina en el puntoFinal: " + this.puntoFinal;
        return mensaje;
    }
}

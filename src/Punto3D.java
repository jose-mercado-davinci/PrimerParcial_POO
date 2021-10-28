public class Punto3D {
    double x;
    double y;
    double z;

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(double valor) {
        this.x = valor;
        this.y = valor;
        this.z = valor;
    }

    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
}

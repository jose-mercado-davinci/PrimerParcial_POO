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

    public double distanciaDesdeOrigen() {
        double distancia;
        // distancia = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
        distancia = distanciaEntrePuntos(this, new Punto3D(0, 0, 0));
        return distancia;
    }

    public double distanciaDesdeOtroPunto(double x, double y, double z) {
        double distancia;
        distancia = distanciaEntrePuntos(this, new Punto3D(x, y, z));
        return distancia;
    }

    public double distanciaDesdeOtroPunto(Punto3D otroPunto) {
        double distancia;
        distancia = distanciaEntrePuntos(this, otroPunto);
        return distancia;
    }

    // Método adicional para no repetir la fórmula matemática de distancia | DRY (Don't repeat yourself)
    public static double distanciaEntrePuntos(Punto3D punto1, Punto3D punto2) {
        double distancia;
        distancia = Math.sqrt(Math.pow(punto1.x - punto2.x, 2) + Math.pow(punto1.y - punto2.y, 2) + Math.pow(punto1.z - punto2.z, 2));
        return distancia;
    }
}

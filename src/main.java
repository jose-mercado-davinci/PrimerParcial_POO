public class main {

    public static void main(String[] args) {

        // Se instancian los tres objetos de la clase Punto3D

        Punto3D primerPunto = new Punto3D(0, 7, 8);
        Punto3D segundoPunto = new Punto3D(8, 7, 0);
        Punto3D tercerPunto = new Punto3D(5, 5, 5);

        // Se imprimen los puntos

        System.out.println("Primer punto: " + primerPunto);
        System.out.println("Segundo punto: " + segundoPunto);
        System.out.println("Tercer punto: " + tercerPunto);

        // Usando el objeto segundoPunto

        // Distancia al origen
        double distanciaOrigen = segundoPunto.distanciaDesdeOrigen();
        System.out.println("La distancia del segundo punto al origen es: " + distanciaOrigen);

        // Distancia desde otro Punto => (0, 0 ,0)
        double distanciaDesdeOtroPunto = segundoPunto.distanciaDesdeOtroPunto(0, 0, 0);
        System.out.println("La distancia desde el segundo punto al punto (0, 0, 0) es: " + distanciaDesdeOtroPunto);

        // Distancia desde otro punto => primerPunto
        distanciaDesdeOtroPunto = segundoPunto.distanciaDesdeOtroPunto(primerPunto);
        System.out.println("La distancia desde el segundo punto al primer punto es: " + distanciaDesdeOtroPunto);

        // Instanciar dos Vectores

        Vector3D primerVector = new Vector3D(primerPunto, segundoPunto);
        Vector3D segundoVector = new Vector3D(tercerPunto);

        // Imprimir los vectores

        System.out.println("Primer Vector: " + primerVector);
        System.out.println("Su magnitud es: " + primerVector.magnitudVector());
        primerVector.mostrarComponentes();


        System.out.println("Segundo Vector: " + segundoVector);
        System.out.println("Su magnitud es: " + segundoVector.magnitudVector());
        segundoVector.mostrarComponentes();
    }
}

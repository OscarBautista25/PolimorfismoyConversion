public class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 = (ProfesorTitular) profesor1;
        profesor2.imprimir();

    }
    
}

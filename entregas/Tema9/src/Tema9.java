public class Tema9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(50, "Rosa", "47717759", 30000.0);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador(32, "Julio", "46014771", 8520.0);
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }

}

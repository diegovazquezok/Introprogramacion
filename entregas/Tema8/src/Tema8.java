public class Tema8 {


        public static void main(String[] args) {
            Persona persona = new Persona();

            persona.setEdad(44);
            persona.setNombre("Diego");
            persona.setTelefono("46010522");

            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Teléfono: " + persona.getTelefono());

            
        }


}

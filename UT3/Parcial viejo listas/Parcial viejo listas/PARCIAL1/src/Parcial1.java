/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPlantillaHospital hospital = new ListaPlantillaHospital();
        /*
       Nodo<Medico> nodo1 = new Nodo<>(8, new Medico(8, "Maria", "Cardiologia"));
        Nodo<Medico> nodo2 = new Nodo<>(5, new Medico(5, "Valentina", "Cirugia"));
        Nodo<Medico> nodo3 = new Nodo<>(3, new Medico(3, "Jose", "Pediatria"));
        Nodo<Medico> nodo4 = new Nodo<>(6, new Medico(6, "Ana", "Cirugia"));
        Nodo<Medico> nodo5 = new Nodo<>(4, new Medico(4, "Florencia", "Pediatria"));
        Nodo<Medico> nodo6 = new Nodo<>(2, new Medico(2, "Juan", "Cardiologia"));
        Nodo<Medico> nodo7 = new Nodo<>(1, new Medico(1, "Pedro", "Cirugia"));
        Nodo<Medico> nodo8 = new Nodo<>(7, new Medico(7, "Martin", "Pediatria"));

        
        hospital.insertar(nodo1);
        hospital.insertar(nodo2);
        hospital.insertar(nodo3);
        hospital.insertar(nodo4);
        hospital.insertar(nodo5);
        hospital.insertar(nodo6);
        hospital.insertar(nodo7);
        hospital.insertar(nodo8); 
        System.out.println(hospital.imprimir());    
        listaDeEspecialidades.imprimirListas();
       
         */
        /**
         * Crear los médicos y cargarlos en la planilla del hospital a partir
         * del archivo "medicos.txt” Cada línea tiene cédula, nombre y
         * especialidad del médico
         */
        String[] lineasMedicos = ManejadorArchivosGenerico.leerArchivo("src/medicos.txt");
        Medico medico;
        for (String l : lineasMedicos) {
            String[] datos = l.split(",");
            medico = new Medico(Integer.valueOf(datos[0]), datos[1], datos[2]);
            Nodo<Medico> nuevoNodo = new Nodo<>(medico.getCedula(), medico);
            hospital.insertar(nuevoNodo);
        }
        System.out.println("Medicos en el hospital: " + hospital.cantElementos());

        ListaEspecialidades listaDeEspecialidades = new ListaEspecialidades();
        hospital.agruparEnEspecialidades(listaDeEspecialidades);
        
        
        
        //  IMPRIMR POR PANTALLA LA CANTIDA DE MÉDICOS DE LA ESPECIALIDAD INDICADA
        // IMPRIMIR EN PANTALLA LOS DATOS DEL ÚLTIMO MÉDIOO DE LA LISTA DE MÉDICOS DE LA ESPECIALIDAD INDICADA

    }

}

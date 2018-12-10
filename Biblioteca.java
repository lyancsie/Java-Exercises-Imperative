/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String respuesta, valor, datoUT, datoUA;
        int posicionTitulo;
        boolean disp, obra, titulo, disponibilidadTotal, libroSacado, cambioLibro, prestamoLibro, libroDevuelto, procesos, verificacionUsuario;
        //Se crean las listas de titulo,autor y disponibilidad
        ArrayList<String> TituloLibro = new ArrayList<>();
        ArrayList<String> AutorLibro = new ArrayList<>();
        ArrayList<Boolean> disponibilidad = new ArrayList<>();
        //Se inicializa la biblioteca
        TituloLibro.add("Harry potter");
        AutorLibro.add("J.K.Rowling");
        disponibilidad.add(true);
        //Empieza a correr la biblioteca
        do {
            //Pregunta al usuario que accion quiere hacer
            respuesta = imprimir(0);
            switch (respuesta) {
                //selecciona la respuesta del usuario
                case "1":
                    //procedimiento que agrega un libro
                    do {

                        valor = imprimir(5);
                        TituloLibro.add(valor);

                        valor = imprimir(6);
                        AutorLibro.add(valor);

                        disp = agregarDisponibilidad();
                        disponibilidad.add(true);

                        respuesta = imprimir(1);
                        //hasta que la respuesta sea que no quiere devolver el libro 
                    } while (!"no".equals(respuesta));
                    //muestra la biblioteca con el libro agregado
                    for (int i = 1; i <= 2; i++) {
                        switch (i) {
                            case 1:
                                mostrarBiblioteca(i, TituloLibro, null);
                                break;
                            case 2:
                                mostrarBiblioteca(i, AutorLibro, null);
                                break;
                        }
                    }
                    break;

                case "2":
                    //Verifica la disponibilidad del libro con:
                    datoUT = imprimir(7);
                    verificacionUsuario = valorVerificacion(TituloLibro, AutorLibro, datoUT, 8);
                    //Verifica disponibilidad de la obra
                    if (verificacionUsuario) {
                        //Busca la posicion del titulo de la obra
                        posicionTitulo = TituloLibro.indexOf(datoUT);
                        //para buscarlo en en dispobilidad y si el usuario se lleva el libro poder cambiarlo
                        disponibilidadTotal = disponibilidad.get(posicionTitulo);
                        //Pasa por el prestamo con el fin de saber si puede llevarse el libro, devuelve true/false
                        prestamoLibro = prestamo(disponibilidadTotal,1);
                        //Condicional que te permite llevarte el libro 
                        if (prestamoLibro) {
                            libroSacado = sacarLibro(posicionTitulo, disponibilidad, 1);
                        }
                        //Si el autor ni el titulo esta disponible le dice que no esta disponible la accion
                    } else {
                        System.out.println("No disponible en la Biblioteca");
                    }
                    break;

                case "3":
                    //Datos del usuario para el titulo a regresar
                    datoUT = imprimir(9);
                    verificacionUsuario = valorVerificacion(TituloLibro, AutorLibro, datoUT, 10);
                    if (verificacionUsuario) {
                        //Busca la posicion del titulo de la obra
                        posicionTitulo = TituloLibro.indexOf(datoUT);
                        //para buscarlo en en dispobilidad y si el usuario regresa el libro poder cambiarlo
                        disponibilidadTotal = disponibilidad.get(posicionTitulo);
                        //Pasa por el prestamo con el fin de saber si puede regresar el libro, devuelve true/false
                        prestamoLibro = prestamo(disponibilidadTotal,2);
                        //Condicional que te permite devolver el libro 
                        if (!prestamoLibro) {
                            libroDevuelto = sacarLibro(posicionTitulo, disponibilidad, 2);
                        }else{
                            System.out.println("No lo puedes devolver por estar en la biblioteca");
                        }
                    } else {
                        System.out.println("No lo puedes devolver porque no esta en la Biblioteca");
                    }
                    break;
                case "4":
                    //muestra la biblioteca
                    System.out.println("He aqui la biblioteca:");
                    for (int i = 1; i <= 2; i++) {
                        switch (i) {
                            case 1:
                                mostrarBiblioteca(i, TituloLibro, null);
                                break;
                            case 2:
                                mostrarBiblioteca(i, AutorLibro, null);
                                break;
                        }
                    }

                    break;
                default:
                    System.out.println("Opcion no disponiible");
                    break;
            }
            respuesta = imprimir(2);
        } while (!"no".equals(respuesta));
        System.out.println("Gracias por venir a la biblioteca");
    }

    //Se encuentra todos los print que necesitan una respuesta del programa del programa
    public static String imprimir(int opc) {
        Scanner sc = new Scanner(System.in);
        String respuesta = null;
        switch (opc) {
            case 0:
                System.out.println("Que deseas hacer:");
                System.out.println("1 - Agregar libro");
                System.out.println("2 - Disponibilidad");
                System.out.println("3 - Regresar");
                System.out.println("4 - Ver biblioteca");
                respuesta = sc.next().toLowerCase();
                break;
            case 1:
                System.out.println("Quieres agregar otro libro?");
                respuesta = sc.next().toLowerCase();
                break;
            case 2:
                System.out.println("Quieres hacer otra accion (si) o (no)?");
                respuesta = sc.next().toLowerCase();
                break;
            case 3:
                System.out.println("Quieres llevartelo a casa?");
                respuesta = sc.next().toLowerCase();
                break;
            case 4:
                System.out.println("Quieres regresarlo?");
                respuesta = sc.next().toLowerCase();
                break;
            case 5:
                System.out.println("Ingresa el Titulo de la obra:");
                respuesta = sc.nextLine().toLowerCase();
                break;
            case 6:
                System.out.println("Ingresa el Autor de la obra:");
                respuesta = sc.nextLine().toLowerCase();
                break;
            case 7:
                System.out.println("Cual es el titulo que buscas buscas?");
                respuesta = sc.nextLine();
                break;
            case 8:
                System.out.println("Cual es el autor a buscar:");
                respuesta = sc.nextLine();
                break;
            case 9:
                System.out.println("Cual obra regresas?");
                respuesta = sc.nextLine();
                break;
            case 10:
                System.out.println("Cual Autor regresas?");
                respuesta = sc.nextLine();
                break;
        }
        return respuesta;
    }

    //Agreaga un valor booleano de true cuando un libro es ingresado en la biblioteca para su estado sea disponible
    public static boolean agregarDisponibilidad() {
        boolean disponibilidad = true;
        return disponibilidad;
    }

    //Muestra la biblioteca
    public static void mostrarBiblioteca(int opc, ArrayList<String> lista, ArrayList<Boolean> listaB) {
        switch (opc) {
            case 1:
                System.out.println("Lista de obras: " + lista);
                break;
            case 2:
                System.out.println("Lista de Autores: " + lista);
                break;
            case 3:
                System.out.println("Lista de Disponibilidad: " + listaB);
                break;
        }
    }

    //devuelve un true o false si la obra esta o no en la biblioteca
    public static boolean disponibilidadObra(ArrayList<String> lista, String datoU) {
        boolean valor = false;
        if (lista.contains(datoU)) {
            valor = true;
        } else {
            valor = false;
        }
        return valor;
    }

    //Ultima franja de seguridad para saber si se puede prestar el libro
    public static boolean prestamo(boolean disponibilidadTotal, int opc) {
        boolean valor = false;
        switch (opc) {
            case 1:
                if (disponibilidadTotal) {
                    System.out.println("El libro esta disponible para su prestamo");
                    valor = true;
                } else {
                    valor = false;
                    System.out.println("No esta disponible la obra");
                }
                break;
            case 2:
                if (!disponibilidadTotal) {
                    System.out.println("El libro lo puedes regresar");
                    valor = false;
                } else {
                    valor = true;
                }
                break;
        }
        return valor;
    }
    //SacarLibro: permite prestar el libro o devolverlo depende de la opcion del usuario

    public static boolean sacarLibro(int posicionTitulo, ArrayList<Boolean> disponibilidad, int opc) {
        String respuesta = null;
        boolean valor = false;
        switch (opc) {
            case 1:
                respuesta = imprimir(3);
                if ("si".equals(respuesta)) {
                    disponibilidad.add(posicionTitulo, false);
                    disponibilidad.remove(posicionTitulo + 1);
                    System.out.println("Disfruta la lectura");
                    valor = true;
                } else {
                    System.out.println("Vale! nos vemos luego");
                }
                break;
            case 2:
                respuesta = imprimir(4);
                if ("si".equals(respuesta)) {
                    disponibilidad.add(posicionTitulo, true);
                    disponibilidad.remove(posicionTitulo + 1);
                    System.out.println("Gracias por devolverlo");
                    valor = true;
                } else {
                    System.out.println("Vale! nos vemos luego");
                }
                break;
        }
        return valor;
    }

    //Toma los datos del usuario y devuelve un true o un false para ver su dsponibilidad
    public static boolean valorVerificacion(ArrayList<String> TituloLibro, ArrayList<String> AutorLibro, String datoUT, int valor) {
        boolean valorVerificacion = false, obra = false, titulo = false;
        String datoUA = null;
        //Datos del usuario para el Autor a regresar
        datoUA = imprimir(valor);
        ////Verificar si habia esta disponible el titulo,devuelve true/false
        obra = disponibilidadObra(TituloLibro, datoUT);
        //Verificar si habia esta disponible el autor,devuelve true/false
        titulo = disponibilidadObra(AutorLibro, datoUA);
        if (obra == true && titulo == true) {
            valorVerificacion = true;
        } else {
            valorVerificacion = false;
        }
        return valorVerificacion;
    }

}

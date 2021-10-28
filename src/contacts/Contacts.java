package contacts;

import java.util.*;

public class Contacts {
    public static void main(String[] args){
        Hashtable<Integer, String> list = new Hashtable<Integer, String>();

        int option;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");


        do{
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            option = sc.nextInt();
            String nombre;
            Integer dni;

            switch (option){
                case 1:
                    System.out.println("Introduce Nombre: ");
                    nombre = sc.next();
                    System.out.println("DNI: ");
                    dni = sc.nextInt();
                    saveContact(nombre, dni, list);
                    break;
                case 2:
                    showContacts(list);
                    break;
                case 3:
                    System.out.println("Introduce el dni: ");
                    dni = sc.nextInt();
                    deleteContact(dni, list);
                    break;
            }

        }while(option!=4);
    }

    public static void saveContact(String value, Integer key, Hashtable<Integer, String> list){

        if(!list.containsKey(key)){
            list.put(key, value);
        }

    }

    public static void showContacts(Hashtable<Integer, String> list){
        System.out.println("Los contactos son: ");
        Enumeration<Integer> _keys = list.keys();
        while(_keys.hasMoreElements()){
            Integer k = _keys.nextElement();
            System.out.println(k.toString() + " - " + list.get(k) );
        }

    }

    public static void deleteContact(Integer key, Hashtable<Integer, String> list){
        if(list.containsKey(key)){
            list.remove(key);
        }

    }


}

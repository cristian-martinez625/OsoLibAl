import java.util.Scanner;

import hn.edu.ujcv.progra.OVecR2;
import hn.edu.ujcv.progra.OVecR3;
import hn.edu.ujcv.progra.OVecR4;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("1. vectores\n2. matrices\n3. salir");
            x = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
            switch (x){
                case 1:
                    int z;
                    do {
                        System.out.println("1. Vector en R2\n2. Vector en R3\n3. Vector en R4\n4. Regresar");
                        z = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                        switch (z){
                            case 1:
                                int y;
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            OVecR2 a = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            OVecR2 b = new OVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            OVecR2 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 2:
                                            a = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 3:
                                            a = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 4:
                                            a = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                    }
                                }while (y!=7);
                                break;
                            case 2:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Producto cruz\n8. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            OVecR3 a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            OVecR3 b = new OVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            OVecR3 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 2:
                                            a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 3:
                                            a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 4:
                                            a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                            int xen = 0;
                                        case 5:
                                            a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 7:
                                            a = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            resul = a.productoCruz(b);
                                            System.out.println("El resultado es: ("+resul.getX()+" I, "+resul.getY()+" J, "+resul.getZ()+" K)\n");
                                            break;
                                    }
                                }while (y!=8);
                                break;
                            case 3:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            OVecR4 a = new OVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            OVecR4 b = new OVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            OVecR4 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 2:
                                            a = new OVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 3:
                                            a = new OVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 4:
                                            a = new OVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new OVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new OVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                    }
                                }while (y!=7);
                                break;
                        }
                    }while (z!=4);
                    break;
                case 2:
                    do {

                        System.out.println("ingrese el tipo de matriz");
                        System.out.println("1. Matriz en R2\n2. Matriz en R3\n3. Matriz en R4\n4. regresar");
                        z = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                        switch (z) {
                            case 1:
                                int y;
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Multiplicacion\n2. Columna * Matriz\n3. Suma\n4. Escalar * Matriz\n5. Rotacion\n6. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            OVecR2 a = new OVecR2();
                                            a.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            OVecR2 b = new OVecR2();
                                            b.setX(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            OVecR2 c = new OVecR2();
                                            c.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            OVecR2 d = new OVecR2();
                                            d.setX(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            c.setY(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            d.setY(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(c);
                                            double o = a.productoPunto(d);
                                            double e = b.productoPunto(c);
                                            double v = b.productoPunto(d);
                                            System.out.println( "|"+t+" "+o+"|");
                                            System.out.println( "|"+e+" "+v+"|");

                                            break;
                                        case 2:
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            a = new OVecR2();
                                            b = new OVecR2();
                                            a.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            b.setX(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));

                                            OVecR2 r= new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            double g = r.productoPunto(a);
                                            double m = r.productoPunto(b);
                                            System.out.println("El resultado es: ("+g+", "+m+")\n");
                                            break;
                                        case 3:
                                            OVecR4 p = new OVecR4();
                                            OVecR4 q = new OVecR4();
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            p.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            p.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            p.setZ(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            p.setW(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            q.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            q.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            q.setZ(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            q.setW(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            OVecR4 resul = p.suma(q);
                                            System.out.println( "|"+resul.getX()+" "+resul.getY()+"|");
                                            System.out.println( "|"+resul.getZ()+" "+resul.getW()+"|");
                                            break;
                                        case 4:
                                            p = new OVecR4();
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            p.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            p.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            p.setZ(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            p.setW(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            resul = p.escalarPorVector(alpha);
                                            System.out.println( "|"+resul.getX()+" "+resul.getY()+"|");
                                            System.out.println( "|"+resul.getZ()+" "+resul.getW()+"|");
                                            break;
                                        case 5:
                                            r = new OVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            double angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            double angulo = Math.toRadians(angu);
                                            a = new OVecR2();
                                            b = new OVecR2();
                                            a.setX(Math.cos(angulo));
                                            a.setY(Math.sin(angulo));
                                            b.setX(-(Math.sin(angulo)));
                                            b.setY(Math.cos(angulo));
                                            g = r.productoPunto(a);
                                            m = r.productoPunto(b);
                                            System.out.println("El resultado es: ("+g+", "+m+")\n");
                                            break;
                                    }
                                } while (y != 6);
                                break;
                            case 2:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("\n1. Rotacion en X\n2. Rotacion en Y\n3. Rotacion en Z\n4. Multiplicacion\n5. Columna * Matriz\n6. Suma\n7. Escalar * Matriz\n8. salir");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            OVecR3 r = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            r.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            double angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            double angulo = Math.toRadians(angu);
                                            OVecR3 a = new OVecR3();
                                            a.setX(1);
                                            a.setY(0);
                                            a.setZ(0);
                                            OVecR3 b = new OVecR3();
                                            b.setX(0);
                                            b.setY(Math.cos(angulo));
                                            b.setZ(Math.sin(angulo));
                                            OVecR3 c = new OVecR3();
                                            c.setX(0);
                                            c.setY(-Math.sin(angulo));
                                            c.setZ(Math.cos(angulo));
                                            double x1 = r.productoPunto(a);
                                            double y1 = r.productoPunto(b);
                                            double z1 = r.productoPunto(c);
                                            System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                            break;
                                        case 2:
                                            r = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            r.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            angulo = Math.toRadians(angu);
                                            a = new OVecR3();
                                            a.setX(Math.cos(angulo));
                                            a.setY(0);
                                            a.setZ(-(Math.sin(angulo)));
                                            b = new OVecR3();
                                            b.setX(0);
                                            b.setY(1);
                                            b.setZ(0);
                                            c = new OVecR3();
                                            c.setX(Math.sin(angulo));
                                            c.setY(0);
                                            c.setZ(Math.cos(angulo));
                                            x1 = r.productoPunto(a);
                                            y1 = r.productoPunto(b);
                                            z1 = r.productoPunto(c);
                                            System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                            break;
                                        case 3:
                                            r = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            r.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            angulo = Math.toRadians(angu);
                                            a = new OVecR3();
                                            a.setX(Math.cos(angulo));
                                            a.setY(Math.sin(angulo));
                                            a.setZ(0);
                                            b = new OVecR3();
                                            b.setX(-(Math.sin(angulo)));
                                            b.setY(Math.cos(angulo));
                                            b.setZ(0);
                                            c = new OVecR3();
                                            c.setX(0);
                                            c.setY(0);
                                            c.setZ(1);
                                            x1 = r.productoPunto(a);
                                            y1 = r.productoPunto(b);
                                            z1 = r.productoPunto(c);
                                            System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                            break;
                                        case 4:
                                            System.out.println("Primera matriz");
                                            System.out.println("| X1  Y1  Z1 |");
                                            System.out.println("| X2  Y2  Z2 |");
                                            System.out.println("| X3  Y3  Z3 |");
                                            a = new OVecR3();
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            c = new OVecR3();
                                            c.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                            c.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                            c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                            System.out.println("Segunda matriz");
                                            System.out.println("| X1  Y1  Z1 |");
                                            System.out.println("| X2  Y2  Z2 |");
                                            System.out.println("| X3  Y3  Z3 |");
                                            OVecR3 d = new OVecR3();
                                            OVecR3 e = new OVecR3();
                                            OVecR3 f = new OVecR3();
                                            d.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            e.setX(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            f.setX(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));

                                            d.setY(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            e.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            f.setY(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));

                                            d.setZ(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                            e.setZ(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                            f.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));

                                            Double X1 = a.productoPunto(d);
                                            Double Y1 = a.productoPunto(e);
                                            Double Z1 = a.productoPunto(f);
                                            Double X2 = b.productoPunto(d);
                                            Double Y2 = b.productoPunto(e);
                                            Double Z2 = b.productoPunto(f);
                                            Double X3 = c.productoPunto(d);
                                            Double Y3 = c.productoPunto(e);
                                            Double Z3 = c.productoPunto(f);

                                            System.out.println( "|"+X1+" "+Y1+" "+Z1+"|");
                                            System.out.println( "|"+X2+" "+Y2+" "+Z2+"|");
                                            System.out.println( "|"+X3+" "+Y3+" "+Z3+"|");

                                            break;
                                        case 5:
                                            System.out.println("Ingrese la matriz matriz");
                                            System.out.println("| X1  Y1  Z1 |");
                                            System.out.println("| X2  Y2  Z2 |");
                                            System.out.println("| X3  Y3  Z3 |");
                                            a = new OVecR3();
                                            b = new OVecR3();
                                            c = new OVecR3();
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            b.setX(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            c.setX(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));

                                            a.setY(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            c.setY(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));

                                            a.setZ(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                            c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));

                                            OVecR3 g = new OVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            g.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            g.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            g.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            double h = g.productoPunto(a);
                                            double m = g.productoPunto(b);
                                            double j = g.productoPunto(c);
                                            System.out.println("El resultado es: ("+h+", "+m+", "+j+")\n");
                                            break;
                                        case 6:
                                            System.out.println("Primera matriz");
                                            System.out.println("| X1  Y1  Z1 |");
                                            System.out.println("| X2  Y2  Z2 |");
                                            System.out.println("| X3  Y3  Z3 |");
                                            a = new OVecR3();
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            c = new OVecR3();
                                            c.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                            c.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                            c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                            System.out.println("Segunda matriz");
                                            System.out.println("| X1  Y1  Z1 |");
                                            System.out.println("| X2  Y2  Z2 |");
                                            System.out.println("| X3  Y3  Z3 |");
                                            d = new OVecR3();
                                            e = new OVecR3();
                                            f = new OVecR3();
                                            d.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            d.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            d.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));

                                            e.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            e.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            e.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));

                                            f.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                            f.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                            f.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                            OVecR3 X4 = a.suma(d);
                                            OVecR3 Y4 = b.suma(e);
                                            OVecR3 Z4 = c.suma(f);
                                            System.out.println( "|"+X4.getX()+" "+X4.getY()+" "+X4.getZ()+"|");
                                            System.out.println( "|"+Y4.getX()+" "+Y4.getY()+" "+Y4.getZ()+"|");
                                            System.out.println( "|"+Z4.getX()+" "+Z4.getY()+" "+Z4.getZ()+"|");

                                            break;
                                        case 7:
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            System.out.println("Ingrese la matriz");
                                            System.out.println("| X1  Y1  Z1 |");
                                            System.out.println("| X2  Y2  Z2 |");
                                            System.out.println("| X3  Y3  Z3 |");
                                            a = new OVecR3();
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new OVecR3();
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            c = new OVecR3();
                                            c.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                            c.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                            c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                            X4 = a.escalarPorVector(alpha);
                                            Y4 = b.escalarPorVector(alpha);
                                            Z4 = c.escalarPorVector(alpha);
                                            System.out.println( "|"+X4.getX()+" "+X4.getY()+" "+X4.getZ()+"|");
                                            System.out.println( "|"+Y4.getX()+" "+Y4.getY()+" "+Y4.getZ()+"|");
                                            System.out.println( "|"+Z4.getX()+" "+Z4.getY()+" "+Z4.getZ()+"|");
                                            break;
                                    }
                                } while (y != 8);
                                break;
                            case 3:do {
                                System.out.println("ingrese la oprecion que desea realizar");
                                System.out.println("\n1. Multiplicacion\n2. Columna * Matriz\n3. Suma\n4. Escalar * Matriz\n5. Regresar");
                                y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                switch (y){
                                    case 1:
                                        System.out.println("Primera matriz");
                                        System.out.println("| X1  Y1  Z1  W1|");
                                        System.out.println("| X2  Y2  Z2  W2|");
                                        System.out.println("| X3  Y3  Z3  W3|");
                                        System.out.println("| X4  Y4  Z4  W4|");
                                        OVecR4 a = new OVecR4();
                                        a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                        OVecR4 b = new OVecR4();
                                        b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                        b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                        b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                        b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                        OVecR4 c = new OVecR4();
                                        c.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                        c.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                        c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                        c.setW(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));
                                        OVecR4 d = new OVecR4();
                                        d.setX(leerReal(sc, "X4", "Ha ingresado un caracter no valido"));
                                        d.setY(leerReal(sc, "Y4", "Ha ingresado un caracter no valido"));
                                        d.setZ(leerReal(sc, "Z4", "Ha ingresado un caracter no valido"));
                                        d.setW(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));
                                        System.out.println("Segunda matriz");
                                        System.out.println("| X1  Y1  Z1  W1|");
                                        System.out.println("| X2  Y2  Z2  W2|");
                                        System.out.println("| X3  Y3  Z3  W3|");
                                        System.out.println("| X4  Y4  Z4  W4|");
                                        OVecR4 e = new OVecR4();
                                        OVecR4 f = new OVecR4();
                                        OVecR4 g = new OVecR4();
                                        OVecR4 h = new OVecR4();
                                        e.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        f.setX(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        g.setX(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        h.setX(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));

                                        e.setY(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                        f.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                        g.setY(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                        h.setY(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));

                                        e.setZ(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                        f.setZ(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                        g.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                        h.setZ(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));

                                        e.setW(leerReal(sc, "X4", "Ha ingresado un caracter no valido"));
                                        f.setW(leerReal(sc, "Y4", "Ha ingresado un caracter no valido"));
                                        g.setW(leerReal(sc, "Z4", "Ha ingresado un caracter no valido"));
                                        h.setW(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));

                                        Double X1 = a.productoPunto(e);
                                        Double Y1 = a.productoPunto(f);
                                        Double Z1 = a.productoPunto(g);
                                        Double W1 = a.productoPunto(h);
                                        Double X2 = b.productoPunto(e);
                                        Double Y2 = b.productoPunto(f);
                                        Double Z2 = b.productoPunto(g);
                                        Double W2 = b.productoPunto(h);
                                        Double X3 = c.productoPunto(e);
                                        Double Y3 = c.productoPunto(f);
                                        Double Z3 = c.productoPunto(g);
                                        Double W3 = c.productoPunto(h);
                                        Double X4 = d.productoPunto(e);
                                        Double Y4 = d.productoPunto(f);
                                        Double Z4 = d.productoPunto(g);
                                        Double W4 = d.productoPunto(h);

                                        System.out.println( "|"+X1+" "+Y1+" "+Z1+" "+W1+"|");
                                        System.out.println( "|"+X2+" "+Y2+" "+Z2+" "+W2+"|");
                                        System.out.println( "|"+X3+" "+Y3+" "+Z3+" "+W3+"|");
                                        System.out.println( "|"+X4+" "+Y4+" "+Z4+" "+W4+"|");

                                        break;
                                    case 2:
                                        System.out.println("Ingrese la matriz");
                                        System.out.println("| X1  Y1  Z1  W1|");
                                        System.out.println("| X2  Y2  Z2  W2|");
                                        System.out.println("| X3  Y3  Z3  W3|");
                                        System.out.println("| X4  Y4  Z4  W4|");
                                        e = new OVecR4();
                                        f = new OVecR4();
                                        g = new OVecR4();
                                        h = new OVecR4();
                                        e.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        f.setX(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        g.setX(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        h.setX(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));

                                        e.setY(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                        f.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                        g.setY(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                        h.setY(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));

                                        e.setZ(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                        f.setZ(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                        g.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                        h.setZ(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));

                                        e.setW(leerReal(sc, "X4", "Ha ingresado un caracter no valido"));
                                        f.setW(leerReal(sc, "Y4", "Ha ingresado un caracter no valido"));
                                        g.setW(leerReal(sc, "Z4", "Ha ingresado un caracter no valido"));
                                        h.setW(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));

                                        OVecR4 p = new OVecR4();
                                        System.out.println("Ingrese X1, Y1 y Z1");
                                        p.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        p.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        p.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        p.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                        double n = p.productoPunto(e);
                                        double m = p.productoPunto(f);
                                        double j = p.productoPunto(g);
                                        double i = p.productoPunto(h);
                                        System.out.println("El resultado es: ("+n+", "+m+", "+j+", "+i+")\n");
                                        break;
                                    case 3:
                                        System.out.println("Primera matriz");
                                        System.out.println("| X1  Y1  Z1  W1|");
                                        System.out.println("| X2  Y2  Z2  W2|");
                                        System.out.println("| X3  Y3  Z3  W3|");
                                        System.out.println("| X4  Y4  Z4  W4|");
                                        a = new OVecR4();
                                        a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                        b = new OVecR4();
                                        b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                        b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                        b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                        b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                        c = new OVecR4();
                                        c.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                        c.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                        c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                        c.setW(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));
                                        d = new OVecR4();
                                        d.setX(leerReal(sc, "X4", "Ha ingresado un caracter no valido"));
                                        d.setY(leerReal(sc, "Y4", "Ha ingresado un caracter no valido"));
                                        d.setZ(leerReal(sc, "Z4", "Ha ingresado un caracter no valido"));
                                        d.setW(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));
                                        System.out.println("Segunda matriz");
                                        System.out.println("| X1  Y1  Z1  W1|");
                                        System.out.println("| X2  Y2  Z2  W2|");
                                        System.out.println("| X3  Y3  Z3  W3|");
                                        System.out.println("| X4  Y4  Z4  W4|");
                                        e = new OVecR4();
                                        f = new OVecR4();
                                        g = new OVecR4();
                                        h = new OVecR4();
                                        e.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        e.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        e.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        e.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));

                                        f.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                        f.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                        f.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                        f.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));

                                        g.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                        g.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                        g.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                        g.setW(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));

                                        h.setX(leerReal(sc, "X4", "Ha ingresado un caracter no valido"));
                                        h.setY(leerReal(sc, "Y4", "Ha ingresado un caracter no valido"));
                                        h.setZ(leerReal(sc, "Z4", "Ha ingresado un caracter no valido"));
                                        h.setW(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));

                                        OVecR4 a1 = a.suma(e);
                                        OVecR4 b1 = b.suma(f);
                                        OVecR4 c1 = c.suma(g);
                                        OVecR4 d1 = d.suma(h);
                                        System.out.println( "|"+a1.getX()+" "+a1.getY()+" "+a1.getZ()+" "+a1.getW()+"|");
                                        System.out.println( "|"+b1.getX()+" "+b1.getY()+" "+b1.getZ()+" "+b1.getW()+"|");
                                        System.out.println( "|"+c1.getX()+" "+c1.getY()+" "+c1.getZ()+" "+c1.getW()+"|");
                                        System.out.println( "|"+d1.getX()+" "+d1.getY()+" "+d1.getZ()+" "+d1.getW()+"|");
                                        break;

                                    case 4:
                                        double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                        System.out.println("Ingrese la matriz");
                                        System.out.println("| X1  Y1  Z1  W1|");
                                        System.out.println("| X2  Y2  Z2  W2|");
                                        System.out.println("| X3  Y3  Z3  W3|");
                                        System.out.println("| X4  Y4  Z4  W4|");
                                        a = new OVecR4();
                                        a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                        a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                        a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                        a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                        b = new OVecR4();
                                        b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                        b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                        b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                        b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                        c = new OVecR4();
                                        c.setX(leerReal(sc, "X3", "Ha ingresado un caracter no valido"));
                                        c.setY(leerReal(sc, "Y3", "Ha ingresado un caracter no valido"));
                                        c.setZ(leerReal(sc, "Z3", "Ha ingresado un caracter no valido"));
                                        c.setW(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));
                                        d = new OVecR4();
                                        d.setX(leerReal(sc, "X4", "Ha ingresado un caracter no valido"));
                                        d.setY(leerReal(sc, "Y4", "Ha ingresado un caracter no valido"));
                                        d.setZ(leerReal(sc, "Z4", "Ha ingresado un caracter no valido"));
                                        d.setW(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));

                                        a1 = a.escalarPorVector(alpha);
                                        b1 = b.escalarPorVector(alpha);
                                        c1 = c.escalarPorVector(alpha);
                                        d1 = d.escalarPorVector(alpha);
                                        System.out.println( "|"+a1.getX()+" "+a1.getY()+" "+a1.getZ()+" "+a1.getW()+"|");
                                        System.out.println( "|"+b1.getX()+" "+b1.getY()+" "+b1.getZ()+" "+b1.getW()+"|");
                                        System.out.println( "|"+c1.getX()+" "+c1.getY()+" "+c1.getZ()+" "+c1.getW()+"|");
                                        System.out.println( "|"+d1.getX()+" "+d1.getY()+" "+d1.getZ()+" "+d1.getW()+"|");
                                        break;
                                }
                            }while (y!=5);
                                break;
                        }
                    }while (z!=4);
                    break;

            }

        }    while (x!=3);

    }
    public static double leerReal(Scanner sc,String mensaje, String mensajeError) {
        double retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextDouble();
        sc.nextLine();
        return retval;
    }

    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }
}


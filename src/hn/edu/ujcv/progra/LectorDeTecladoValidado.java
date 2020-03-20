package hn.edu.ujcv.progra;


import java.util.Scanner;
public class LectorDeTecladoValidado {
    private static LectorDeTecladoValidado instance;
    private Scanner sc;

    public static LectorDeTecladoValidado getInstance(){
        if(instance == null){
            instance = new LectorDeTecladoValidado();
        }
        return instance;
    }

    private LectorDeTecladoValidado(){
        sc = new Scanner(System.in);
    }

    public double getDouble(String mensaje, String reintento){

        System.out.println(mensaje);
        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextDouble();

    }

    public double getDouble(String reintento){

        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextDouble();

    }

    public int getInteger(String mensaje, String reintento){

        System.out.println(mensaje);
        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextInt();

    }

    public int getInteger( String reintento){

        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextInt();

    }

}

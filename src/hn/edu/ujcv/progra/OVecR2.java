package hn.edu.ujcv.progra;

public class OVecR2 {
    private double x;
    private double y;

    public OVecR2(){
        this.x = 0;
        this.y = 0;
    }
    public OVecR2(double x, double y){
        this.x = x;
        this.y = y;
    }
    public OVecR2(OVecR2 b){
        this.x = b.x;
        this.y = b.y;
    }

    // Metodos
    public OVecR2 suma(OVecR2 b){
        OVecR2 a1 = new OVecR2();
        a1.x = x + b.x;
        a1.y = y + b.y;
        return a1;
        //TODO: implementar
    }

    public OVecR2 resta(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        return a1;
    }

    //producto.
    public  OVecR2 escalarPorVector(double alpha){
        OVecR2 a1 = new OVecR2();
        a1.x = alpha * x;
        a1.y = alpha *y;
        return a1;
    }

    public double productoPunto(OVecR2 b){
        OVecR2 a1 = new OVecR2();
        a1.x = x * b.x;
        a1.y = y * b.y;
        double a = a1.x + a1.y;
        return a;
        //TODO: implementar

    }
    public double angulo(OVecR2 b){
        OVecR2 a1 = new OVecR2();
        a1.x = x * b.x;
        a1.y = y * b.y;
        double a = a1.x + a1.y;
        double c = Math.sqrt(((Math.pow(b.x,2)+Math.pow(b.y,2))));
        double f = Math.sqrt(((Math.pow(x,2)+Math.pow(y,2))));
        double d = Math.toDegrees(Math.acos((a/(c*f))));
        //TODO: implementar
        return d;
    }

    public double magnitud(OVecR2 b){
        OVecR2 a1 = new OVecR2();
        a1.x = (b.x) - x;
        a1.y = (b.y) - y;
        double a = Math.pow(a1.x, 2) + Math.pow(a1.y,2);
        return Math.sqrt(a);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


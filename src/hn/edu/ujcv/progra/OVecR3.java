package hn.edu.ujcv.progra;

public class OVecR3 {
    private double x;
    private double y;
    private double z;

    public OVecR3(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public OVecR3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public OVecR3(OVecR3 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public OVecR3 suma(OVecR3 b){
        OVecR3 a1 = new OVecR3();
        a1.x = x + b.x;
        a1.y = y + b.y;
        a1.z = z + b.z;
        return a1;
        //TODO: implementar

    }

    public OVecR3 resta(OVecR3 b){
        OVecR3 a1 = new OVecR3();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        a1.z = z - (b.z);
        return a1;
        //TODO: implementar

    }

    //producto.
    public  OVecR3 escalarPorVector(double alpha){
        OVecR3 a1 = new OVecR3();
        a1.x = alpha * x;
        a1.y = alpha * y;
        a1.z = alpha * z;
        return a1;
    }

    public double productoPunto(OVecR3 b){
        //TODO: implementar
        OVecR3 a1 = new OVecR3();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        double a = a1.x + a1.y + a1.z ;
        return a;
    }



    public OVecR3 productoCruz(OVecR3 b){
        OVecR3 a1 = new OVecR3();
        a1.x = (b.z*y)-(b.y*z);
        a1.y = (b.x*z)-(b.z*x);
        a1.z = (b.y*x)-(b.x*y);
        return a1;
    }

    public double angulo(OVecR3 b){
        OVecR3 a1 = new OVecR3();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        double a = a1.x + a1.y + a1.z ;
        double c = Math.sqrt(((Math.pow(b.x,2)+Math.pow(b.y,2)+Math.pow(b.z,2))));
        double f = Math.sqrt(((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2))));
        double d = Math.acos((a/(c*f)));
        //TODO: implementar
        return d;
    }

    public double magnitud(OVecR3 b){
        OVecR3 a1 = new OVecR3();
        a1.x = (b.x) - x;
        a1.y = (b.y) - y;
        a1.z = (b.z) - z;
        double a = Math.pow(a1.x, 2) + Math.pow(a1.y,2) + Math.pow(a1.z,2);
        return Math.sqrt(a);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


}

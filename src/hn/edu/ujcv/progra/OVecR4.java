package hn.edu.ujcv.progra;

public class OVecR4 {
    private double x;
    private double y;
    private double z;
    private double w;

    public OVecR4(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }
    public OVecR4(double x, double y, double z, double w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    public OVecR4(OVecR4 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
        this.w = b.w;
    }
    public OVecR4 suma(OVecR4 b){
        OVecR4 a1 = new OVecR4();
        a1.x = x + b.x;
        a1.y = y + b.y;
        a1.z = z + b.z;
        a1.w = w + b.w;
        return a1;
        //TODO: implementar

    }

    public OVecR4 resta(OVecR4 b){
        OVecR4 a1 = new OVecR4();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        a1.z = z - (b.z);
        a1.w = w - (b.w);
        return a1;
        //TODO: implementar

    }

    //producto.
    public  OVecR4 escalarPorVector(double alpha){
        OVecR4 a1 = new OVecR4();
        a1.x = alpha * x;
        a1.y = alpha * y;
        a1.z = alpha * z;
        a1.w = alpha * w;
        return a1;
    }

    public double productoPunto(OVecR4 b){
        OVecR4 a1 = new OVecR4();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        a1.w = w * b.w;
        double a = a1.x + a1.y + a1.z + a1.w;
        return a;
        //TODO: implementar

    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}


    public double angulo(OVecR4 b){
        OVecR4 a1 = new OVecR4();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        a1.w = w * b.w;
        double a = a1.x + a1.y + a1.z + a1.w;
        double c = Math.sqrt(((Math.pow(b.x,2)+Math.pow(b.y,2)+Math.pow(b.z,2)+Math.pow(b.w,2))));
        double f = Math.sqrt(((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+Math.pow(w,2))));
        double d = Math.acos((a/(c*f)));
        //TODO: implementar
        return d;
    }

    public double magnitud(OVecR4 b){
        OVecR4 a1 = new OVecR4();
        a1.x = (b.x) - x;
        a1.y = (b.y) - y;
        a1.z = (b.z) - z;
        a1.w = (b.w) - w;
        double a = Math.pow(a1.x, 2) + Math.pow(a1.y,2) + Math.pow(a1.z,2) + Math.pow(a1.w,2);
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

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}

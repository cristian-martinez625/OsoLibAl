package hn.edu.ujcv.progra;

import hn.edu.ujcv.progra.OVecR2;
public class OMat2x2 {
    private OVecR2 colX;
    private OVecR2 colY;


    public OMat2x2(){
        colX = new OVecR2(1,0);
        colY = new OVecR2(0,1);
    }

    public OMat2x2(OVecR2 colX, OVecR2 colY){
        this.colX = new OVecR2(colX);
        this.colY = new OVecR2(colY);
    }

    public OMat2x2(OMat2x2 b){
        this.colX = new OVecR2(b.colX);
        this.colY = new OVecR2(b.colY);
    }

    public OMat2x2 mul(OMat2x2 b){
        OMat2x2 retval = new OMat2x2();
        retval.setColX(new OVecR2(this.getFilaX().productoPunto(b.colX), this.getFilaY().productoPunto(b.colX)));
        retval.setColY(new OVecR2(this.getFilaX().productoPunto(b.colY),this.getFilaY().productoPunto(b.colY)));
        return retval;
    }


    public OVecR2 colXMat(OVecR2 fila){
        OVecR2 retval = new OVecR2();
        retval.setX(fila.productoPunto(this.getFilaX()));
        retval.setY(fila.productoPunto(this.getFilaY()));
        return retval;
    }

    public OMat2x2 suma (OMat2x2 b){
        OMat2x2 retval = new OMat2x2();
        retval.setColX(this.colX.suma(b.colX));
        retval.setColY(this.colY.suma(b.colY));
        return retval;}

    public OMat2x2 resta (OMat2x2 b){
        OMat2x2 retval = new OMat2x2();
        retval.setColX(this.colX.resta(b.colX));
        retval.setColY(this.colY.resta(b.colY));
        return retval;}

    public OMat2x2 escalarXmat(double escalar){
        OMat2x2 retval = new OMat2x2();
        retval.colX.setX(this.colX.getX() * escalar);
        retval.colX.setY(this.colX.getY() * escalar);
        retval.colY.setX(this.colY.getX() * escalar);
        retval.colY.setY(this.colY.getY() * escalar);
        return retval;
    }
    public OVecR2 rot (double angulo, OVecR2 fila){
        OVecR2 retval = new OVecR2();
        retval.setX(fila.productoPunto(this.getFilaX()));
        retval.setY(fila.productoPunto(this.getFilaY()));
        return retval;
        //todo: por hacer
    }

    public OVecR2 getColX() {
        return colX;
    }

    public void setColX(OVecR2 colX) {
        this.colX = colX;
    }

    public OVecR2 getColY() {
        return colY;
    }

    public void setColY(OVecR2 colY) {
        this.colY = colY;
    }

    public OVecR2 getFilaX(){
        return new OVecR2(colX.getX(),colY.getX());
    }
    public OVecR2 getFilaY(){
        return new OVecR2(colX.getY(),colY.getY());
    }


}

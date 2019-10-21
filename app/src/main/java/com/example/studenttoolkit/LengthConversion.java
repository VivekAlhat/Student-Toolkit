package com.example.studenttoolkit;

import java.text.NumberFormat;

public class LengthConversion {

    //Constant variables for unit comparision and conversion
    //the base unit reference will be 1 meter

    final double meter = 1;
    final double centimeter = 100;
    final double kilometer = 0.001;
    final double inch = 39.37;
    final double feet = 3.281;
    final double mile = 0.0006214;
    final double millimeter = 1000;
    final double yard = 1.093613;

    //variables for inputData and outputData

    double beginningQty;
    double endingQty;
    String beginningUnitType;
    String endingUnitType;

    public LengthConversion(){

        beginningQty = 0;
        endingQty = 0;
        beginningUnitType = "";
        endingUnitType = "";
    }

    public double getMeter() {
        return meter;
    }

    public double getCentimeter() {
        return centimeter;
    }

    public double getKilometer() {
        return kilometer;
    }

    public double getInch() {
        return inch;
    }

    public double getFeet() {
        return feet;
    }

    public double getMile() {
        return mile;
    }

    public double getMillimeter() {
        return millimeter;
    }

    public double getYard() {
        return yard;
    }

    public double getBeginningQty() {
        return beginningQty;
    }

    public void setBeginningQty(double beginningQty) {
        this.beginningQty = beginningQty;
    }

    public double getEndingQty() {
        return endingQty;
    }

    public void setEndingQty(double endingQty) {
        this.endingQty = endingQty;
    }

    public String getBeginningUnitType() {
        return beginningUnitType;
    }

    public void setBeginningUnitType(String beginningUnitType) {
        this.beginningUnitType = beginningUnitType;
    }

    public String getEndingUnitType() {
        return endingUnitType;
    }

    public void setEndingUnitType(String endingUnitType) {
        this.endingUnitType = endingUnitType;
    }

     public double getUnitTypeConstant(String unitType){

         if (unitType == "meter"){return meter;}
         if (unitType == "centimeter"){return centimeter;}
         if (unitType == "kilometer"){return kilometer;}
         if (unitType == "inch"){return inch;}
         if (unitType == "feet"){return feet;}
         if (unitType == "mile"){return mile;}
         if (unitType == "millimeter"){return millimeter;}
         if (unitType == "yard"){return yard;}
         return 0;
     }

     public double calculateEndingQty(){

        double beginningQty = getBeginningQty();
        double endingQty = getEndingQty();
        double beginningUnitType = getUnitTypeConstant(getBeginningUnitType());
        double endingUnitType = getUnitTypeConstant(getEndingUnitType());

         //convert to meters
         endingQty = ( meter / beginningUnitType ) ;

         //convert from meter
         endingQty = ( endingQty * endingUnitType );

         //multiply by initial quantity to get final quantity
         endingQty = ( endingQty * beginningQty );

         return endingQty;

     }

     public String toString(){
        NumberFormat number = NumberFormat.getNumberInstance();

        if (endingUnitType.equals("inch") || endingUnitType.equals("feet") || endingUnitType.equals("yard")){
            //format the maximum significant figures to two places
            number.setMaximumFractionDigits(2);
        }
        else {
            //format the maximum significant figures to four places
            number.setMaximumFractionDigits(4);
        }

        return ( "Result : " + number.format(getEndingQty()) + " " + getEndingUnitType() );
     }


}


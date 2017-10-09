package com.company.shape;

/**
 * Created by Nabeel on 10/3/2017.
 */
public class Shape {

    public static final Integer CANVAS = 300;
    private String shapeType;

    public Shape() { this.shapeType = null; }

    public String getShapeType(String shapeType) {

        this.setShapeType(shapeType);
        String tempShapeType = getShapeType();

        if(tempShapeType != null) {

            switch (tempShapeType) {
                // return work same like break.
                case "triangle":
                    return getShapeType();
                case "square":
                    return getShapeType();
                case "circle":
                    return getShapeType();
                default: 
                    return "Wrong input Enter";
            }

        }else {
            return "You set wrong input";
        }
    }

    public String getShapeType() { return shapeType; }

    public void setShapeType(String shapeType) {

        if(shapeType != null){
            this.shapeType = shapeType.toLowerCase();
        }
    }
}

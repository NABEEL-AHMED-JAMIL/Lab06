package com.company.color;

/**
 * Created by Nabeel on 10/3/2017.
 */
public class Color {

    private String colorType;

    public Color() { this.colorType = null; }

    public java.awt.Color getColorType(String colorType) {

        this.setColorType(colorType);
        String tempColorType = getColorType();

        if(tempColorType != null) {

            switch (tempColorType) {
                case "red":
                    // return work same like break.
                    return java.awt.Color.red;
                case "green":
                    return java.awt.Color.red;
                case "yellow":
                    return java.awt.Color.red;
                case "blue":
                    return java.awt.Color.red;
                default:
                    return java.awt.Color.black;
            }

        }else {
            return java.awt.Color.black;
        }
    }

    public String getColorType() { return colorType; }

    public void setColorType(String colorType) {

        if(colorType != null){
            this.colorType = colorType.toLowerCase();
        }
    }
}

package com.company;

import com.company.builder.cheif.Male;
import com.company.builder.cheif.MealBuilder;
import com.company.builderTwo.Cd;
import com.company.builderTwo.CdBuilder;
import com.company.color.Color;
import com.company.draw.DrawPanel;
import com.company.shape.Shape;
import javax.swing.*;
import java.awt.*;

import static com.company.shape.Shape.CANVAS;

public class Main extends JFrame {

//    public static void main(String[] args) {
//	// write your code here
//        Shape shape = new Shape();
//        Color color = new Color();
//        String shapeType = shape.getShapeType("circle");
//        String colorType = color.getColorType("red");
//        System.out.println("Color Type: " + colorType + " Shape Type: " + shapeType + " Canvs: " + CANVAS);
//    }

//    public Main() {
//        initUI();
//    }

//    private void initUI() {
//
//        DrawPanel dpnl = new DrawPanel();
//        add(dpnl);
//        setSize(350, 250);
//        setTitle("Points");
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }


    static {
        System.out.println("Total Cost: " + " Static 3");
    }

    static {
        System.out.println("Total Cost: " + " Static 2");
    }

    static {
        System.out.println("Total Cost: " + " Static 4");
    }

    public static void main(String[] args) {

//        EventQueue.invokeLater(() -> {
//            Main ex = new Main();
//            ex.setVisible(true);
//        });\

        System.out.println("Total Cost: " + " Static 1");

        MealBuilder mealBuilder = new MealBuilder();
        Male vegMeal =mealBuilder.getVegBurger();
        //
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        CdBuilder cdBuilder = new CdBuilder();
        Cd panoSonic = cdBuilder.getPanaSonic();
        System.out.println("Cd Name: " + panoSonic.pack());
        System.out.println("Total Cost: " + panoSonic.price());

        int rows = 5;

        for(int i = 0, k = 0; i <= rows; i++, k = 0)
        {
            for(int space = 0; space <= rows-i; ++space)
            {
                System.out.print("  ");
            }

            while(k <= 2*i-2)
            {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }



    }
}

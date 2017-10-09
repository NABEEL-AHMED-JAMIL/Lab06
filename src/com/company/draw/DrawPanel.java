package com.company.draw;


import com.company.color.Color;
import com.company.shape.Shape;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;

import static com.company.shape.Shape.CANVAS;


/**
 * Created by Nabeel on 10/3/2017.
 */
public class DrawPanel extends JPanel {

    private com.company.color.Color color = new Color();
    private com.company.shape.Shape shape = new Shape();
    private Scanner scanner = new Scanner(System.in);
    private String shpeType;
    // this is jwt color
    private java.awt.Color jwtColor;
    // used the scanner ---> by creating the method below
    private void userValue() {
        System.out.println("Enter the Shape type");
        this.shpeType = this.shape.getShapeType(this.scanner.next());
        System.out.println("Etner the Color Type");
        this.jwtColor = this.color.getColorType(this.scanner.next());
    }

    private void doDrawing(Graphics g) {

        Ellipse2D.Double circle = new Ellipse2D.Double(500, 250, CANVAS, CANVAS);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.jwtColor);
        g2d.fill(circle);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        // method of input call here under the loop
        doDrawing(g);

    }
}

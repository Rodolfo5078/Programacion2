/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz22;

import java.util.Scanner;

/**
 *
 * @author Prueba
 */
public class Main {


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ancho del rectángulo: ");
            int ancho = scanner.nextInt();
            System.out.print("Ingrese la altura del rectángulo: ");
            int altura = scanner.nextInt();

            Rectangulo rectangulo = new Rectangulo();
            rectangulo.setAncho(ancho);
            rectangulo.setAltura(altura);

            int area = rectangulo.calcularArea();

            System.out.println("El área del rectángulo es: " + area);
        } catch (RectanguloException e) {
            System.out.println("Error en el rectángulo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}







package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Circle;
import entites.Rectangle;
import entites.Shape;
import entites.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		Shape shape;
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or cicle (r/c)? ");
			char letra = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			Color color = Color.valueOf(sc.next());
			if (letra == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();

				shape = new Rectangle(color, width, height);
				list.add(shape);
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shape = new Circle(color, radius);
				list.add(shape);
			}
		}

		sc.close();
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape c : list) {
			System.out.println(String.format("%.2f",c.area()));
		}
	}

}

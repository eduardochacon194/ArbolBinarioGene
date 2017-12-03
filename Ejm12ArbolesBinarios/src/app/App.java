package app;

import Escuela.Alumno;
import btree.btree;
import node.node;

public class App {

	public static void main(String[] args) {
		btree<Integer> numeritos = new btree<Integer>();
		numeritos.add(-1);
		numeritos.add(-2);
		numeritos.add(-3);
		numeritos.add(-4);
		numeritos.add(-5);
		numeritos.add(-7);
		numeritos.add(4);
		numeritos.add(24);
		numeritos.add(-6);
		numeritos.add(5);
		numeritos.add(9);
		numeritos.add(10);
		numeritos.add(30);
		numeritos.add(35);
		numeritos.add(27);
		System.out.println("--------------Print In Order------------");
		numeritos.printInorder();
		System.out.println("--------------Print Order------------");
		numeritos.printPreorder();
		System.out.println("--------------Print PosOrder------------");
		numeritos.printPostOrder();
		System.out.println("-------------- Max Depth------------");
		System.out.println(numeritos.maxDepth());
		System.out.println("-------------- Min Depth------------");
		System.out.println(numeritos.minDepth());
		System.out.println("-------------- Min Y Max Search------------");
		numeritos.minSearch();
		numeritos.maxSearch();
		System.out.println("-------------- Niveles------------");
		numeritos.breadthSearch();
		System.out.println("                                  ");
		System.out.println("-------------- Esta Vacio------------");
		System.out.println(numeritos.isEmpty());
		System.out.println("-------------- Existe------------");
		System.out.println(numeritos.exists(9));
		System.out.println("-------------- Eliminar------------");
		//numeritos.remove(9);
		System.out.println("-------------- Limpiar------------");
		//numeritos.clear();
	}

}

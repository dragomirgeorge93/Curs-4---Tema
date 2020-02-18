package main;

public class TestAnimal {

	public static void main(String[] args) {
		Animal rabbit = new Animal("rabbit","black",1);
		Animal cat = new Animal("cat");
		Animal goat = new Animal();
		
		System.out.println(" My first animal was a " + rabbit.getTipAnimal() + ", " + rabbit.getCuloare() + " color ," + " and "+ rabbit.getVarsta() + " years old.");
		System.out.println();
		
		cat.setCuloare("white");
		System.out.println(" My second animal was a " + cat.getTipAnimal());
		System.out.println(" The second animal had " + cat.getCuloare() + " color");
		System.out.println();
		
		System.out.println(" The first animal was a " + goat.getTipAnimal() + ",and he had a " + goat.getCuloare() + " color ," + " and "+ goat.getVarsta() + " years old.");
		goat.setTipAnimal("goat");
		goat.setCuloare("brown");
		goat.setVarsta(2);
		System.out.println(" The first animal was a " + goat.getTipAnimal() + ",and he had a " + goat.getCuloare() + " color ," + " and "+ goat.getVarsta() + " years old.");
		
	}

}
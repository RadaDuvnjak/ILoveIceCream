package com.test.java.eight;

import java.util.ArrayList;

public class VanillaIceCream {
	private ArrayList<Topping> toppings;
	private int numberOfScoops;
	
	/**
	 * Create a new VanillaIceCream 
	 */
	public VanillaIceCream() {
		
	}
	
	/**
	 * Specify how to make the vanilla ice cream
	 */
	public void customizeVanillaIceCream(ArrayList<Topping> toppings, int numberOfScoops) {
		System.out.println("Order Confirmation: ");
		System.out.println("\nOne vanilla ice cream with " + numberOfScoops + " scoops and " + "the following toppings: ");
		System.out.println("\n" + toppings);
	}

	/**
	 * @return the topping
	 */
	public ArrayList<Topping> getToppings() {
		return toppings;
	}

	/**
	 * @param toppings the topping to set
	 */
	public void setToppings(ArrayList<Topping> toppings) {
		this.toppings = toppings;
	}

	/**
	 * @return the numberOfScoops
	 */
	public int getNumberOfScoops() {
		return numberOfScoops;
	}

	/**
	 * @param numberOfScoops the numberOfScoops to set
	 */
	public void setNumberOfScoops(int numberOfScoops) {
		this.numberOfScoops = numberOfScoops;
	}
	
	public static void main(String[] args) {
		//create a custom vanilla ice cream for fun
		VanillaIceCream vic = new VanillaIceCream();
		ArrayList<Topping> toppings = new ArrayList<>();
		toppings.add(Topping.CHOCOLATE_CANDY);
		toppings.add(Topping.KIT_KATS);
		vic.customizeVanillaIceCream(toppings, 2);
	}
}

package com.language.programming.model;

public class Screen {

    public static void promptItem(Item item) {
        System.out.println(item.getBarcode() + "\ncode: " + item.getCode() + "\n" + item.getIcon() + " "
                + item.getName() + "\n\t  $ " + item.getPrice().toString() + "\n-------------------\n");
    }

    public static void promptBanner() {
        System.out.println("╔═╗┌─┐┌─┐┬ ┬┬┌─┐┬─┐\n" + "║  ├─┤└─┐├─┤│├┤ ├┬┘\n" + "╚═╝┴ ┴└─┘┴ ┴┴└─┘┴└─\n");
    }

    public static void promptTotal(Float total) {
        System.out.println("\tTOTAL $" + total.toString());

    }

}

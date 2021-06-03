public class Main {

	public static void main(String[] args) {
		// System.out.println("Instantiate objects here!");

		// Instantiate melon type objects and add to array
		MelonType musk = new MelonType("musk", "Muskmelon", 1998, "green", true, true);
		MelonType cas = new MelonType("cas", "Casaba", 2003, "orange", true, false);
		MelonType cren = new MelonType("cren", "Crenshaw", 1996, "green", true, false);
		MelonType yw = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", true, true);

		MelonType[] allMelonTypes = {musk, cas, cren, yw};
		// System.out.println(allMelonTypes);

		// Instantiate melon objects and add to array
		Melon melon1 = new Melon(allMelonTypes[3], 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(allMelonTypes[3], 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(allMelonTypes[1], 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(allMelonTypes[2], 8, 9, 35, "Michael");
		Melon melon5 = new Melon(allMelonTypes[2], 8, 2, 35, "Michael");
		Melon melon6 = new Melon(allMelonTypes[0], 6, 7, 4, "Michael");
		Melon melon7 = new Melon(allMelonTypes[3], 7, 10, 3, "Sheila");

		Melon[] allMelons = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};
		// System.out.println(allMelons);

		getSellabilityReport(allMelons);

	}

	// method to print sellability report
	public static void getSellabilityReport(Melon[] melons) {
		System.out.println("\n******PRINTING SELLABILITY REPORT******");
		for (int i=0; i<melons.length; i++) {
			String harvester = melons[i].harvester;
			int field = melons[i].field;
			String sellable;
			
			if (melons[i].isSellable() == true) {
				sellable = "(CAN BE SOLD)";
			} else {
				sellable = "(NOT SELLABLE)";
			}

			String msg = String.format("Harvested by %s from Field %d %s", harvester, field, sellable);

			System.out.println(msg);
		}
		System.out.println("\n");
		
	}

}

package de.litigame.hotbar;

import java.util.ArrayList;
import java.util.List;

import de.litigame.items.Item;

public class Hotbar {

	public final static int SLOTS = 9;
	private final List<Item> items = new ArrayList<>();
	private int selectedSlot = 0;

	public void addToPosition(int shift) {
		selectedSlot += shift;
		checkBounds();
	}

	private void checkBounds() {
		if (selectedSlot < 0) selectedSlot = 0;
		else if (selectedSlot >= SLOTS) selectedSlot = SLOTS - 1;
	}

	public Item getSelectedItem() {
		return items.get(selectedSlot);
	}

	public void setToSlot(int slot) {
		selectedSlot = slot;
		checkBounds();
	}
}

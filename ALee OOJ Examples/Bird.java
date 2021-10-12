package aLee;

public class Bird { // class is the blueprint for an object

	private String size;

	public void setSize(String newSize) {
		size = newSize;
	}

	public String getSize() {

		return size;
	}

}

// PUBLIC, PRIVATE, AND PROTECTED ARE 3 DIFFERENT TYPES OF
// "ACCESS MODIFIERS"
// PUBLIC CAN BE USED, PRIVATE CANNOT BE USED IN OTHER CLASSES
// PROTECTED CAN BE USED IF IN THE SAME PACKAGE AND SUBCLASS
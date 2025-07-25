package tasksjavafundamentals.task11;



public class Task2StringBuffer {
	
	public static void main(String[] args) {
		
		// Create StringBuffer and append a sentence
        StringBuffer sb = new StringBuffer();
        sb.append("Java is fun to learn.");
        System.out.println("After append: " + sb);

        // Insert a word at a specific position
        sb.insert(8, "really ");
        System.out.println("After insert: " + sb);

        // Delete a portion (e.g., delete "fun ")
        sb.delete(15, 19);  // indexes of "fun "
        System.out.println("After delete: " + sb);
		
	}

}

package tasksjavafundamentals.task11;



public class Task3StrPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test with String
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + " ms");

        // Test with StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");

        // Test with StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sbd.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");

	}

}

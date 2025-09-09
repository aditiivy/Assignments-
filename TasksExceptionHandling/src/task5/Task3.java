package task5;


class Task3 {

    // Method that throws exception if age is less than 18
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above to vote.");
        } else {
            System.out.println("Age is valid. You can vote.");
        }
    }

    public static void main(String[] args) {
        try {
            int age = 16;  // you can change this value to test different cases
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


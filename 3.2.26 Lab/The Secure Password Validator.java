class PasswordValidator {
    public static void main(String[] args) {

        String password = "Hello@123";

        boolean hasUpper = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpper = true;
                }

                if (password.contains("@") || password.contains("#") || password.contains("$")) {
                    hasSpecial = true;
                }
            }

            if (hasUpper && hasSpecial) {
                System.out.println("Password is Secure");
                System.out.println("Masked Password: " + "*".repeat(password.length()));
            } else {
                System.out.println("Password is NOT Secure");
            }

        } else {
            System.out.println("Password is too short");
        }
    }
}

/*
Output:
Password is Secure
Masked Password: *********
*/

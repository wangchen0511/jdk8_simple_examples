package functionalInterface.examples;

public class SuperTokenValidator {

    public static boolean isTokenValid(String token) {
        return token.length() == 9;
    }
    
}

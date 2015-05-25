package functionalInterface.examples;

import java.util.HashSet;
import java.util.Set;

public class TokenPools {

    private final TokenValidator validator;
    private Set<String> tokenPools = new HashSet<>();
    
    public TokenPools(final TokenValidator validator) {
        this.validator = validator;
    }
    
    public boolean addNewToken(String token) {
        if(validator.isValid(token)) {
            tokenPools.add(token);
            System.out.println("Valid token " + token);
            return true;
        }
        System.out.println("Invalid token " + token);
        return false;
    }
    
    public static void main(String[] args) {
        /*
        TokenValidator validator = new TokenValidator(){
            return a.length() == 8;
        };
        */
        TokenValidator validator = (a) -> {return a.length() == 8;};
        TokenPools pool = new TokenPools(validator);
        
        pool.addNewToken("12345678");
        pool.addNewToken("123456789");
        
        //Method reference
       
        TokenValidator validator1 = SuperTokenValidator::isTokenValid;
        TokenPools pool1 = new TokenPools(validator1);
        
        pool1.addNewToken("12345678");
        pool1.addNewToken("123456789");
       
    }
    
}

package rutkowski.kamil;

import rutkowski.kamil.invite.Invite;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.List;
import java.util.Arrays;

public class InviteTest {
    private static List<int[]> goersLists() {

        int[] goersList1 = {};
        int[] goersList2 = {-1};
        int[] goersList3 = new int[51];

        for(int i=0;i<goersList3.length;i++){
            goersList3[i] = 1;
        }

        return Arrays.asList(goersList1,goersList2,goersList3);
    }

    @ParameterizedTest
    @MethodSource("goersLists")
    public void testInputArraySize(int[] listOfGoers){
        
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> Invite.inviteMoreWomen(listOfGoers));

        String excMsg = exception.getMessage();
        assert excMsg != null : "Exception message should not be null"; 

        String msg = "Exception message should contain the word \"length\"";
        assert excMsg.toLowerCase().contains("length") : msg;
    }

    @ParameterizedTest
    @NullSource
    public void testInputForNull(int[] listOfGoers){

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> Invite.inviteMoreWomen(listOfGoers));

        String excMsg = exception.getMessage();
        assert excMsg != null : "Exception message should not be null"; 

        String msg = "Exception message should contain the word \"null\"";
        assert excMsg.toLowerCase().contains("null") : msg;
    }

    @Test
    public void testInputArrayValues(){

        int[] listOfGoers = {1,-1,4,1,-5,3,-1};
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> Invite.inviteMoreWomen(listOfGoers));

        String excMsg = exception.getMessage();
        assert excMsg != null : "Exception message should not be null"; 

        String msg = "Exception message should contain the word \"values\"";
        assert excMsg.toLowerCase().contains("values") : msg;
    }

    @Test
    public void shouldAnswerWithTrue(){
        int[] listOfGoers = {1,-1,1,1,1,-1};

        assertTrue(Invite.inviteMoreWomen(listOfGoers));
    }

    @Test
    public void shouldAnswerWithFalse(){
        int[] listOfGoers = {-1,-1,-1,-1,-1,-1};

        assertFalse(Invite.inviteMoreWomen(listOfGoers));
    }
    
}

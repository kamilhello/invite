package rutkowski.kamil;

import rutkowski.kamil.invite.Invite;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class InviteTest {

    @Test
    public void shouldAnswerWithTrue(){
        int[] goers = {1,-1,1,1,1,-1};

        assertTrue(Invite.inviteMoreWomen(goers));
    }

    @Test
    public void shouldAnswerWithFalse(){
        int[] goers = {-1,-1,-1,-1,-1,-1};

        assertFalse(Invite.inviteMoreWomen(goers));
    }
    
}

package rutkowski.kamil;

import rutkowski.kamil.invite.Invite;

/**
 * Invite more women?
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] goers = {1,-1,1,1,-1,-1,1};

        System.out.println( "Arthur need to invite more women: " + Invite.inviteMoreWomen(goers) );
    }
}

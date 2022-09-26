package rutkowski.kamil.invite;

public class Invite {

    public static boolean inviteMoreWomen(int[] listOfGoers) {
        int balance = 0;

        for(int goerGender: listOfGoers){
            balance += goerGender;
        }

        return balance > 0;
    }
}

package rutkowski.kamil.invite;

public class Invite {

    public static boolean inviteMoreWomen(int[] listOfGoers) throws IllegalArgumentException{
        
        if(listOfGoers == null){
            String excMsg = "listOfGoers can't be null";
            throw new IllegalArgumentException(excMsg);
        }
        else if(listOfGoers.length < 2 || listOfGoers.length > 50){
            String excMsg = "Length of listOfGoers must be from 2 to 50!";
            throw new IllegalArgumentException(excMsg);
        }

        int balance = 0;

        for(int goerGender: listOfGoers){
            if(goerGender != 1 && goerGender != -1){
                String excMsg = "Values of listOfGoers should be 1 or -1!";
                throw new IllegalArgumentException(excMsg);
            }
            balance += goerGender;
        }

        return balance > 0;
    }
}

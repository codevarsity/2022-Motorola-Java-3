public class NamedValues {
    public static void main(String[] args) {
        //primitives

        int age = 10;   //primitive data type

        //copy semantic
        int myAge = 18;
        int myFriendAge = myAge;
        myAge = 19;

        incrementAge(myAge);

        System.out.println(myAge);

        String name = "amit";

        char lastNameInitial = 'G';

        String languageName = "JAVA";
        String lowerLanguageName = languageName.toLowerCase();
        System.out.println(lowerLanguageName);

        String firstName = "Amit";
        String lastName  = "Gulati";
        String fullName = firstName + " " + lastName;

        String userName = "amit";
        String password = "1234";

        String enteredUserName = "amit";
        String enteredPassword = "1234";

        if( userName.equals(enteredUserName) && password.equals(enteredPassword) ) {
            System.out.println("Username and Password Match");
        } else {
            System.out.println("Username and Password don't Match");
        }


        StringBuilder builder = new StringBuilder();
        builder.append("Amit");
        builder.append(" ");
        builder.append("Gulati");

        String myFullName = builder.toString();
        System.out.println(myFullName);

        //int Integer
        int version = 2;    //primitive type
        Integer versionInteger = Integer.valueOf(2);  //reference type

        float speed = 65.0f;
        Float speedFloat = Float.valueOf(65.0f);



    }

    static void incrementAge(int age) {
        age++;
    }
}

public class EligibleEmployee {

    public static String checkEligibleEmployee(int age){

        if(age <= 17){
            return "You are below 18 not eligible to be employed !!";
        } else if (age >= 45) {
            return "You are too old to be employed !!";
        }
        return "Hello You are Eligible to be Employed.";
    }
}

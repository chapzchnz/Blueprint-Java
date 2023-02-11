public class Main {
    public static void main(String[] args) {
        // Classes and Objects
        Females Female1 = new Females("Female","Chamalee",true);

        Females Female2 = new Females("Female","Yes",true);

        System.out.println("Female 1 ");
        System.out.println(Female1.gender);
        System.out.println( Female1.isFemale);
        System.out.println(Female1.isGirl);
        System.out.println("");

        System.out.println("Female 2 ");
        System.out.println(Female2.gender);
        System.out.println( Female2.isFemale);
        System.out.println(Female2.isGirl);
        System.out.println("");

    }
     // The above coding template is the blueprint for creating the real  world objects
    static class Females {
        //defining the properties of this class
        String gender;
        String isGirl;
        Boolean isFemale;

        // create objects by passing those properties
        // here is a cnstructor which  we can  store out attributes
        Females(String gender,String isGirl,Boolean isFemale){
            this.gender = gender;
            this.isGirl = isGirl;
            this.isFemale = isFemale;

        }

    }

}
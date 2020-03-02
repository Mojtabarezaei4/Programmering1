public class V49 {

    public static void main(String[] args) {

        String[] names ={"Are", "Niklas", "Stefan", "Joakim", "Are", "Jeffrey", "Ester", "Rasmus", "Rasmus", "Niklas"};

        int are = 0;
        int niklas = 0;
        int stefan = 0;
        int joakim = 0;
        int jeffrey = 0;
        int ester = 0;
        int rasmus = 0;

        for (String name : names){

            if (name == "Are"){
                are++;
            }
            if (name == "Niklas"){
                niklas++;
            }
            if (name == "Stefan"){
                stefan++;
            }
            if (name == "Joakim"){
                joakim++;
            }
            if (name == "Jeffrey"){
                jeffrey++;
            }
            if (name == "Ester"){
                ester++;
            }
            if (name == "Rasmus"){
                rasmus++;
            }

        }
        for (String allNames : names){
            if (are > 1){
                System.out.println("Are");
            }
            if (niklas > 1){
                System.out.println("Niklas");
            }
            if (stefan > 1){
                System.out.println("Stefan");
            }
            if (joakim > 1){
                System.out.println("Joakim");
            }
            if (jeffrey > 1){
                System.out.println("Jeffrey");
            }
            if (ester > 1){
                System.out.println("Ester");
            }
            if (rasmus > 1){
                System.out.println("Rasmus");
            }




        }

    }

}

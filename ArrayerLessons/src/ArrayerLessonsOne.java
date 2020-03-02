public class ArrayerLessonsOne {

    public static void main(String[] args) {

    /*
        int[] arr = {1, 2, 3};

        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;



        int[] femmansxtabel = new int[20];
        for (int i = 0; i <= 20; i ++) {

            femmansxtabel[i] = i * 5;
        }

        System.out.println(femmansxtabel[3]);

        for (int i = 0; i < femmansxtabel.length -1; i++){

            System.out.println(femmansxtabel[i]);
        }

        for (int fiver: femmansxtabel) {
            System.out.println(fiver);
        }


        int [] sjuan = new int[1000];
        for (int i = 0; i < 1000; i++){

            sjuan[i] = i * 7;

        }

        for (int sevens: sjuan) {

            System.out.println(sevens);

        }
        */
        String[] names = {"Tomas", "Tomas", "Tomas", "Are", "Tomas", "Are", "Tomas", "Are", "Tomas", "Niklas"};

        int year = 0;
        int yearTomas = 0;
        int yearNiklas = 0;

        for (int i = 0; i < names.length ; i++) {

            if (names[i] == "Are") {

                year ++;

            }

            if (names[i] == "Tomas"){
                yearTomas ++;
            }

            if (names[i] == "Niklas"){
                yearNiklas ++;
            }


        }

        System.out.println("Are har jobbat här i " + year + " år.");
        System.out.println("Tomas har jobbat här i " + yearTomas + " år.");
        System.out.println("Niklas har jobbat här i " + yearNiklas + " år.");



    }
}

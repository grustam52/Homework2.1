public class Main {
    public static void main(String[] args) {
        GriffindorStudent harryPotter = new GriffindorStudent(
                "harryPotter",
                90,
                50,
                40,
                70,
                80

        );
        GriffindorStudent hermionaGrander = new GriffindorStudent(
                "hermiona Grander",
                90,
                40,
                30,
                60,
                40


                );
        GriffindorStudent ronUizly = new GriffindorStudent(
                "hermiona Grander",
                70,
                20,
                30,
                70,
                50



                );

        SlytherinStudent drakoMalfoy = new SlytherinStudent(
                "drakoMalfoy",
                70,
                40,
                40,
                70,
                80,
                40,
                40
        );
        System.out.println(harryPotter);
        System.out.println(hermionaGrander);
        System.out.println(ronUizly);
        System.out.println(drakoMalfoy);
        System.out.println();

        Hogwarts.compereGriffindorStudents(harryPotter, hermionaGrander);
        Hogwarts.compereGriffindorStudents(ronUizly, hermionaGrander);

        Hogwarts.compereHogwartsStudent(harryPotter, hermionaGrander);
        Hogwarts.compereHogwartsStudent(harryPotter, drakoMalfoy);
    }
}
public class Hogwarts {
    public static void compereGriffindorStudents(GriffindorStudent first, GriffindorStudent second){
        int firstSum = first.getBravery() + first.getHonor() + first.getNobility();
        int secondSum = second.getBravery() + second.getHonor() + second.getNobility();

        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше чем " + second.getName());
        }else if (secondSum > firstSum){
            System.out.println(second.getName() + " лучше чем " + first.getName());

        }else {
            System.out.println(second.getName() + " равен" + first.getName());

        }
    }
    public static void compereHufflepuffStudents(HufflepuffStudent first, HufflepuffStudent second){
        int firstSum = first.getHardWork() + first.getIntegrity() + first.getLoyality();
        int secondSum = second.getHardWork() + second.getIntegrity() + second.getLoyality();

        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше чем " + second.getName());
        }else if (secondSum > firstSum){
            System.out.println(second.getName() + " лучше чем " + first.getName());

        }else {
            System.out.println(second.getName() + " равен" + first.getName());

        }
    }
    public static void compereRavenclawStudents(RavenclawStudent first, RavenclawStudent second) {
        int firstSum = first.getCreativity() + first.getIntelligence() + first.getWisdom();
        int secondSum = second.getCreativity() + second.getIntelligence() + second.getWisdom();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучше чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучше чем " + first.getName());

        } else {
            System.out.println(second.getName() + " равен" + first.getName());

        }
    }
    public static void compereSlytherinStudents(SlytherinStudent first,SlytherinStudent second){
        int firstSum = first.getAmbition() + first.getCunning() + first.getDecisiveness() + first.getPowerLust() + first.getRecourcefulness();
        int secondSum = second.getAmbition()+ second.getCunning() + second.getDecisiveness() + second.getPowerLust() + second.getRecourcefulness();

        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше чем " + second.getName());
        }else if (secondSum > firstSum){
            System.out.println(second.getName() + " лучше чем " + first.getName());

        }else {
            System.out.println(second.getName() + " равен" + first.getName());

        }

    }
    public static void compereHogwartsStudent(HogwartsStudent first, HogwartsStudent second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName() + " обладает большей силой магии, чем " + second.getName());
        } else if (second.getMagicPower() > first.getMagicPower()) {
            System.out.println(second.getName() + " обладает большей силой магии, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " равен по силе магии ученику " + second.getName());
        }

         if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
        System.out.println(first.getName() + " обладает большим растоянием трансгресии, чем " + second.getName());
    } else if (second.getMagicPower() > first.getMagicPower()) {
        System.out.println(second.getName() + " обладает большим растоянием трансгресии, чем " + first.getName());
    } else {
        System.out.println(first.getName() + " равен по растоянию рансгресии ученика " + second.getName());
      }
    }
}


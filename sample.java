import java.util.Random;

class Sample {

    public static void main (String args[]) {

        Random r = new Random();

        int randomInt = r.nextInt();    // will generate => random integer
        int randomIntRange = r.nextInt(0, 100);     // will generate => random integer within range
        double randomDouble = r.nextDouble();   // will generate => random double
        long randomLong = r.nextLong();     // will generate => random long
        float randomFloat = r.nextFloat();      // will generate => random float

        System.out.println(randomInt);
        System.out.println(randomIntRange);
        System.out.println(randomDouble);
        System.out.println(randomLong);
        System.out.println(randomFloat);
    }

}
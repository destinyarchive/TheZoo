public class ZooTest {
  public static void main(String[] args) {
    Zoo myZoo = new Zoo();
    //TODO: Add animals to the Zoo
    // - one Pet (not performer)
    myZoo.addToZoo(new Snake());
    // - one performer (not pet)
    myZoo.addToZoo(new Dolphin());
    // - one performer and pet
    myZoo.addToZoo(new Dog("Ziggy Stardust"));
    // - one neither
    myZoo.addToZoo(new SpidersFromMars());
    myZoo.rollCall();
  }
}

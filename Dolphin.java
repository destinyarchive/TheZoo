public class Dolphin extends Animal implements Performer{
  public Dolphin(){
    super("Dolphin");
  }
  public String eat(){
    return "The Dolphin eats fish out of the hand of it's provider";
  }
  public String stuntList(){
    return "Jump\nFlip";
  }
  public void doStunt(String stunt){
    if (stunt.equals("jump")){
      System.out.println("The dolphin jumped into the air!!");
    }
    else if (stunt.equals("Flip")){
      System.out.println("The dolphin flipped under water./nIt was rather unamusing...");
    }
    else{
      System.out.println("The dolphin doesn't know that stunt");
    }
  }
}

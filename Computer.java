public class Computer{

  private String nickname;
  private int storageCapacity;
  private ArrayList<Game> library;

  public Computer(String nickname, int storageCapacity){
    this.nickname = nickname;
    this.storageCapacity = storageCapacity;
    this.library = new ArrayList<Game>();
  }

  public String getNickName(){
    return this.nickname;
  }

  public int getStorageCapacity(){
    return this.storageCapacity;
  }

  public int gamesCount(){
    return library.size();
  }

  public int memoryUsed(){
    int total = 0;
    for (Game game : library){
      total += game.installSize();
    }
    return total;
  }

  public void install(Game game){
    if(memoryUsed() + game.installSize() <= getStorageCapacity) return;
    library.add(game);
  }

public void cleanInstall(){
  this.library = new Game[15];
}


}
public class Computer{

  private String nickname;
  private Game[] library;

  public Computer(String nickname){
    this.nickname = nickname;
    this.library = new Game[15];
  }

  public String getNickName(){
    return this.nickname;
  }

  public int gamesCount(){
    int counter = 0;
    for (Game game : library){
      if (game != null) counter++;
    }
    return counter;
  }

  public boolean libraryFull(){
    return gamesCount() == library.length;
  }

  public void install(Game game){
    if(libraryFull()) return;
    int index = gamesCount();
    library[index] = game;
  }

public void cleanInstall(){
  this.library = new Game[15];
}


}
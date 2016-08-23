import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ComputerTest{
  Computer computer;
  Game game;

  @Before
  public void before(){
    computer = new Computer("Bladestorm");
    game = new Game();
  }

  @Test
  public void hasNickname(){
    assertEquals("Bladestorm", computer.getNickName());
  }

  @Test
  public void computerStartsEmpty(){
    assertEquals(0, computer.gamesCount());
  }

  @Test
  public void canInstallGame(){
    computer.install(game);
    assertEquals(1, computer.gamesCount());
  }

  // @Test
  // public void libraryIsFull(){
  //   for (int i = 0; i < 15; i++){
  //     computer.install(game);
  //   }
  //   assertEquals(true, computer.libraryFull());
  // }

  // @Test
  // public void cannotInstallGameWhenLibraryFull(){
  //   for (int i = 0; i < 16; i++){
  //     computer.install(game);
  //   } 
  //   assertEquals(15, computer.gamesCount());
  // }

  @Test
  public void libraryEmptyAfterCleanInstall(){
    computer.install(game);
    assertEquals(1, computer.gamesCount());
    computer.cleanInstall();
    assertEquals(0, computer.gamesCount());
  }

}
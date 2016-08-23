import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ComputerTest{
  Computer computer;
  ShootyGame shootyGame;

  @Before
  public void before(){
    computer = new Computer("Bladestorm", 50);
    shootyGame = new ShootyGame();
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
    computer.install(shootyGame);
    assertEquals(1, computer.gamesCount());
  }

  @Test
  public void cannotInstallGameWhenLibraryIsFull(){
    for (int i = 0; i < 2; i++){
      computer.install(shootyGame);
    }
    assertEquals(1, computer.gamesCount());
  }

  @Test
  public void libraryEmptyAfterCleanInstall(){
    computer.install(shootyGame);
    assertEquals(1, computer.gamesCount());
    computer.cleanInstall();
    assertEquals(0, computer.gamesCount());
  }

}
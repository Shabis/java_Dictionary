import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("conscience");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_instantiateswithName_String() {
    Word myWord = new Word("conscience");
    assertEquals("conscience", myWord.getName());
  }

  @Test
  public void Word_definitionIsCompleted_false() {
    Word myWord = new Word("conscience");
    assertEquals(false, myWord.isCompleted());
  }
}

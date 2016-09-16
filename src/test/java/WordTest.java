import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("hello");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_instantiateswithName_String() {
    Word myWord = new Word("hello");
    assertEquals("hello", myWord.getName());
  }

  @Test
  public void Word_returnArrayWithMultipleWords_true() {
    Word firstWord = new Word("hello");
    Word secondWord = new Word("goodbye");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }
}

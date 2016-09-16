import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_wordWithAnId_1() {
    Word myWord = new Word("hello");
    assertEquals(1, myWord.getId());
  }

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

  @Test
  public void Word_clearWordArray_0() {
    Word myWord = new Word("hello");
    Word.clear();
    assertEquals(myWord.all().size(), 0);
  }

  @Test
  public void Word_addDefinitiontoWordList_true() {
    Word myWord = new Word("hello");
    Definition myDefinition = new Definition("greeting");
    myWord.addDefinition(myDefinition);
    assertTrue(myWord.getDefinitions().contains(myDefinition));
  }
}

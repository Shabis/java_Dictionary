import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("inner voice guiding to rightness or wrongness");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_instantiateswithDescription_String() {
    Definition myDefinition = new Definition("inner voice guiding to rightness or wrongness");
    assertEquals("inner voice guiding to rightness or wrongness", myDefinition.getDescription());
  }

  @Test
  public void Definition_definitionIsCompleted_false() {
    Definition myDefinition = new Definition("inner voice guiding to rightness or wrongness");
    assertEquals(false, myDefinition.isCompleted());
  }
}

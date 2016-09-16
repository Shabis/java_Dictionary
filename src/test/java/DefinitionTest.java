import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("greeting");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_instantiateswithDescription_String() {
    Definition myDefinition = new Definition("greeting");
    assertEquals("greeting", myDefinition.getDescription());
  }

  @Test
  public void Definition_returnMultipleDefinitionsInArray_true() {
    Definition firstDefinition = new Definition("greeting");
    Definition secondDefinition = new Definition("salutation");
    assertEquals(true, Definition.all().contains(firstDefinition));
    assertEquals(true, Definition.all().contains(secondDefinition));
  }
}

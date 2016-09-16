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

  @Test
  public void Definition_clearList_0() {
    Definition myDefinition = new Definition("greeting");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

  @Test
  public void Definition_getDifinitionId_1() {
    Definition myDefinition = new Definition("greeting");
    assertEquals(1, myDefinition.getId());
  }

  @Test
  public void Definition_findDefinitionWithIdof_myDefinition() {
    Definition myDefinition = new Definition("greeting");
    assertEquals(Definition.find(myDefinition.getId()), myDefinition);
  }
}

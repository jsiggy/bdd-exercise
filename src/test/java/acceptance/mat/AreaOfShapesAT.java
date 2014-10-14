package acceptance.mat;

import acceptance.util.JBehaveStoryRunner;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class AreaOfShapesAT extends JBehaveStoryRunner {

   @Given("an empty mat")
   public void emptyMat() {
      System.out.println("an empty mat: ");
   }

   @When("a square with a side of length $length is added")
   public void addASquare(int length) {
      System.out.println(" a square with a side of length " + length + " was added: ");
   }
}

import pl.edu.ur.oopl9.zad1.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl9.zad2.TreeSetOperations;

/**
 * Created by mchyl on 20/08/2018.
 */
public class Tests {

    @Test
    public void testEx1(){
        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.init();

        arrayOperations.mySort();

        if(arrayOperations.getArray()[0] < arrayOperations.getArray()[1]
                && arrayOperations.getArray()[1] < arrayOperations.getArray()[2]){

        } else {
            Assert.fail();
        }
    }

    @Test
    public void testEx2(){
        TreeSetOperations treeSetOperations = new TreeSetOperations();
        treeSetOperations.init();

        if(treeSetOperations.getTreeSet() == null) {
            Assert.fail();
        }
    }
}

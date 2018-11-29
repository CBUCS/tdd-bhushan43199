import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TestBinaryTree {

    @Test
    private void testAddNode(){

        BSTNode node = new BSTNode();
        BST bst = new BST();

        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        Assertions.assertEquals(4,bst.countNodes());


        bst.delete(2);
        bst.delete(4);
        Assertions.assertEquals(0,bst.countNodes());

        Assertions.assertEquals(0, bst.isEmpty());


    }

}

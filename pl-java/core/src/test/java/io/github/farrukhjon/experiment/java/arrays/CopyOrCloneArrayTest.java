package io.github.farrukhjon.experiment.java.arrays;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CopyOrCloneArrayTest {

    @Test
    public void testCopyOrCloneOfArray() {
        ChildObjs[] childrenArray = {
                new ChildObjs("Ali"),
                new ChildObjs("Vali"),
                new ChildObjs("Sami"),
        };
        ParentObj[] parentArray = new ParentObj[3];
        for (int i = 0; i < parentArray.length; i++) {
            ParentObj parentObj = new ParentObj();
            parentObj.setChildren(childrenArray);
            parentArray[i] = parentObj;


        }
        ParentObj[] copyParentObjs = Arrays.copyOf(parentArray, parentArray.length);
        ParentObj[] cloneParentObjs = parentArray.clone();
        System.out.println();
    }

    @Test
    public void testCopyOrCloneOfArray2() {
        int[] anArray = new int[]{0, 1, 2, 3};
        System.out.println(anArray.getClass());
        int[] copyOfAnArray = Arrays.copyOf(anArray, anArray.length);
        int[] cloneOfTheAnArray = anArray.clone();
        assertNotEquals(anArray, copyOfAnArray);
        assertNotEquals(anArray, cloneOfTheAnArray);
        System.out.println(copyOfAnArray.getClass());
        System.out.println();

    }


    static class ParentObj {

        private ChildObjs[] children;

        public ChildObjs[] getChildren() {
            return children;
        }

        public void setChildren(ChildObjs[] children) {
            this.children = children;
        }
    }

    static class ChildObjs {

        private String name;

        public ChildObjs(String name) {
            this.name = name;
        }


    }
}

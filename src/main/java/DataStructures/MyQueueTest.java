package DataStructures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyQueueTest {
        @Test
        public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
            MyNode<Integer> myFirstNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(56);
            MyQueue myQueue = new MyQueue();
            myQueue.enqueue(myFirstNode);
            myQueue.enqueue(mySecondNode);
            myQueue.enqueue(myThirdNode);
            myQueue.printMyStack();
            INode peak = myQueue.peak();
            Assert.assertEquals(myThirdNode,peak);

        }

        @Test
        public void given3NumbersInQueueWhenPoppedShouldMatchWithFirstAddedNode(){
            MyNode<Integer> myFirstNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(56);
            MyQueue myQueue = new MyQueue();
            myQueue.enqueue(myFirstNode);
            myQueue.enqueue(mySecondNode);
            myQueue.enqueue(myThirdNode);
            INode dequeue = myQueue.dequeue();
            myQueue.printMyStack();
            Assert.assertEquals(myFirstNode,dequeue);
        }
}

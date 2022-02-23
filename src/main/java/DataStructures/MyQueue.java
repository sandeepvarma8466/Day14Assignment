package DataStructures;

public class MyQueue {

        public static INode head;
        public static INode tail;

        public void enqueue(INode myNode) {
            if ( this.tail == null ) {
                this.tail = myNode;
            }
            if ( this.head == null ) {
                this.head = myNode;
            }
            else {
                INode tempNode = this.head;
                this.head = myNode;
                this.head.setNext(tempNode);
            }
        }


        public INode peak() {

            return MyQueue.head;
        }

        public INode dequeue() {
            INode tempNode = this.tail;
            this.head = head.getNext();
            return tempNode;
        }

        public void printMyStack() {
            StringBuffer myNodes = new StringBuffer("My Nodes: ");
            INode tempNode = head;
            while ( tempNode.getNext()!=null ) {
                myNodes.append(tempNode.getKey());
                if (!tempNode.equals(tail))
                    myNodes.append("->");
                tempNode = tempNode.getNext();
            }
            myNodes.append(tempNode.getKey());

            System.out.println(myNodes);
        }
}

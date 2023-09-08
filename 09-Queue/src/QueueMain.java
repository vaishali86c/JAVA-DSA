public class QueueMain {

    public static void main(String[] args) throws Exception{
        dynamicQueue queue = new dynamicQueue(5);

        queue.insert(5);
        queue.insert(4);
        queue.insert(7);
        queue.insert(8);

        queue.insert(9);
//        queue.insert(12);

        queue.display();

       System.out.println(queue.remove());

       queue.insert(133);
       queue.insert(12);

       queue.display();





    }
}

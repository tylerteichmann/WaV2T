public class main {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList = new MyLinkedList<Integer>();
        newList.Append(0);
        newList.Append(1);
        newList.Append(2);
        newList.Append(3);
        System.out.println(newList.Get(-1));
    }
}

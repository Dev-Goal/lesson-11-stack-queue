package practice.practice_5;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("One");
        myGenericStack.push("Five");
        myGenericStack.push("Three");
        myGenericStack.push("Ten");
        myGenericStack.push("Eleven");

        System.out.println(myGenericStack.size());
        System.out.print("Cut string: ");
        while (!myGenericStack.isEmpty()) {
            System.out.printf(" %s", myGenericStack.pop());
        }
        System.out.println();
        System.out.println(myGenericStack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(12);
        myGenericStack.push(28);
        myGenericStack.push(31);
        myGenericStack.push(34);
        myGenericStack.push(3467);

        System.out.println(myGenericStack.size());
        System.out.print("Cut integer: ");
        while (!myGenericStack.isEmpty()) {
            System.out.printf(" %d", myGenericStack.pop());
        }
        System.out.println();
        System.out.println(myGenericStack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. String");
        stackOfIStrings();
        System.out.println("2. Integer");
        stackOfIntegers();
    }
}

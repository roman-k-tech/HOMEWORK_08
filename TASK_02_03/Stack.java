package TASK_02_03;

import java.util.Arrays;

/**
 * Created by Роман on 05.11.2017.
 */
public class Stack {

    private Object[] stack = new Object[0];
    private Resricted resricted = null;

    public Stack() {
    }

//    public Stack(Object[] stack) {
//        this.stack = stack;
//    }

    public void setResricted(Resricted resricted) {
        this.resricted = resricted;
    }

    public void add(Object object) {

        if (resricted != null) {
            try {
                resricted.checkRestricted(object);
            }
            catch (RestrictedException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        int length;
        length = stack.length;

        Object[] newStack = new Object[length + 1];
        if (length == 0) {
            newStack[0] = object;
        }
        else {
            System.arraycopy(stack, 0, newStack, 1, length);
            newStack[0] = object;
        }
        stack = newStack;
    }

    public void remove() {
        int length;
        length = stack.length;

        if (length == 0) {
            System.out.println("STACK IS ALREADY EMPTY!");
        }
        else if (length == 1) {
            stack = new Object[0];
        }
        else {
            Object[] newStack = new Object[length - 1];
            System.arraycopy(stack, 1, newStack, 0, length - 1);
            stack = newStack;
        }
    }

    public Object getCell() {
        return stack[0];
    }

    @Override
    public String toString() {
        return "STACK:\n" + Arrays.toString(stack);
    }

    public void printSelf() {
        if (stack.length != 0) {
            System.out.println("STACK:");
            for (Object item : stack) {
                System.out.println("\t" + item.getClass().getSimpleName() + "\t\t" + item.toString());
            }
        }
        else {
            System.out.println("STACK is EMPTY.");
        }
    }
}

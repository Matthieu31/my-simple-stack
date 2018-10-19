package deqo.mlen.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack{

    private ArrayList<Item> stack;

    public MySimpleStack(){
        stack= new ArrayList<Item>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int getSize(){
        return stack.size();
    }

    public void push(Item item){
        stack.add(item);
    }

    public Item peek() throws EmptyStackException{
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.get(0);
    }

    public Item pop() throws EmptyStackException{
        if (stack.isEmpty())
            throw new EmptyStackException();
        Item itemARemove= stack.get(0);
        stack.remove(itemARemove);
        return itemARemove;
    }




}

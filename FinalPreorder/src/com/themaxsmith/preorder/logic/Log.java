package com.themaxsmith.preorder.logic;


public class Log {
    private int top;
    int size;
    String[] stack ;

    public Log(int arraySize){
        size=arraySize;
        stack= new String[size];
        top=-1;
    }

    public void push(String value){
        if(top==size-1){
            System.out.println("Stack is full, can't push a value");
        }
        else{

            top=top+1;
            stack[top]=value;
        }
    }

    public String pop(){
        if(!isEmpty()) {
            top=top-1;
        return stack[top+1];
    }else{
            System.out.println("Can't pop...stack is empty");
            return null;
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public String display(){
    	String x = "";
        for(int i=0;i<=top;i++){
            x = x + stack[i]+ "\n";
        }
        return  x;
    }
}
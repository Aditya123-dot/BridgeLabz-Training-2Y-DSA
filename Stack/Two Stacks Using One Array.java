class Stacks {

    int arr[] = new int[10];
    int top1 = -1;
    int top2 = 10;

    void push1(int x){
        if(top1 < top2 - 1){
            arr[++top1] = x;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    void push2(int x){
        if(top1 < top2 - 1){
            arr[--top2] = x;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    int pop1(){
        if(top1 >= 0){
            return arr[top1--];
        }
        return -1;
    }

    int pop2(){
        if(top2 < arr.length){
            return arr[top2++];
        }
        return -1;
    }
}

public class TwoStacks {
    public static void main(String[] args){

        Stacks st = new Stacks();

        st.push1(10);
        st.push1(20);

        st.push2(90);
        st.push2(80);

        System.out.println(st.pop1());
        System.out.println(st.pop2());
    }
}
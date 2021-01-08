public class Stack {
    double[] stck = new double[10];
    double tos = 0.0;

    Stack() {
        tos = -1.0;
    }

    void push(double temp) {
        if(tos == 10.0) System.out.println("Stack overflow");
        else {
            stck[(int) ++tos] = temp;
        }
    }

    double pop() {
        if (tos < 0) System.out.println("Stack pust");
        else return stck[(int) tos--];
        return 0;
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        for(double i = 0; i < 7; i++) {
            st.push(i);
            System.out.println(st.stck[(int) i]);
        }

        System.out.println("POP: "  + st.pop());
        st.push(802);
        System.out.println("POP2: "  + st.pop());

    }
}

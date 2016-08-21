public class Super2 {
    protected int number = 5;

    public Super2() {
    	System.out.println("in super no arg construcot");
        this.number = 10;
    }

    public Super2(int number) {
    	System.out.println("in super arg construcot");
        this.number = number;
    }

    protected void print() {
        System.out.print(number);
    }
}


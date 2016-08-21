public class Parent{
    protected int number = 9;

    public Parent() {
    	System.out.println("in Parent no arg construcot");
        this.number = 11;
    }

    public Parent(int number) {
    	System.out.println("in Parent arg construcot");
        this.number = number;
    }

    protected void print() {
        System.out.print(number);
    }
}

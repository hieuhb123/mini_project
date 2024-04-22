public class test {
    private int a, b;
    public test(){
        this.a = 5;
        this.b = 6;
        System.out.println(this.a);
        System.out.println(this.b);
        swap(this.a, this.b);
        System.out.println(this.a);
        System.out.println(this.b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args){
        new test();
    }
}

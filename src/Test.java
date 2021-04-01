public class Test {
    private int x,y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void show(){
        System.out.println(x+","+y);
    }
    public void change(){
        x++;y++;
    }
}

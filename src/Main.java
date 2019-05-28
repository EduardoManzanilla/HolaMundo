public class Main {

    public int var1;

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar1() {
        return var1;
    }

    public Main() {//constructor

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Main ejemplo = new Main(); //objeto
        ejemplo.setVar1(3);
        System.out.println(ejemplo.getVar1());
    }
}

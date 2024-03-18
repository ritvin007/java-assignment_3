class Org implements Cloneable {
    private int code;
    private String name;
    private String addr;

    public Org(int code, String name, String addr) {
        this.code = code;
        this.name = name;
        this.addr = addr;
    }

    public void info() {
        System.out.println("Org Code: " + code);
        System.out.println("Org Name: " + name);
        System.out.println("Org Addr: " + addr);
    }

    @Override
    public Org clone() throws CloneNotSupportedException {
        return (Org) super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Org org1 = new Org(1, "Org1", "Addr1");
        Org org2 = org1.clone();

        org1.info();
        System.out.println("Clone:");
        org2.info();
    }
}

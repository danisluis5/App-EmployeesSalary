package app.eployees.salary.bean;

public class PhanXuong {
    private int id;
    private String name;
    private int soSPC;

    public PhanXuong(int id, String name,int soSPC) {
        this.id = id;
        this.name = name;
        this.soSPC = soSPC;
    }
    
    public PhanXuong(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSoSPC() {
        return soSPC;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoSPC(int soSPC) {
        this.soSPC = soSPC;
    }
    @Override
    public String toString(){
        return this.name;
    }
}

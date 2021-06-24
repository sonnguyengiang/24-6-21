package arraylist;

public class Product {
   private int id;
   private String name;
    private int pice;

   public Product(){}

    public Product(int id, String name,int pice) {
        this.id = id;
        this.name = name;
        this.pice = pice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pice=" + pice +
                '}';
    }
}

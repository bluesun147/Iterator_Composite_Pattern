
// 메뉴항목
public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;

    // 생성자
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void add(MenuComponent menuComponent) {
        menuComponent.add(menuComponent);
    }

    // 게터 메소드
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    /// ////
    public void print() {
//        System.out.print("MenuItem!\n");
        System.out.print("    " + getName());
        System.out.print(", " + getPrice());
        System.out.print(" " + getDescription() + "\n");
    }
}

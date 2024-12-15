//import java.util.Iterator;
//
//public interface Menu {
//    // 클라이언트에서 메뉴에 들어있는 항목의 반복자 쉽게 획득하게 해주는 인터페이스

import java.util.ArrayList;
import java.util.List;

////    public Iterator<MenuItem> createIterator();
//    public Iterator<MenuItem> createIterator();
//}

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("----------------------\n");
        System.out.print("메뉴명 : " + getName());
        System.out.print(", 메뉴 설명 : " + getDescription() + "\n");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
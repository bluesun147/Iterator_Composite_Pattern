//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//// 메뉴항목
//public class Cafe implements Menu {
//    // 메뉴를 Map으로 구성.
//    Map<String, MenuItem> menuItems;
//
//    // 생성자
//    public Cafe() {
//        menuItems = new HashMap<String, MenuItem>();
//        addItem("커피 세트", "커피와 빵", 5000);
//    }
//
//    public void addItem(String name, String description, double price) {
//        MenuItem menuItem = new MenuItem(name, description, price);
//        // Key, value
//        menuItems.put(name, menuItem);
//    }
//
//    // HashMap 전체 대상 반복자 리턴 아닌, value 대상으로 반복자 리턴.
//    public Iterator<MenuItem> createIterator() {
//        return menuItems.values().iterator();
//    }
//}
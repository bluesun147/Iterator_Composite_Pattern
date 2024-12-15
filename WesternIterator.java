//import java.util.ArrayList;
//
//public class WesternIterator implements Iterator {
//    ArrayList<MenuItem> items;
//    int position = 0;
//
//    public WesternIterator(ArrayList<MenuItem> items) {
//        this.items = items;
//    }
//
//    public MenuItem next() {
//        MenuItem menuItem = items.get(position);
//        position += 1;
//        return menuItem;
//    }
//
//    public boolean hasNext() {
//        return position < items.size();
//    }
//}
import java.util.Iterator;

public class KoreanIterator implements Iterator {
    MenuItem[] items;
    int positon = 0;

    public KoreanIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[positon];
        positon += 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (positon >= items.length || items[positon] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("메뉴항목은 삭제할 수 없습니다.");
    }
}
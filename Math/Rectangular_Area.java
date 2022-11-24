public class Rectangular_Area {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int A = (Math.abs(ax1-ax2))*(Math.abs(ay1-ay2));
        int B = (Math.abs(bx1-bx2))*(Math.abs(by1-by2));

        int x1 = Math.max(ax1,bx1);
        int y1 = Math.max(ay1,by1);
        int x2 = Math.min(ax2,bx2);
        int y2 = Math.min(ay2,by2);

        int x = (x2 - x1);
        int y = (y2 - y1);

        if(x<0 || y<0) return A+B;
        return A+B - x*y;

    }
    public static void main(String[] args) {
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}

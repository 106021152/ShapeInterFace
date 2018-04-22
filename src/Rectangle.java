class Rectangle extends Shape {
    public static int count = 0 ;
    public int L;
    public int H;
    private Rectangle(){
        count++;
    }
    protected Rectangle(int l, int h){
        this();
        setL(l);
        setH(h);
        area();
        Perimeter();
    }

    public int getH() {
        return H;
    }
    public int getL() {
        return L;
    }
    public void setH(int h) {
        if (h < 0) {
            this.H = 0;
        } else {

            this.H = h;
        }
    }

    public void setL(int l) {
        if (l < 0) {
            this.L = 0;
        } else {
           this.L = l;
        }
    }
    public void area(){
        area = L * H ;

    }
    public void Perimeter() {
        Perimeter = L + H * 2 ;
    }
    public void Show(){
        System.out.println("矩形長 = " + L);
        System.out.println("矩形高 = " + H);
        System.out.println("矩形周長 = " + Perimeter);
        System.out.println("矩形面積 = " + area);

    }
}

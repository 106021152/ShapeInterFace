class Circle extends Shape {
    public static int count = 0 ;
    public int r;
    private Circle(){
        count++;
    }

    protected Circle(int r){
        this();
        setR(r);
        area();
        Perimeter();
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r < 0) {
            this.r = 0;
        }else {
            this.r = r;
        }
    }
    public void area() {
      area = Math.PI * r * r;
    }
    public void Perimeter() {
        Perimeter = r * 2 * Math.PI;
    }
    public void Show(){
        System.out.println("圓半徑 = " + r);
        System.out.println("圓周長 = " + Perimeter);
        System.out.println("圓面積 = " + area);
    }
}
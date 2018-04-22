class Triangle extends Shape {
    public static int count = 0;
    public int l;
    public int h;
    public int average;

    private Triangle() {
        count++;
    }

    protected Triangle(int l, int h, int average) {
        this();
        setL(l);
        setH(h);
        setAverage(average);
        area();
        Perimeter();
    }

    public int getL() {
        return l;
    }

    public int getH() {
        return h;
    }

    public int getAverage() {
        return average;
    }

    public void setL(int l) {
        if (l < 0) {
            this.l = 0;
        } else {
            this.l = l;
        }
    }

    public void setH(int h) {
        if (h < 0) {
            this.h = 0;
        } else {
            this.h = h;
        }
    }

    public void setAverage(int average) {
        if (average < 0 || average >= 180) {
            this.average = 0;
        } else {
            this.average = average;
        }
    }

    public void area() {
        area = l * h / 2;

    }

    public void Perimeter() {
        Perimeter = l + h * 2;
    }

    public void Show() {
        System.out.println("三角形底 = " + l);
        System.out.println("三角形高 = " + h);
        System.out.println("三角形周長 = " + Perimeter);
        System.out.println("三角形面積 = " + area);
    }
}
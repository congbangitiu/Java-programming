public class Triangle {
    private Point vertice1;
    private Point vertice2;
    private Point vertice3;
    
    public Triangle(Point vertice1,Point vertice2,Point vertice3){
        this.vertice1=vertice1;
        this.vertice2=vertice2;
        this.vertice3=vertice3;
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        vertice1=new Point(x1,y1);
        vertice2=new Point(x2,y2);
        vertice3=new Point(x3,y3);
    }
    public double getPerimeter(){
        double d1=Math.hypot(vertice1.getX()-vertice2.getX(),vertice1.getY()-vertice2.getY());
        double d2=Math.hypot(vertice2.getX()-vertice3.getX(),vertice2.getY()-vertice3.getY());
        double d3=Math.hypot(vertice1.getX()-vertice3.getX(),vertice1.getY()-vertice3.getY());
        return d1+d2+d3;
    }
}

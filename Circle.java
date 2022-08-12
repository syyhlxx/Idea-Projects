package reviewMaterials;

public class Circle {
    public Color color;

    public void Circle() {
        this.color =  new Color() ;
    }
    //OuterClass.InnerClass innerObject = outerObject.new InnerClass();
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle.Color newColor = circle.new Color();
        circle.color = newColor;
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        private String description;
        public Color()
        {
            this.description ="";
        }
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

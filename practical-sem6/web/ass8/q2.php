
<?php

interface Shape {
    public function area();
}

class Rectangle implements Shape{
    private $length;
    private $width;

    public function __construct($length, $width) {
        $this->length = $length;
        $this->width = $width;
    }

    public function area() {
        return $this->length * $this->width;
    }
}

class Square extends Rectangle {
    public function __construct($side) {
        parent:: __construct($side, $side);
    }
}

class Circle implements Shape {
    private $radius;

    public function __construct($radius) {
        $this->radius = $radius;
    }

    public function area() {
        return 3.14 * $this->radius ** 2;
    }
}

if (isset($_POST["submit"])) {

    $length = $_POST["length"];
    $width = $_POST["width"];
    $side = $_POST["side"];
    $radius = $_POST["radius"];

    $rectangle = new Rectangle($length, $width);
    $sqaure = new Square($side);
    $circle = new Circle($radius);

    echo "Area of Rectangle is ". $rectangle->area(). "<br>";
    echo "Area of Square is ". $sqaure->area(). "<br>";
    echo "Area of circle is ". $circle->area(). "<br>";
}
?>

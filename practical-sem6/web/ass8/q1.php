<?php  

class Book {
    var $book_name;
    var $book_quantity;
    var $book_price;
    var $book_stock;

    function __construct($name, $quantity, $price, $stock) {
        $this->book_name = $name;
        $this->book_quantity = $quantity;
        $this->book_price = $price;
        $this->book_stock = $stock;     
    }

    function display() {
        echo "Book Name: ".$this->book_name."<br>";
        echo "Book Quantity".$this->book_quantity."<br>";
        echo "Book Price".$this->book_price."<br>";
        echo "Book Stock",$this->book_stock."<br>";
    }
}

    if (isset($_POST["submit"])) {
        $name = $_POST["name"];
        $quantity = $_POST["quantity"];
        $price = $_POST["price"];
        $stock = $_POST["stock"];

        $book = new Book($name, $quantity, $price, $stock);
        $book->display();
    }
?>
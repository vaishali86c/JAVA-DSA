<?php

    $fst = $_POST["fst"];
    $fs = $_POST["fs"];
    $fc = $_POST["fc"];
    $bgc = $_POST["bgc"];

    setcookie("fontStyle", $fst, time() + (300));
    setcookie("fontSize", $fs, time() + (300));
    setcookie("fontColor", $fc, time() + (300));
    setcookie("backgroundColor", $bgc, time() + (300));
?>

<html>
    <head>
        <title>PREFRENCES</title>
    </head>
    <body>
        <h2>Your Prefrences</h2>
        <h4>Font Style: <?php echo $_COOKIE["fontStyle"]; ?> </h4>
        <h4>Font Size: <?php echo $_COOKIE["fontSize"]; ?> </h4>
        <h4>Font Color: <?php echo $_COOKIE["fontColor"]; ?> </h4>
        <h4>Background Color : <?php echo $_COOKIE["backgroundColor"]; ?> </h4>

        <a href="change.php">Apply Changes</a>

    </body>
</html>
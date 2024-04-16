<?php

    $eno = $_POST["eno"];
    $ename = $_POST["ename"];
    $add = $_POST["add"];

    setcookie("eno", $eno, time() + (300));
    setcookie("ename", $ename, time() + (300));
    setcookie("add", $add, time() + (300));

    // session_start();
    // $_SESSION["eno"] = $eno;
    // $_SESSION["ename"] = $ename;
    // $_SESSION["add"] = $add;
?>


<html>
    <head></head>
    <body>

        <h2>for Employee</h2>
        <h4>Emp no: <?php echo $eno; ?></h4>
        <h4>Emp name: <?php echo $ename; ?></h4>
        <h4>Emp address: <?php echo $add; ?></h4>

        <h2>Basic Earning Details</h2>
        <form action="q22.php" method="POST">
            <label for="basic">Basic: </label>
            <input type="text" name="basic" id="basic">
            <br>
            <label for="da">DA : </label>
            <input type="text" name="da" id="da">
            <br>
            <label for="hra">hra : </label>
            <input type="text" id="hra" name="hra">
            <br>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
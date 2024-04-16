<?php

    $basic = $_POST["basic"];
    $da = $_POST["da"];
    $hra = $_POST["hra"];

    $total = $basic + $da + $hra;
?>

<html>
    <head>
        <title>Details</title>
    </head>
    <body>
        <h1>Emp Details</h1>
        <h4>Emp no: <?php echo $_COOKIE["eno"]; ?></h4>
        <h4>Emp name: <?php echo $_COOKIE["ename"]; ?></h4>
        <h4>Emp address: <?php echo $_COOKIE["add"]; ?></h4>

        <h1>salary details</h1>
        <h4>Basic: <?php echo $basic; ?></h4>
        <h4>da: <?php echo $da; ?></h4>
        <h4>hra: <?php echo $hra; ?></h4>
        <h4>total: <?php echo $total; ?></h4>
    </body>
</html>
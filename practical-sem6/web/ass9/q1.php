<html>
<head>
    <title>Student File</title>
</head>

<body>
    <form action="q1.php" method="POST">
        <label for="name">Enter the file name: </label>
        <input type="text" name="name" id="name">
        <br>
        <br>
        <input type="submit" name="submit">
    </form>
    <h1>Display Details: </h1>
    <?php

    if (isset($_POST["submit"])) {
        $filename = $_POST["name"];
        echo "<table>";
        echo "<tr>
                <th> Roll no </th>
                <th> Name </th>
                <th> Math </th>
                <th> Electronic </th>
                <th> computer </th>
                <th> percentage </th>
            </tr>";
        
        $fp = fopen($filename, "r");
        if ($fp) {
            while ($line = fgets($fp) !== false) {
                $data = explode(",", $line);
                $total_marks = $data[2] + $data[3] + $data[4];
                $percentage = number_format(($total_marks / 3), 2);

                echo "<tr>";
                echo "<td>".$data[0]."</td>";
                echo "<td>".$data[1]."</td>";
                echo "<td>".$data[2]."</td>";
                echo "<td>".$data[3]."</td>";
                echo "<td>".$data[4]."</td>";
                echo "<td>".$percentage."%</td>";
                echo "</tr>";
            }
            fclose($fp);
        } else {
            echo "File cannot be opened";
        }
        echo "</table>";
    }
    ?>
</body>
</html>

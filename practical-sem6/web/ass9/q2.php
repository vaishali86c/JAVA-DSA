<html>
<head>
    <title>Read Directory</title>
</head>
<body>
    <form action="q2.php" method="POST">
        <label for="dirName">Enter the directory name : </label>
        <input type="text" id="dirName" name="dirName">
        <br>
        <label for="extension">Enter the Extension: </label>
        <input type="text" id="extension" name="extension">
        <br>
        <br>
        <input type="submit" name="submit">
    </form>

    <?php
    if (isset($_POST["submit"])) {
        $dir = $_POST["dirName"];
        $ext = $_POST["extension"];
        
        echo "<table>
            <tr>
                <th>File Name</th>
                <th>Size</th>
                <th>Last access time</th>
            </tr>
        ";

        if (is_dir($dir)) {
            if ($d = opendir($dir)) {
                while (($file = readdir($d)) !== false) {
                    if (pathinfo($file, PATHINFO_EXTENSION) == $ext) {
                        $size = filesize($dir . "/" . $file);
                        $accessTime = date("Y-m-d H:i:s", filemtime($dir . "/" . $file));

                        echo "<tr>
                                <td>$file</td>
                                <td>$size</td>
                                <td>$accessTime</td>
                            </tr>";
                    }
                }
                closedir($d);
            } else {
                echo "Unable to open the directory";
            }
        } else {
            echo $dir . " is not a directory";
        }
        echo "</table>";
    }
    ?>
</body>
</html>

<!-- <html>
    <head>
        <title>Database</title>
    </head>
    <body>
        <form action="q2.php" metho="POST">

            <h2>Display Student Details Who participate in that competition</h2>
            <label for="comp">Enter the competition name :</label>
            <input type="text" name="comp" id="comp">
            <br>
            <h2>Delete the students of that competition</h2>
            <label for="compName">Enter the competition name :</label>
            <input type="text" name="compName" id="compName">
            <br>
            <br>
            <input type="submit" name="submit">
            <br>
        </form>

        <?php 

            // $host = "localhost";
            // $port = 5432;
            // $user = "ty163"
            // $password = "";
            // $dbName = "";

            $db = pg_connect("host=$host port=$port dbName=$dbName password=$password");

            if ($db) {
                echo "databased connected succesfully";
            }

            // if (isset($_POST["submit"])) {
            //     if(isset($_POST["comp"])) {
            //         $comp = $_POST["comp"];
            //         $query = "select comp from Student, competition, stud_comp where student.stud_id = stud_comp.stud_id ad competition.c_no = stud_comp.c_no"
            //     }
            //     if(isset($_POST["compName"])) {
            //         $compName = $_POST["compName"];
            //     }
            // }
        ?>
    </body>
</html> -->
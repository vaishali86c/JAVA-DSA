<?php
if(isset($_POST["submit"])) {
    $host = "localhost";
    $port = 5432;
    $dbname = "postgres";
    $password = "0000";

    $db = pg_connect("host=$host port=$port dbname=$dbname password=$password");

    if($db){
        echo "Database Connected";
    }

    if(isset($_POST["actor-name"])) {

        $actorName = $_POST["actor-name"];

        $query = "SELECT movie_name FROM movie WHERE movie_no IN (SELECT movie_no FROM movie_actor WHERE actor_no IN (SELECT actor_no FROM actor WHERE actor_name = '$actorName'))";

        $res = pg_query($db, $query);

        if($res) {

            echo "1st query executed <br>";
            while($row = pg_fetch_row($res)) {
                echo $row[0]."<br>";
            }
        }
    }

    if(isset($_POST["movie-name"], $_POST["year"])) {
        $movieName = $_POST["movie-name"];
        $year = $_POST["year"];
        if(!empty($movieName) && !empty($year)) { 
            $query2 = "UPDATE movie SET release_year = '$year' WHERE movie_name = '$movieName'";
            $res2 = pg_query($db, $query2);
            if($res2) {
                echo "2nd query executed <br>";
            }
        } else {
            echo "Please provide both movie name and release year.";
        }
    }  
    pg_close($db);
}
?>
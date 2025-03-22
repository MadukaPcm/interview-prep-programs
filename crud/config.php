
<?php 

$host = "localhost";
$username = "root";
$password = "";
$db_name = "crud";

$conn = new mysqli($host,$username,$password,$db_name);

if(!$conn){
  die("Database connection failed ".$conn->connect_error);
}

echo "Database connected successfully !!";
?>


<!-- INSERT INTO users (first_name,last_name,email,password,gender) VALUES ('Maduka','PCM','madukapcm@gmail.com','@Maduka1','MALE'); -->

<!--
sudo /opt/lampp/lampp start

sudo /opt/lampp/bin/mysql -u root

sudo /opt/lampp/lampp stop
sudo /opt/lampp/lampp restart
sudo /opt/lampp/lampp status

pass = eG@_2024 port 3306 default.    http://localhost/phpmyadmin
-->



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


<!-- 

  mysql> CREATE TABLE employee (id INT AUTO_INCREMENT PRIMARY KEY,fullname VARCHAR(256) NOT NULL,email VARCHAR(256) NOT NULL UNIQUE,password VARCHAR(256) NOT NULL);

  mysql> INSERT INTO employee (fullname,email,password) VALUES('Bro Frank','madukapcm@gmail.com','@maduka1'); 

  mysql> UPDATE employee SET fullname='Maduka Pcm',email='madukapc@gmail.com' WHERE id=1; 

  mysql> DELETE FROM employee WHERE id=1; 

  mysql> CREATE TABLE payment(id INT AUTO_INCREMENT PRIMARY KEY,employee_id INT NOT NULL,amount DECIMAL(10,2) NOT NULL,date DATE NOT NULL,method VARCHAR(50) NOT NULL,FOREIGN KEY (employee_id) REFERENCES employee(id) ON DELETE CASCADE); 

  mysql> INSERT INTO payment (employee_id,amount,date,method) VALUES(2,20000,'2025-03-24','NMB'); 

  mysql> SELECT e.id, e.fullname, e.email, p.amount, p.date, p.method FROM employee e JOIN payment p ON e.id=p.employee_id WHERE p.method='cash' LIMIT 5;

  mysql> SELECT COUNT(*) FROM payment; 

  mysql> SELECT COUNT(*) FROM employee; 

  mysql> SELECT SUM(amount) as total_salary FROM payment;

  mysql> SELECT MAX(amount) AS highest_amount FROM payment;

  mysql> SELECT MIN(amount) AS minimum_salary FROM payment;

  mysql> SELECT AVG(amount) AS average_salary FROM payment;

  mysql> SELECT employee_id, SUM(amount) AS total_paid FROM payment GROUP BY employee_id;

  mysql> SELECT method,COUNT(*) as total_payment FROM payment GROUP BY method;

  mysql> SELECT * FROM employee WHERE fullname LIKE 'maduka';

  mysql> SELECT * FROM employee WHERE fullname LIKE '%maduka%';


sudo /opt/lampp/lampp start

sudo /opt/lampp/bin/mysql -u root

sudo /opt/lampp/lampp stop
sudo /opt/lampp/lampp restart
sudo /opt/lampp/lampp status

pass = eG@_2024 port 3306 default.    http://localhost/phpmyadmin

maduka@maduka:~$ mysql -u root -p

mysql> show databases;

mysql> use crud;

mysql> show tables;

mysql> describe table-name;


-->


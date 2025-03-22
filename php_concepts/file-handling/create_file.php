
<?php 

// this if for window.
// $new = "C:\\xampp\\htdocs\\interview\\php_concepts\\file-handling\\cse.txt"; 
$new = "cse.txt";
$file = fopen($new,'w');

if($file === false){
  die("Error: Unable to open or create a file");
}



?>


<!-- // ini_set('display_errors', 1);
// ini_set('display_startup_errors', 1);
// error_reporting(E_ALL);


// $new = "cse.txt";
// $file = fopen($new, 'w');

// if ($file === false) {
//     die("Error: Unable to open or create the file.");
// }

// // Optionally, write something to the file
// fwrite($file, "This is a test.");
// fclose($file);

// echo "File created successfully."; -->

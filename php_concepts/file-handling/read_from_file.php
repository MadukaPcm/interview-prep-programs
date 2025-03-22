
<?php

$file = fopen("cse.txt",'r');
if($file){
  echo fgets($file);
  echo "</br></br>File ready successfully";
}
?>
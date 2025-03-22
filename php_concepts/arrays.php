
<?php 

$fruits = array("Apple","Banana","Cherry");
$fruits = [
  "Apple",
  "Banana",
  "Cherry"
];

echo $fruits[0];

unset($fruits[1]);
array_splice($fruits, 0,1);

$fruits[] = "Orange";
echo $fruits[1];
?>
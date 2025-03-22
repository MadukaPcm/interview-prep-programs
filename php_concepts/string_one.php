<?php 

$str_one = "Maduka";
$str_count = strlen($str_one);

$sentence = "Kijana mpole sana";
$word_count = str_word_count($sentence);

$str_reverse = "PCM";
$reversed_string = strrev($str_reverse);

$str_pos = "Maduka PCM";
$str_position = strpos($str_pos, "PCM");

$str_replace = "Bro Frank";
$str_replace = str_replace("Bro","Eng",$str_replace);

$strtolower = "PCM";
$strtolower = strtolower($strtolower);

$strtoupper = "pcm";
$strtoupper = strtoupper($strtoupper);

$trim = "Maduka Moja";
$first_upper_char = "kijana mdogo => mtoto wa mama kizimkazi";
$ucwords = ucwords($first_upper_char);
$str_repeat = "College";
$str_repeat = str_repeat($str_repeat, 3);
$substr = "Vijana wote Njoon hapa";
$substr = substr($substr, 18,22); 


echo "</br></br>";
echo "The string length of =>".$str_one."is ".$str_count."</br>";
echo "The total word in sentence ->".$sentence." is ->".$word_count."</br>";
echo "The reversed string is =>".$reversed_string."</br>";
echo "The position of the string 'PCM' in a string is =>".$str_position."</br>";
echo "The new string after replacement is =>".$str_replace."</br>";
echo "The String to lower output is =>".$strtolower."</br>";
echo "the String to upper output is =>".$strtoupper."</br>";

// Trim removes characters from outside the string.
echo "String to be trimed is ->".$trim." the trim by 'Ma' ->".trim($trim,"Ma")."</br>";
echo "Left-side trim =>".ltrim($trim, "Mad")."</br>";
echo "Right-side trim =>".rtrim($trim, "a")."</br>";
echo "Capitalized each first word in a sentence => ",$ucwords."</br>";
echo "String repeater func => ".$str_repeat."</br>";
echo "Sub-String output Taking a string out => ".$substr."</br>";
?>
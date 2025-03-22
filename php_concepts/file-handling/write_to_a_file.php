
<?php 

$new = "cse.txt";
$data = "Welcome maduka-pcm";
$file = fopen($new,'w');

if($file){
$write_data_to_file = fwrite($file,$data);
}

?>
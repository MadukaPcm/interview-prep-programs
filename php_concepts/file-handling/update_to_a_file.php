
<?php 

$my_file = "cse.txt";
$result = fopen($my_file, 'a');
$data = "</br>Mwanangu sana huyu jamaa";

$response = fwrite($result, $data);
if($response){
  echo "File updated successfully.";
}
?>

<?php 
ini_set("display_errors", 1);
ini_set("display_startup_errors", 1);

include('config.php');

if(isset($_GET['id'])){

  $user_id = $_GET['id'];

  $sql = "DELETE FROM users where id='$user_id'";

  $result = $conn->query($sql);

  if($result == TRUE){
    echo "USER Deleted successfully";
    header("Location: view.php");
  }
}

?>
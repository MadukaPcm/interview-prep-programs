
<?php 

ini_set('display_errors',1);
ini_set('display_arartup_errors',1);

include('config.php');

if(isset($_POST['update'])){

  $user_id = $_POST['id'];
  $first_name = $_POST['first_name'];
  $last_name = $_POST['last_name'];
  $email = $_POST['email'];
  $password = $_POST['password'];
  $gender = $_POST['gender'];

  $sql = "UPDATE users set first_name='$first_name', last_name='$last_name', email='$email', password='$password', gender='$gender' where id='$user_id'";

  $result = $conn->query($sql);

  if($result == TRUE){
    echo "Data updated successfully";
    header("Location: view.php");
  }
}

if(isset($_GET['id'])){   
  $id = $_GET['id'];

  $sql= "SELECT * FROM users where id='$id'";
  $result = $conn->query($sql);

  if($result->num_rows > 0){
    while($row = $result->fetch_assoc()){
      $first_name = $row['first_name'];
      $last_name = $row['last_name'];
      $email = $row['email'];
      $password = $row['password'];
      $gender = $row['gender'];
      $id = $row['id'];
    }
    ?>

    <html>
      <body>
      <h2>Update user</h2>
        <form action="" method="POST">
            <fieldset>
              <legend>Update user data</legend>
              <label>First Name: </label>
              <input type="text" name="first_name" value="<?php echo $first_name; ?>"/> </br></br>
              <input type="hidden" name="id" value="<?php echo $id; ?>"/>

              <label>Last Name: </label>
              <input type="text" name="last_name" value="<?php echo $last_name; ?>"/></br></br>

              <label>Email Address: </label>
              <input type="text" name="email" value="<?php echo $email; ?>"/></br></br>

              <label>Password: </label>
              <input type="text" name="password" value="<?php echo $password; ?>"/></br></br>

              <label>Gender: </label>
              <input type="radio" name="gender" value="MALE" <?php if($gender == "MALE") { echo "checked"; } ?>/> Male &nbsp 
              <input type="radio" name="gender" value="FEMALE <?php if($gender == "FEMALE") { echo "cehcked"; } ?>"/>Female</br></br>

              <input type="submit" name="update"/>
            </fieldset>
        </form>
      </body>
    </html>
   
  <?php 
  }
}else{
  header("Location: view.php");
}
?>
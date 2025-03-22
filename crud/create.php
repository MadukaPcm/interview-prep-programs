
<?php 

ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

include("config.php");

if(isset($_POST['submit'])){

  $first_name = trim($_POST['first_name']);
  $last_name = trim($_POST['last_name']);
  $email = trim($_POST['email']);
  $password = trim($_POST['password']);
  $gender = isset($_POST['gender']) ? $_POST['gender'] : null;
  $role = isset($_POST['role']) ? $_POST['role'] : null;

  $errors = []; 

  echo "Role ".$role;
  // echo "first_name".$first_name;
  // echo "last_name".$last_name;
  // echo "email".$email;
  // echo "password".$password;
  // echo "gender".$gender;

  if(empty($first_name)){    // str_word_count 
    $errors[] = "First name is required !!";
  }elseif(strlen($first_name) < 3){
    $errors[] = "The name is too short";
  }

  if(strlen($password) < 8){
    $errors[] = "Password should contain atleast 8 characters";
  }elseif(strlen($password) > 16){
    $errors[] = "Password can not exceed 16 characters";
  }

  if(empty($gender)){
    $errors[] = "Gender is required !!";
  }

  if(empty($email)){
    $errors[] = "Email is required";
  }else{
    // <!-- check if email exist -->
    $sql = "SELECT * FROM users WHERE email='$email'";
    $result = $conn->query($sql);
    if($result->num_rows > 0){
      $row = $result->fetch_assoc();
      echo "User exist email address is".$row['email'];
      $errors[] = "Email arleady exist";
    }
  }

  if(empty($errors)){
    $sql = "INSERT INTO users (first_name,last_name,email,password,gender) VALUES ('$first_name','$last_name','$email','$password','$gender')";

    $result = $conn->query($sql);

    echo "Echo result".$result;

    if($result == TRUE){

      echo "User inserted successfully";
      header("Location: view.php");
      exit();
      
    }else{
      echo "Failed to create user...".$result;
    }

    $conn->close();
  }
  
}
?>

<html>
  <header>CREATE USER PAGE</header>

  <body>
    <form action="" method="POST">
    <fieldset>
      <legend>User information</legend>
      <!-- Displaying errors from input form validation -->
      <?php 
        if(!empty($errors)){
          foreach($errors as $error){
            echo "<ul style='color:red;'>";
            echo $error;
            echo "</ul>";
          }
        }

      ?>

      <label>firt name:</label>
      <input type="text" name="first_name" placeholder="Omaran"/></br></br>

      <label>Last name:</label>
      <input type="text" name="last_name" placeholder="Aman"/></br></br>

      <label>Email:</label>
      <input type="text" name="email" placeholder="madukapcm@gmail.com"/></br></br>

      <label>Password:</label>
      <input type="password" name="password"/></br></br>

      <label>Gender:</label>
      <input type="radio" name="gender" value="MALE"/>MALE
      <input type="radio" name="gender" value="FEMALE"/>FEMALE </br></br>

      <label>Select registration user-type:</label>
      <select name="role">
        <option>---------</option>
        <option value="admin">Admin</option>
        <option value="user">User</option>
        <option value="student">Student</option>
      </select> </br></br>

      <input type="submit" name="submit" value="submit"/>
    </fieldset>
    </form>
  </body>
</html>


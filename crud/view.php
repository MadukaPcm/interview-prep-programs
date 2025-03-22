<?php 

ini_set("display_errors", 1);
ini_set("display_startup_errors", 1);

include("config.php");

$sql = "SELECT * FROM users";

$result = $conn->query($sql);

if($result == TRUE){
  echo "Data retrieved successfully";
}

?>

<html>
  <h1>CRUD PHP   &nbsp;&nbsp;&nbsp; <a href="create.php">Add User</a></h1>
  <body>
    <fieldset>
      <legend><h2>List of users</h2></legend>
      <table border="1" cellpadding="2" cellpadding="0">
      <thead>
        <tr>
          <th>Id</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Email Address</th>
          <th>Password</th>
          <th>Gender</th>
          <th>ACTIONS</th>
        </tr>
      </thead>

      <tbody>
        <?php 
          if($result->num_rows > 0){
            while($row = $result->fetch_assoc()){
        ?>

        <tr>
          <td><?php echo $row['id']; ?></td>
          <td><?php echo $row['first_name']; ?></td>
          <td><?php echo $row['last_name']; ?></td>
          <td><?php echo $row['email']; ?></td>
          <th><?php echo $row['password']; ?></th>
          <td><?php echo $row['gender']; ?></td>
          <td>
            <a href="update.php?id=<?php echo $row['id']; ?>"><button>update</button></a> &nbsp;
            <a href="delete.php?id=<?php echo $row['id']; ?>"><button>delete</button></a>
          </td>
        </tr>

        <?php 
          } 
        }
        ?>

      </tbody>
    </table>
    </fieldset>

  </body>
</html>


// base backend-url.
const url = "http://localhost:8080/departments";

// Querying data to database.
const departmentList = document.querySelector(".department-list");
let output = '';
const renderDepartments = (departments) => {
  departments.forEach(department => {

    output += `
      <div class="department-data">
        <p>Department Name : ${department.departmentName}</p>
        <p>Department Address : ${department.departmentAddress}</p>
        <p>Department Code : ${department.departmentCode}</p>
        <a href="#">Edit</a> &nbsp&nbsp <a href="#">Delete</a>
        <hr>
      </div>
    `;
  });
  departmentList.innerHTML = output;
}

// Posting data to database.
const createDepartmentForm = document.querySelector(".create-department");
const departmentName = document.getElementById('department_name');
const departmentAddress = document.getElementById('department_address');
const departmentCode = document.getElementById('department_code');


// Get Read the departments.
// Method: Get
fetch(url)
  .then(res => res.json())
  .then(data => renderDepartments(data));


// Post - Create department.
// Method: POST
createDepartmentForm.addEventListener('submit', (e) => {
  e.preventDefault();

  fetch(url, {
    method:'POST',
    headers:{
      'Content-Type':'application/json',
    },
    body:JSON.stringify({
      departmentName: departmentName.value, 
      departmentAddress: departmentAddress.value, 
      departmentCode: departmentCode.value
    })
  })  
  .then(res => res.json())
  .then(data => {
    const departmentArray = [];
    departmentArray.push(data);
    renderDepartments(departmentArray);
  })
  alert("Department added successfully !!");
})


// @CrossOrigin(origins = "*")
// @RestController
// public class DepartmentRestController {
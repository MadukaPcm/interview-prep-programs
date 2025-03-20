// base backend-url.
const url = "http://localhost:8080/departments";

// Querying data to database.
const departmentList = document.querySelector(".department-list");
let output = '';
const renderDepartments = (departments) => {
  departments.forEach(department => {

    output += `
      <div class="department-data" data-id="${department.id}">
       Department Name : <em class="dpt_name">${department.departmentName}</em> <br \>
       Department Address : <em class="dpt_address"> ${department.departmentAddress}</em> <br \>
       Department Code :  <em class="dpt_code">${department.departmentCode}</em> <br \>
        <a href="#" id="edit-department">Edit</a> &nbsp&nbsp <a href="#" id="delete-department">Delete</a>
        <hr>
      </div>
    `;
  });
  departmentList.innerHTML = output;
}

// Posting department to db.
const createDepartmentForm = document.querySelector(".create-department");
const departmentName = document.getElementById('department_name');
const departmentAddress = document.getElementById('department_address');
const departmentCode = document.getElementById('department_code');


// Editing department to db.
const btnSubmit = document.querySelector('.btn');

// Get Read the departments.
// Method: Get
fetch(url)
  .then(res => res.json())
  .then(data => renderDepartments(data));

// Delete the departments.
// Method: DELETE
departmentList.addEventListener('click',(e) => {
  e.preventDefault();

  let editDepartmentIsPressed = e.target.id == 'edit-department';
  let deleteDepartmentIsPressed = e.target.id == 'delete-department';

  let id = e.target.parentElement.dataset.id;
  console.log("department id ",id);

  if(deleteDepartmentIsPressed){
    fetch(`${url}/${id}`,{
      method: 'DELETE'
    });
    alert(`Department with id ${id} deleted successfully.`);
    location.reload();
  }

  if(editDepartmentIsPressed){
    console.log("department on-click id ",id);

    const parent = e.target.parentElement;
    let dptName = parent.querySelector('.dpt_name').textContent;
    let dptAddress = parent.querySelector('.dpt_address').textContent;
    let dptCode = parent.querySelector('.dpt_code').textContent;

    departmentName.value = dptName;
    departmentAddress.value = dptAddress;
    departmentCode.value = dptCode;
  }

  // Post - Update department.
  // Method: POST
  btnSubmit.addEventListener('click', (e) => {
    e.preventDefault();
    console.log("department update id ",id);

    if(id > 0){
      fetch(url, {
        method: 'POST',
        headers:{
          'Content-Type':'application/json',
        },
        body:JSON.stringify({
          departmentId: id, 
          departmentName: departmentName.value,
          departmentAddress: departmentAddress.value,
          departmentCode: departmentCode.value
        })
      })
      .then(res => res.json())
      .then(() =>{
        alert("Department updated successfully !i.");
        location.reload()
      })
    }
  })

})


// Post - Create department.
// Method: POST
createDepartmentForm.addEventListener('submit', (e) => {
  e.preventDefault();

  console.log("Posting ");

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

    alert("Department added successfully !!");

    departmentName.value = '';
    departmentAddress.value = '';
    departmentCode.value = '';
  })
  .catch(error => {
    console.error('Error: ',error);
  })
})


// @CrossOrigin(origins = "*")
// @RestController
// public class DepartmentRestController {
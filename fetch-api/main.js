// base backend-url.
const url = "http://localhost:8081/departments";

// Querying data to database.
const departmentList = document.querySelector(".department-list");

const renderDepartments = (departments) => {
  let index = 0;
  output = `
    <table border="1" cellpadding="2" cellspacing="1">
      <thead>
        <tr>
          <th>#SN</th>
          <th>Name</th>
          <th>Address</th>
          <th>Code</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
  `;
  departments.forEach(department => {
    index ++ ;
    output += `
      <tr class="department-data" data-id="${department.id}">
        <td>${index}</td>
        <td class="dpt_name">${department.departmentName}</td>
        <td class="dpt_address">${department.departmentAddress}</td>
        <td class="dpt_code">${department.departmentCode}</td>
        <td>
          <a href="#" id="edit-department">Edit</a> &nbsp
          <a href="#" id="delete-department">Delete</a>
        </td>
      </tr>
    `;
  });
  output += `
    </tbody>
  </table>
  `;
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

  console.log(editDepartmentIsPressed);
  console.log(deleteDepartmentIsPressed);

  let id = e.target.closest("tr").dataset.id;
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

    const row = e.target.closest("tr");
    let dptName = row.querySelector('.dpt_name').textContent;
    let dptAddress = row.querySelector('.dpt_address').textContent;
    let dptCode = row.querySelector('.dpt_code').textContent;

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
    location.reload();

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
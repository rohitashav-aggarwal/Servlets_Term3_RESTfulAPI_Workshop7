const firstName = document.getElementById("fName").value;
const lastName = document.getElementById("lName").value;
const address_user = document.getElementById("address").value;
const city = document.getElementById("city").value;
const province = document.getElementById("province").value;
const postalCode = document.getElementById("postal").value;
const country = document.getElementById("country").value;
const homePhone = document.getElementById("homePhone").value;
const busPhone = document.getElementById("busPhone").value;
const email = document.getElementById("Email").value;
const username = document.getElementById("username").value;
const password = document.getElementById("password").value;
const form = document.getElementById('postData').value;
const error = document.getElementById('error').value;

form.addEventListener('submit', (e) =>{
    // if(validateForm()){
    //     e.preventDefault();
    // }else{
        postData();
    // }
})

function validateForm(){
    if(country === "" || country == null){
        alert("Country must not be empty");
        return true;
    }
}

async function postData(){

    let url = "http://localhost:9493/Servlets_Term3_RESTfulAPI_Workshop7_war_exploded/api/registeruser";
    let successUrl = 'http://localhost:9493/Servlets_Term3_RESTfulAPI_Workshop7_war_exploded/loggedUser.html';
    let response = await fetch(url, {
        method: 'POST',
        headers :{firstName: firstName, lastName: lastName, address: address_user, city: city, province: province,
            postal: postalCode, country: country, homephone: homePhone, busphone: busPhone, email: email, username: username, password:password
        }
    });
    if (response.status === 200 || response.ok ) {
        window.location.assign(successUrl);
        localStorage.setItem("username", username);
    } else {
        alert("Registration failed, please try again");
    }
}
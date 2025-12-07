// // alert("Calling app.js file content")

// let age = 25;
// const name1 = "Veda";
// const number1 = "12234";
// const number2 = 12234;

// console.log(typeof(age)); //number
// console.log(typeof(name1)); //String
// console.log(typeof(number1)); //String

// console.log(number1 == number2); // True because == checks only the value
// console.log(number1 === number2); // False because === checks both the value and the DT as well

// let toIntAge = Number(number1);
// console.log("The type of the number1 is: " + typeof(number1)); //String typecasting

document.getElementById('myForm').addEventListener('submit', function(event) {
    
    event.preventDefault();
    
    const minNameLength = 3;
    
    const name = document.getElementById('name').value;
    if (name.trim() === "") {
        console.error("Name FAILED: Name is required.");
    } else if (name.length < minNameLength) {
        console.error(`Name FAILED: Must be at least ${minNameLength} characters long.`);
    } else {
        console.log("Name PASSED:", name);
    }

    const age = document.getElementById('age').value;
    if (age <= 0 || isNaN(age) || age.trim() === "") {
        console.error("Age FAILED: Not a positive number.");
    } else {
        console.log("Age PASSED:", age);
    }

    const choice = document.querySelector('input[name="choice"]:checked');
    if (!choice) {
        console.error("Choice FAILED: Nothing selected.");
    } else {
        console.log("Choice PASSED:", choice.value);
    }
});


    // sample user data
let userName = " Niti Dwivedi";
let age = "34";
let isSubscribed = "true";
let number1 ="40";
let number2 = "30";
// for the validation
function validateForm(userName , age , isSubscribed)
{
let userNameType = typeof userName;
let ageType = typeof age;
let isSubscribedType = typeof isSubscribed;

console.log("UserName :" + userName + "Data Type "  , userNameType);
console.log("Age  :" + age+ "Data Type "  , ageType);
console.log("isSubsribed :" + isSubscribed + "Data Type "  , isSubscribedType);

//conversion
age = Number(age);
isSubscribed = isSubscribed === "true";

console.log("Age  :" + age+ "After conversion the Data Type is  "  , typeof age);
console.log("IsSubscribed :" +isSubscribed + "Data Type "  , typeof isSubscribed);
}
validateForm(userName , age , isSubscribed)
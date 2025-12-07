const { Student, StudentManager } = require("./studentManager")

let manager = new StudentManager()

manager.addStudent(new Student(1, "Veda", 20))
manager.addStudent(new Student(2, "Bhaskara", 21))

console.log(manager.getAllStudents())
console.log(manager.getStudentById(1))
console.log(manager.updateStudent(1, { name: "Vishnu" }))
console.log(manager.getStudentById(1))
console.log(manager.deleteStudent(2))
console.log(manager.getAllStudents())

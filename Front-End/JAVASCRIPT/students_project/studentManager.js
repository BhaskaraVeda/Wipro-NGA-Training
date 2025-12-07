// studentManager.js
class Student {
    constructor(id, name, age) {
      //update the constructor
      this.id = id
      this.name = name
      this.age = age

    }
  }
  
  class StudentManager {                                
    constructor() {
      this.students =[]
    }
  
    addStudent(student) {
      if(this.students.find(s => s.id === student.id)) return "ID already exists"
      this.students.push(student)
      return "Student added"
      
    }
  
    getStudentById(id) {
      return this.students.find(s => s.id === id) || "Student not found"
      
    }
  
    updateStudent(id, updatedInfo) {
      let s = this.students.find(st => st.id === id)
      if(!s) return "Student not found"
      if (updatedInfo.name) s.name = updatedInfo.name
      if(updatedInfo.age) s.age = updatedInfo.age
      return "Student updated"
    }
  
    deleteStudent(id) {
      let index = this.students.findIndex(s => s.id === id)
      if (index === -1) return "Student not found"
      this.students.splice(index, 1)
      return "Student deleted"
    }
  
    getAllStudents() {
      return this.students
    }
  }
  
  module.exports = { Student, StudentManager };
  
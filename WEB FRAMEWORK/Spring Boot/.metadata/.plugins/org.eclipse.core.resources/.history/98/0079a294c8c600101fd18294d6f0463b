package com.example.taskmanager.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

@ControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(MethodArgumentNotValidException.class)
 public ResponseEntity<?> v(MethodArgumentNotValidException e){
  String m = e.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
  return ResponseEntity.status(400).body(m);
 }

 @ExceptionHandler(TaskNotFoundException.class)
 public ResponseEntity<?> nf(TaskNotFoundException e){
  return ResponseEntity.status(404).body(e.getMessage());
 }

 @ExceptionHandler(com.fasterxml.jackson.databind.exc.InvalidFormatException.class)
 public ResponseEntity<?> f(Exception e){
  return ResponseEntity.status(400).body("Invalid date format yyyy-MM-dd");
 }
}
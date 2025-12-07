package com.example.controller;

import com.example.entity.Task;
import com.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TeamLeadController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/teamlead")
    public String dashboard() {
        return "teamlead-dashboard";
    }

    @PostMapping("/teamlead/create")
    public String create(Task task, RedirectAttributes ra) {
        taskService.createTask(task);
        ra.addFlashAttribute("msg","✅ Task Created Successfully");
        return "redirect:/teamlead";
    }

    @PostMapping("/teamlead/assign")
    public String assign(@RequestParam Long taskId,
                         @RequestParam Long developerId,
                         RedirectAttributes ra) {
        taskService.assignTask(taskId, developerId);
        ra.addFlashAttribute("msg","✅ Task Assigned to Developer " + developerId);
        return "redirect:/teamlead";
    }
}

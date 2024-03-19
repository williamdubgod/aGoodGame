package br.com.fiap.epictask.task;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tasks")
public class TaskController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("tasks", List.of(
            "Level 1",
            "Level 2",
            "Level 3",
            "Unit Test"
        ));
        return "task/index";
    }
    
}

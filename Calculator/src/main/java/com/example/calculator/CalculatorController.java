package main.java.com.example.calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {
    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }
        
        @GetMapping("/")
        public String index() 
        {
            return "index";
        }
        @PostMapping("/submit")
        public String add(@RequestParam int num1, @RequestParam int num2, Model model) {
            int result = calculator.add(num1, num2);
            model.addAttribute("result", result);
            return "index";
        }
    }


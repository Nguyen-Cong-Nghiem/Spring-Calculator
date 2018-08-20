package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calcutor {
    @RequestMapping("/calculator")
    public String calcalator() {
        return "index";
    }

    @GetMapping("/calcu")
    public String calcu(@RequestParam("number1") double number1,
                        @RequestParam("number2") double number2,
                        @RequestParam("dau") String dau,
                        Model model) {
        double result = calcul(number1, number2, dau);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        return "index";
    }


    private double calcul(double number1, double number2, String dau) {
        switch (dau) {
            case "Addition":
                return number1 + number2;
            case "Subtraction":
                return number1 - number2;
            case "Multiplication":
                return number1 * number2;
            case "Division":
                return number1/number2;
                default:
                    throw new RuntimeException();
        }
    }
}

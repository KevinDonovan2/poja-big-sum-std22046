import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@RestController
public class SumController {

    @GetMapping("/sum")
    public String getSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        try {
            BigInteger numA = new BigInteger(a);
            BigInteger numB = new BigInteger(b);

            BigInteger sum = numA.add(numB);
            
            return sum.toString();
        } catch (NumberFormatException e) {
            return "Veuillez fournir des nombres valides.";
        }
    }
}

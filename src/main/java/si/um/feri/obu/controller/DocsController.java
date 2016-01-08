package si.um.feri.obu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocsController {

    @RequestMapping(value = {"/docs", "/"})
    public String getSwaggerView() {
        return "redirect:/swagger-ui.html";
    }

}

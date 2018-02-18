package backend.Controllers;

import backend.Entities.Band;
import backend.Service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BandService bandService;

    @GetMapping(value = "/first")
    public Band testRun(){
        Band band = new Band();
        band.setMembers("Andriy");
        return band;
    }

    @GetMapping(value = "/second")
    public String testDb(){
        bandService.test();
        return "Test";
    }

}
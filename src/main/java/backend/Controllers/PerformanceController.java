package backend.Controllers;

import backend.Entities.Performance;
import backend.Service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/performance")
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody Performance performance){
        performanceService.createPerformance(performance);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody Performance performance) {
        performanceService.updatePerformance(performance);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody Performance performance) {
        performanceService.deletePerformance(performance);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public Performance findById(@PathVariable int id) {
        return performanceService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<Performance> findAll() {
        return performanceService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<Performance> performances)
    {
        performanceService.deleteAll(performances);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package backend.Controllers;

import backend.Entities.Tour;
import backend.Service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tour")
public class TourController {

    @Autowired
    private TourService tourService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody Tour tour){
        tourService.createTour(tour);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody Tour tour) {
        tourService.updateTour(tour);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody Tour tour) {
        tourService.deleteTour(tour);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public Tour findById(@PathVariable int id) {
        return tourService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<Tour> findAll() {
        return tourService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<Tour> tours)
    {
        tourService.deleteAll(tours);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

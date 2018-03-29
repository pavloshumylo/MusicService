package backend.Controllers;

import backend.Entities.TourDetailPlace;
import backend.Service.TourDetailPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tourDetail")
public class TourDetailPlaceController {

    @Autowired
    private TourDetailPlaceService tourDetailPlaceService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody TourDetailPlace tourDetailPlace){
        tourDetailPlaceService.createTourDetailPlace(tourDetailPlace);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody TourDetailPlace tourDetailPlace) {
        tourDetailPlaceService.updateTourDetailPlace(tourDetailPlace);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody TourDetailPlace tourDetailPlace) {
        tourDetailPlaceService.deleteTourDetailPlace(tourDetailPlace);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public TourDetailPlace findById(@PathVariable int id) {
        return tourDetailPlaceService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<TourDetailPlace> findAll() {
        return tourDetailPlaceService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<TourDetailPlace> tourDetailPlaces)
    {
        tourDetailPlaceService.deleteAll(tourDetailPlaces);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

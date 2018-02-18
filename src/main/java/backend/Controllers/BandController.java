package backend.Controllers;

import backend.Entities.Band;
import backend.Service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/band")
public class BandController {

    @Autowired
    private BandService bandService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody Band band){
        bandService.createBand(band);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody Band band) {
        bandService.updateBand(band);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody Band band) {
        bandService.deleteBand(band);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public Band findById(@PathVariable int id) {
        return bandService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<Band> findAll() {
        return bandService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<Band> bands)
    {
        bandService.deleteAll(bands);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
package backend.Controllers;

import backend.Entities.BandPhoto;
import backend.Service.BandPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bandPhoto")
public class BandPhotoController {

    @Autowired
    private BandPhotoService bandPhotoService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody BandPhoto bandPhoto){
        bandPhotoService.createBandPhoto(bandPhoto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody BandPhoto bandPhoto) {
        bandPhotoService.updateBandPhoto(bandPhoto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody BandPhoto bandPhoto) {
        bandPhotoService.deleteBandPhoto(bandPhoto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public BandPhoto findById(@PathVariable int id) {
        return bandPhotoService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<BandPhoto> findAll() {
        return bandPhotoService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<BandPhoto> bandPhotos)
    {
        bandPhotoService.deleteAll(bandPhotos);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package backend.Controllers;

import backend.Entities.UserPhoto;
import backend.Service.UserPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userPhoto")
public class UserPhotoController {

    @Autowired
    private UserPhotoService userPhotoService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody UserPhoto userPhoto){
        userPhotoService.createUserPhoto(userPhoto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody UserPhoto userPhoto) {
        userPhotoService.updateUserPhoto(userPhoto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody UserPhoto userPhoto) {
        userPhotoService.deleteUserPhoto(userPhoto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public UserPhoto findById(@PathVariable int id) {
        return userPhotoService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<UserPhoto> findAll() {
        return userPhotoService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<UserPhoto> userPhotos)
    {
        userPhotoService.deleteAll(userPhotos);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

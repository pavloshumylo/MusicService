package backend.Controllers;

import backend.Entities.MessageAboutTour;
import backend.Service.MessageAboutTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageAboutTourController {

    @Autowired
    private MessageAboutTourService messageAboutTourService;

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody MessageAboutTour messageAboutTour){
        messageAboutTourService.createMessageAboutTour(messageAboutTour);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Void> update(@RequestBody MessageAboutTour messageAboutTour) {
        messageAboutTourService.updateMessageAboutTour(messageAboutTour);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> delete(@RequestBody MessageAboutTour messageAboutTour) {
        messageAboutTourService.deleteMessageAboutTour(messageAboutTour);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public MessageAboutTour findById(@PathVariable int id) {
        return messageAboutTourService.findBandById(id);
    }

    @GetMapping(value = "/findAll")
    public List<MessageAboutTour> findAll() {
        return messageAboutTourService.findAll();
    }

    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<Void> deleteAll(@RequestBody List<MessageAboutTour> messageAboutTours)
    {
        messageAboutTourService.deleteAll(messageAboutTours);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

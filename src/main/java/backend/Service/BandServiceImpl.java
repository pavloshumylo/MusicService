package backend.Service;

import backend.DAO.BandDAO;
import backend.Entities.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;

@Service
@Transactional
public class BandServiceImpl implements BandService {

    private BandDAO bandDAO;

    @Autowired
    public void setBandDAO(BandDAO bandDAO) {
        this.bandDAO = bandDAO;
    }

    @Override
    public void test() {
        Band band = new Band();
        Date date = Date.from(Instant.now());
        band.setDateOfCreate(date);
        band.setDescription("Description");
        band.setMembers("Members");
        bandDAO.create(band);
    }
}

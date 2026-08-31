package mk.ukim.finki.wp.kol2024g1.repository;


import mk.ukim.finki.wp.kol2024g1.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
//    List<Manufacturer> findByNameContainingIgnoreCase(String text);
}
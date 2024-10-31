package au.id.wattle.chapman.strangler.demoMonolith.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Country {
    
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  
  @Column(unique = true)
  private String name;

  @Column(unique = true)
  private String code;


}

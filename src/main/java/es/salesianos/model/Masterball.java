package es.salesianos.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Masterball extends AbstractBall{
 
	public  Masterball() {
		 setRate(100);
		 setName("Masterball");
	}
}

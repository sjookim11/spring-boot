package io.sunju.learning.springboot.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book extends AbstractPersistable<Long> {
	
	private String name;
	private String isbn13; 
	private String isbn10;
	
	
	


}

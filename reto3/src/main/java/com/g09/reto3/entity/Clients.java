package com.g09.reto3.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.sun.istack.NotNull;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
//import java.util.List;

@Entity
@Table(name="clients")
@Getter
@Setter
@NoArgsConstructor


public class Clients implements Serializable{

@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
@Column(name="client_id")
private Long idClient;

@Column(name="email")
@NotNull
private String email;

@Column(name="password")
@NotNull
private String password;

@Column(name="name")
@NotNull
private String name;

@Column(name="age")
@NotNull
private int age;

/*@OneToMany( cascade = CascadeType.ALL)
private List<Message> messages;*/





    
}

package com.web.entidade;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Empregado extends Pessoa implements Serializable{
    
    private double salario;
    
}

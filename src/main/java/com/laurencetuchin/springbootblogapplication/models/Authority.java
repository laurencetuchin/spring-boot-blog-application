package com.laurencetuchin.springbootblogapplication.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Authority implements Serializable {


    @Id
    @Column(length = 16)
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}

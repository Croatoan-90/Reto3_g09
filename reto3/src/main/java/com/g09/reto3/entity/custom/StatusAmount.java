package com.g09.reto3.entity.custom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusAmount {

    private int completed;
    private int cancelled;

    public StatusAmount(int completed, int cancelled){
        this.completed=completed;
        this.cancelled=cancelled;
    }

    
}
/*

STATUSAMOUNT
@Getter
@Setter
    private int completed
    private int cancelled

crear constructor*





*/ 
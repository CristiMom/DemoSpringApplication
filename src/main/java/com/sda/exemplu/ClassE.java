package com.sda.exemplu;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Component
public class ClassE {

    @Autowired private ClassA classA;
    @Autowired private ClassB classB;
    @Autowired private ClassC classC;
    @Autowired private ClassD classD;

    // 1. CONSTRUCTOR INJECTION
    @Autowired
    public ClassE(ClassA classA, ClassB classB, ClassC classC, ClassD classD) {
        this.classA = classA;
        this.classB = classB;
        this.classC = classC;
        this.classD = classD;
    }

    // 2. SETTER INJECTION
    @Autowired
    public void setClassA(ClassA classA) {
        this.classA = classA;
    }


}

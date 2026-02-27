package com.pm;

import com.pm.impl.GamingComputerBuilder;
import com.pm.impl.ProfessionalComputerBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ProfessionalComputerBuilder professionalComputerBuilder = new ProfessionalComputerBuilder();

        ComputerDirector computerDirector = new ComputerDirector();
        computerDirector.construct(gamingComputerBuilder);
        computerDirector.construct(professionalComputerBuilder);

        String gamingComputer = gamingComputerBuilder.getResult();
        String  professionalComputer = professionalComputerBuilder.getResult();

        System.out.println(gamingComputer);
        System.out.println(professionalComputer);


    }
}
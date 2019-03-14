package karlo.springframework.sfgpetclinic.bootstrap;

import karlo.springframework.sfgpetclinic.services.OwnerService;
import karlo.springframework.sfgpetclinic.services.PetTypeService;
import karlo.springframework.sfgpetclinic.services.SpecialityService;
import karlo.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}

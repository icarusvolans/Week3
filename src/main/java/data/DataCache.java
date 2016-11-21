package data;
import entities.*;
import java.util.*;
import java.time.LocalDate;
/**
 * Created by icarusvolans on 11/21/16.
 */
public class DataCache {

    private static DataCache instance = null;
    private static HashMap<Long, Pet> petsHashMap;
    private static HashMap<Long, Owner> ownersHashMap;
    private static HashMap<Long, Appointment> appointmentsHashMap;

    private DataCache() {
        // Exists only to defeat instantiation.
    }
    public static synchronized DataCache getInstance() {
        if(instance == null) {
            instance = new DataCache();
        }
        return instance;
    }

    public static HashMap<Long, Pet> getPets() {
        if(petsHashMap==null || petsHashMap.isEmpty()) {
            loadDataCache();
        }
        return petsHashMap;
    }

    public static Pet getPet(Long petId) {
        if(petsHashMap==null || petsHashMap.isEmpty()) {
            loadDataCache();
        }
        Pet pet = null;
        if(petsHashMap.containsKey(petId)) {
            pet = petsHashMap.get(petId);
        }
        return pet;
    }

    public static HashMap<Long, Owner> getOwners() {
        if(ownersHashMap==null || ownersHashMap.isEmpty()) {
            loadDataCache();
        }
        return ownersHashMap;
    }

    public static Owner getOwner(Long ownerId) {
        if(ownersHashMap==null || ownersHashMap.isEmpty()) {
            loadDataCache();
        }
        Owner owner = null;
        if(ownersHashMap.containsKey(ownerId)) {
            owner = ownersHashMap.get(ownerId);
        }
        return owner;
    }

    public static HashMap<Long, Appointment> getAppointments() {
        if(appointmentsHashMap==null || appointmentsHashMap.isEmpty()) {
            loadDataCache();
        }
        return appointmentsHashMap;
    }

    public static Appointment getAppointment(Long appointmentId) {
        if(appointmentsHashMap==null || appointmentsHashMap.isEmpty()) {
            loadDataCache();
        }
        Appointment appointment = null;
        if(appointmentsHashMap.containsKey(appointmentId)) {
            appointment = appointmentsHashMap.get(appointmentId);
        }
        return appointment;
    }

    private static void loadDataCache() {
        petsHashMap = new HashMap();
        ownersHashMap = new HashMap();
        appointmentsHashMap = new HashMap();
        Long ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Bob","Denver","801-111-2222","123 Desert Island"));
        Long petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Nemo",LocalDate.of(2014,7,15),Pet.PetType.FISH,ownerId));
        Long appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,9,15), Appointment.AptType.CHECKUP, ownerId, petId));
        ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Jane","Doe","801-333-4444","345 Avenue A."));
        petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Kat",LocalDate.of(2010,3,1),Pet.PetType.CAT,ownerId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,7,30), Appointment.AptType.SURGERY, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,8,15), Appointment.AptType.CHECKUP, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,8,28), Appointment.AptType.CHECKUP, ownerId, petId));
        ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Master","Chief","801-555-6666","678 Halo Way"));
        petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Cortana",LocalDate.of(1999,5,12),Pet.PetType.BIRD,ownerId));
        ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Santa","Clause","801-777-8888","1 North Pole"));
        petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Rudolph",LocalDate.of(1980,12,25),Pet.PetType.DOG,ownerId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,8,15), Appointment.AptType.GROOM, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,9,5), Appointment.AptType.CHECKUP, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,10,15), Appointment.AptType.GROOM, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,12,15), Appointment.AptType.GROOM, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,2,15), Appointment.AptType.GROOM, ownerId, petId));
    }
}

package com.petVet.servlets;

import com.petVet.data.DataCacheJson;
import com.petVet.entities.Owner;
import com.petVet.entities.Pet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String uri = request.getRequestURI();
        System.out.println("Requested URI: "+uri);

        String jspName = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println("JSP Name: "+jspName);

        if(jspName.equalsIgnoreCase("viewAllPets")) {
            ArrayList<Pet> pets = DataCacheJson.getPets();
            request.setAttribute("pets",pets);
        } else if(jspName.equalsIgnoreCase("viewPet") || jspName.equalsIgnoreCase("editPet")) {
            String petId = request.getParameter("petid");
            Pet pet = DataCacheJson.getPet(petId);
            request.setAttribute("pet",pet);
        } else if(jspName.equalsIgnoreCase("addNewPet")) {
            request.setAttribute("petTypes", Pet.PetType.values());
        } else if(jspName.equalsIgnoreCase("saveNewPet")) {
            Pet saveNewPet = new Pet();
            saveNewPet.setName(request.getParameter("name"));
            saveNewPet.setOwnerId(request.getParameter("ownerid"));
            saveNewPet.setPetType(Pet.PetType.valueOf(request.getParameter("pettype")));
            saveNewPet.setPetId(System.currentTimeMillis()+"-"+saveNewPet.getName().charAt(0));
            DataCacheJson.setPet(saveNewPet);
            jspName = "viewAllPets";
//        } else if(jspName.equalsIgnoreCase("editPet")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("viewAllOwners")) {
            ArrayList<Owner> owners = DataCacheJson.getOwners();
            request.setAttribute("owners",owners);
        } else if(jspName.equalsIgnoreCase("viewOwner") || jspName.equalsIgnoreCase("editOwner")) {
            String ownerId = request.getParameter("ownerid");
            Owner owner = DataCacheJson.getOwner(ownerId);
            request.setAttribute("owner",owner);
        } else if(jspName.equalsIgnoreCase("addNewOwner")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("saveNewOwner")) {
            Owner saveNewOwner = new Owner();
            saveNewOwner.setFirstName(request.getParameter("firstname"));
            saveNewOwner.setLastName(request.getParameter("lastname"));
            saveNewOwner.setPhone(request.getParameter("phone"));
            saveNewOwner.setAddress(request.getParameter("address"));
            saveNewOwner.setOwnerId(System.currentTimeMillis()+"-"+saveNewOwner.getFirstName().charAt(0)+saveNewOwner.getLastName().charAt(0));
            DataCacheJson.setOwner(saveNewOwner);
            jspName = "viewAllOwners";
        } else if (jspName.equalsIgnoreCase("updateOwner")) {
            String ownerId = request.getParameter("ownerid");
            Owner updateOwner = DataCacheJson.getOwner(ownerId);
            updateOwner.setFirstName(request.getParameter("firstname"));
            updateOwner.setLastName(request.getParameter("lastname"));
            updateOwner.setPhone(request.getParameter("phone"));
            updateOwner.setAddress(request.getParameter("address"));
            DataCacheJson.setOwner(updateOwner);
            jspName = "viewAllOwners";
        }
//        else if(jspName.equalsIgnoreCase("editOwner")) {
//            String ownerId = request.getParameter("ownerid");
//            Owner owner = DataCacheJson.getOwner(ownerId);
//            request.setAttribute("owner",owner);
//        }

        RequestDispatcher view = request.getRequestDispatcher("/customers/"+jspName+".jsp");
        view.forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request,response);
    }
}

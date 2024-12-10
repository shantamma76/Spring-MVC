package com.xworkz.components;
import com.xworkz.dto.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DecComponent {

    public DecComponent() {
        System.out.println("No-arg const in FormComponent");
    }

    @RequestMapping("scholarship")
    public String applyScholarship(ScholarshipDTO scholarshipDTO) {
        System.out.println("running applyScholarship");
        System.out.println(scholarshipDTO);
        return "scholarshipForm.jsp";
    }

    @RequestMapping("job")
    public String applyJob(JobDTO jobDTO) {
        System.out.println("running applyJob");
        System.out.println(jobDTO);
        return "jobForm.jsp";
    }

    @RequestMapping("organDonation")
    public String donateOrgan(OrganDonationDTO organDonationDTO) {
        System.out.println("running donateOrgan");
        System.out.println(organDonationDTO);
        return "organDonationForm.jsp";
    }

    @RequestMapping("matrimony")
    public String applyMatrimony(MatrimonyDTO matrimonyDTO) {
        System.out.println("running applyMatrimony");
        System.out.println(matrimonyDTO);
        return "matrimonyForm.jsp";
    }

    @RequestMapping("hotelRoom")
    public String bookHotelRoom(HotelRoomDTO hotelRoomDTO) {
        System.out.println("running bookHotelRoom");
        System.out.println(hotelRoomDTO);
        return "hotelRoomForm.jsp";
    }

   /* @RequestMapping("bank")
    public String bankAccount(BankAccountDto bankAccountDto) {
        System.out.println("running bankAccount");
        System.out.println(bankAccountDto);
        return "bankAccount.jsp";
    } */
/*
    @RequestMapping("deceased")
    public String deathCertificate(DeathCertificateDTO deathCertificateDTO) {
        System.out.println("Running deathCertificate");
        System.out.println(deathCertificateDTO);
        return "deathCertificate.jsp";
    }

    @RequestMapping("hospital")
    public String hospital(HospitalDTO hospitalDTO){
        System.out.println("Running hospital");
        System.out.println(hospitalDTO);
        return  "hospital.jsp";
    }

    @RequestMapping("pass")
    public String passport(PassportDTO passportDTO){
        System.out.println("Running Passport");
        System.out.println(passportDTO);
        return "passport.jsp";
    }
   */

}



